package com.zxyy.yusx.myddc.controller;

import com.zxyy.yusx.myddc.model.*;
import com.zxyy.yusx.myddc.result.AjaxResult;
import com.zxyy.yusx.myddc.service.IZgongDchaService;
import com.zxyy.yusx.myddc.service.IZgongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
@RequestMapping("/zgong")
public class ZGongController {

    @Autowired
    private IZgongService zgongService;

    @Autowired
    private IZgongDchaService zgongDchaService;

    @RequestMapping(value = "/dcmonth",method = RequestMethod.GET)
    public AjaxResult getDcMonth(@RequestParam String username){
        AjaxResult ajaxResult = new AjaxResult();
        List<Zgong> zgongs = zgongService.selectDcMonth(username);
        if(zgongs != null && zgongs.size()>0){
            ajaxResult.failure();
        }else {
            ajaxResult.success();
        }
        return ajaxResult;
    }

    @RequestMapping(value = "/dcdetail",method = RequestMethod.GET)
    public AjaxResult getDcDetail(@RequestParam String kshi, @RequestParam String startTime, @RequestParam String endTime){
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
        List<ZgongDcDetail> dcDetail = zgongService.getZgongDcDetail(map);
        if(dcDetail != null && dcDetail.size() >0){
            result.success(dcDetail);
        }
        return result;
    }

    @RequestMapping(value = "/countbycondition",method = RequestMethod.GET)
    public AjaxResult getDcxsByCondition(@RequestParam String kshi, @RequestParam String startTime, @RequestParam String endTime){
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
        List<DchzDto> dchz = zgongService.getDchz(map);
        if(dchz != null && dchz.size() >0){
            result.success(dchz);
        }
        return result;
    }

    @RequestMapping(value = "/getdchz",method = RequestMethod.GET)
    public AjaxResult getDcxs(){
        AjaxResult result = new AjaxResult();
        List<DchzDto> dchz = zgongService.getDchz(new HashMap());
        if(dchz != null && dchz.size() >0){
            result.success(dchz);
        }
        return result;
    }

    @RequestMapping(value = "/addczgong")
    public AjaxResult addZgong(@RequestBody ZGongVo zGongVo, HttpServletRequest request){
        AjaxResult ar = new AjaxResult();

        List<Zgong> zgongs = zgongService.selectDcMonth(zGongVo.getUsername());
        if(zgongs != null && zgongs.size()>0){
            ar.failure();
            return  ar;
        }
        Zgong zGong = null;
        ZgongDcha zGongDcha = null;
        int flag1=0,flag2=0;
        if(zGongVo != null){
            zGong = new Zgong();
            zGongDcha = new ZgongDcha();

            String zgid = UUID.randomUUID().toString();

            if(zGongVo.getZgbmen() != null && zGongVo.getZgbmen().size() > 0){
                for(Dcx dcx : zGongVo.getZgbmen()){
                    if(dcx != null){
                        if(StringUtil.isNotEmpty(dcx.getDept()))
                            zGongDcha.setDept(dcx.getDept());
                        if(dcx.getDcha() != null && dcx.getDcha().length > 0){
                            Integer[] dcha = dcx.getDcha();
                            zGongDcha.setFwtdu(dcha[0]);
                            zGongDcha.setFwzliao(dcha[1]);
                            zGongDcha.setBsxlv(dcha[2]);
                            zGongDcha.setLdjlv(dcha[3]);
                        }
                        zGongDcha.setDcha(zgid);
                        zGongDcha.setId(UUID.randomUUID().toString());
                        flag1=zgongDchaService.saveDcha(zGongDcha);
                    }
                }
            }
            if(StringUtil.isNotEmpty(zGongVo.getZgyjian())){
                zGong.setAdvice(zGongVo.getZgyjian());
            }
            zGong.setId(UUID.randomUUID().toString());
            zGong.setCreator(zGongVo.getUsername());
            zGong.setCreatetime(new Date());
            zGong.setDcha(zgid);
            flag2=zgongService.saveZGong(zGong);
        }

        if(flag1 >0 && flag2 > 0){
            ar.success();
        } else{
            ar.failure();
        }
        return ar;
    }
}
