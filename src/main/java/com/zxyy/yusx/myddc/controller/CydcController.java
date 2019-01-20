package com.zxyy.yusx.myddc.controller;

import com.zxyy.yusx.myddc.model.*;
import com.zxyy.yusx.myddc.result.AjaxResult;
import com.zxyy.yusx.myddc.service.ICydcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.StringUtil;

import java.util.*;

@RequestMapping("/cydc")
@RestController
public class CydcController {

    @Autowired
    private ICydcService cydcService;

    @RequestMapping(value = "/getalldetail",method = RequestMethod.GET)
    public AjaxResult selectAllDetail(){
        AjaxResult result = new AjaxResult();

        List<CydcDetailDto> satisfyDetail = cydcService.getSatisfyDetail(new HashMap());

        if(satisfyDetail != null && satisfyDetail.size() > 0){
            result.success(satisfyDetail);
        }else{
            result.failure();
        }
        return result;
    }

    @RequestMapping(value = "/getdetail",method = RequestMethod.GET)
    public AjaxResult selectSatisfyDetail(@RequestParam String kshi, @RequestParam String startTime, @RequestParam String endTime){
        AjaxResult result = new AjaxResult();
        Map map = new HashMap();
        if(StringUtil.isNotEmpty(kshi)){
            map.put("kshi",kshi);
        }
        if(StringUtil.isNotEmpty(startTime)){
            map.put("startTime",startTime);
        }
        if(StringUtil.isNotEmpty(endTime)){
            map.put("endTime",endTime);
        }
        List<CydcDetailDto> satisfyDetail = cydcService.getSatisfyDetail(map);

        if(satisfyDetail != null && satisfyDetail.size() > 0){
            result.success(satisfyDetail);
        }else{
            result.failure();
        }
        return result;
    }

    @RequestMapping(value = "/getbycondition",method = RequestMethod.GET)
    public AjaxResult selectAllSatisfy(@RequestParam String kshi, @RequestParam String startTime, @RequestParam String endTime){
        AjaxResult result = new AjaxResult();
        Map map = new HashMap();
        if(StringUtil.isNotEmpty(kshi)){
            map.put("kshi",kshi);
        }
        if(StringUtil.isNotEmpty(startTime)){
            map.put("startTime",startTime);
        }
        if(StringUtil.isNotEmpty(endTime)){
            map.put("endTime",endTime);
        }
        List<CydcDto> satisfyByCondition = cydcService.getSatisfyByCondition(map);
        if(satisfyByCondition != null && satisfyByCondition.size() > 0){
            result.success(satisfyByCondition);
        }else{
            result.failure();
        }
        return result;
    }

    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public AjaxResult selectAllSatisfy(){
        AjaxResult ar = new AjaxResult();
        List<CydcDto> cydcDtos = cydcService.selectAllSatisfy();
        if(cydcDtos != null && cydcDtos.size() > 0){
            ar.success(cydcDtos);
        }else{
            ar.failure();
        }
        return ar;
    }

    @RequestMapping(value = "/addcydc",method = RequestMethod.POST)
    public AjaxResult addCydc(@RequestBody CydcVo cyuan){

        AjaxResult ar = new AjaxResult();
        Cydc cydc = null;
        String cydcid = UUID.randomUUID().toString();
        if(cyuan != null ){
            cydc = new Cydc();
            cydc.setId(cydcid);
            cydc.setDept(cyuan.getKshi());
            cydc.setYjian(cyuan.getYjian());
            cydc.setSjhao(cyuan.getSjhao());
            cydc.setZyhao(cyuan.getZyhao());

            List<CygroupVo> dcha = cyuan.getDcha();
            Cygroup cygroup = null;
            ArrayList<Cygroup> cygroups = new ArrayList<>();
            ArrayList<Cyitem> cyitems = cyitems = new ArrayList<>();;
            if(dcha != null && dcha.size()>0){
                for(CygroupVo vo : dcha){
                    cygroup = new Cygroup();
                    String groupid =UUID.randomUUID().toString();
                    cygroup.setId(groupid);
                    cygroup.setGroupname(vo.getGroupname());
                    cygroup.setCyid(cydcid);

                    List<CyitemVo> itemlist = vo.getItemlist();
                    Cyitem cyitem =null;
                    //cyitems = new ArrayList<>();
                    if(itemlist != null && itemlist.size() >0){
                        for(CyitemVo ivo : itemlist){
                            cyitem = new Cyitem();
                            String itemid =UUID.randomUUID().toString();
                            cyitem.setId(itemid);
                            cyitem.setItemname(ivo.getItemname());
                            cyitem.setItemscore(ivo.getItemscore());
                            cyitem.setGid(groupid);
                            //存item
                            //cydcService.saveItem(cyitem);
                            cyitems.add(cyitem);
                        }
                    }
                    //存group
                    //cydcService.saveGroup(cygroup);
                    cygroups.add(cygroup);
                }
            }
            //存cydc
            cydc.setCreatetime(new Date());
            //int i = cydcService.saveCydc(cydc);
            int i = cydcService.saveAllCd(cydc, cygroups, cyitems);
            if(i > 0 ){
                ar.success();
            }else {
                ar.failure();
            }
        }
        return ar;
    }
}
