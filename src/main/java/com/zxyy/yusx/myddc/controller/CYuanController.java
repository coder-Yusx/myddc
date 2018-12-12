package com.zxyy.yusx.myddc.controller;

import com.zxyy.yusx.myddc.model.*;
import com.zxyy.yusx.myddc.result.AjaxResult;
import com.zxyy.yusx.myddc.service.*;
import com.zxyy.yusx.myddc.utils.ExcelUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/cyuan")
public class CYuanController {

    @Autowired
    private ICyuanService cyuanService;
    @Autowired
    private ICyuanYshengService cyuanYshengService;
    @Autowired
    private ICyuanHshiService cyuanHshiService;
    @Autowired
    private ICyuanYliaoService cyuanYliaoService;
    @Autowired
    private ICyuanHqinService cyuanHqinService;
    @Autowired
    private ICyuanZybwshengService cyuanZybwshengService;
    @Autowired
    private IYyKshiService yyKshiService;

    @RequestMapping(value = "/zykshi",method = RequestMethod.GET)
    public AjaxResult getZyuanKshi(){
        AjaxResult result = new AjaxResult();
        List<YyKshi> zyuanKshis = yyKshiService.getZyuanKshis();
        if(zyuanKshis != null && zyuanKshis.size()>0){
            result.success(zyuanKshis);
        }
        return result;
    }

    @RequestMapping(value = "/count",method = RequestMethod.GET)
    public AjaxResult cyuanCount(){
        AjaxResult result = new AjaxResult();
        Map map = new HashMap();
        List<CyuanDto> cymyd = cyuanService.getCYMYD(map);
        if(cymyd != null && cymyd.size() > 0){
            result.success(cymyd);
            return result;
        }
        return null;
    }

    @RequestMapping(value = "/countbycondition",method = RequestMethod.GET)
    public AjaxResult cyuanCountByCondition(@RequestParam String kshi,@RequestParam String startTime,@RequestParam String endTime){
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
        List<CyuanDto> cymyd = cyuanService.getCYMYD(map);
        if(cymyd != null && cymyd.size() > 0){
            result.success(cymyd);
            return result;
        }
        return null;
    }

    @RequestMapping(value = "/addcyuan")
    public AjaxResult addCyuan(@RequestBody CyuanVo cyuan){

        AjaxResult result = new AjaxResult();
        if(cyuan != null){
            //cyuan id
            String cyuanid = UUID.randomUUID().toString();

            //从参数中获取医生,并存到数据库
            CyuanYsheng ysheng = cyuan.getYsheng();
            String yshengid = UUID.randomUUID().toString();
            int yshengSaveFlag = 0;
            if(ysheng != null){
                ysheng.setId(yshengid);
                ysheng.setCyuan(cyuanid);
                yshengSaveFlag = cyuanYshengService.saveOneYsheng(ysheng);
            }

            //从参数中获取护士,并存到数据库
            CyuanHshi hshi = cyuan.getHshi();
            String hshiid = UUID.randomUUID().toString();
            int hshiSaveFlag = 0;
            if(hshi != null){
                hshi.setId(hshiid);
                hshi.setCyuan(cyuanid);
                hshiSaveFlag = cyuanHshiService.saveOneHshi(hshi);
            }

            //从参数中获取医疗,并存到数据库
            CyuanYliao yliao = cyuan.getYliao();
            String yliaoid = UUID.randomUUID().toString();
            int yliaoSaveFlag = 0;
            if(yliao != null){
                yliao.setId(yliaoid);
                yliao.setCyuan(cyuanid);
                yliaoSaveFlag = cyuanYliaoService.saveOneYliao(yliao);
            }

            //从参数中获取后勤,并存到数据库
            CyuanHqin hqin = cyuan.getHqin();
            String hqinid = UUID.randomUUID().toString();
            int hqinSaveFlag = 0;
            if(hqin != null){
                hqin.setId(hqinid);
                hqin.setCyuan(cyuanid);
                hqinSaveFlag = cyuanHqinService.saveOneHqin(hqin);
            }

            //从参数中获取住院部,并存到数据库
            CyuanZybwsheng zybwsheng = cyuan.getZybwsheng();
            String zybuid = UUID.randomUUID().toString();
            int zybuSaveFlag = 0;
            if(zybwsheng != null){
                zybwsheng.setId(zybuid);
                zybwsheng.setCyuan(cyuanid);
                zybuSaveFlag = cyuanZybwshengService.saveOneZybwsheng(zybwsheng);
            }

            Cyuan cYuan = new Cyuan();
            if(yshengSaveFlag != 0)
                cYuan.setYsheng(yshengid);
            if(hshiSaveFlag != 0)
                cYuan.setHshi(hshiid);
            if(hqinSaveFlag != 0)
                cYuan.setHqin(hqinid);
            if(yliaoSaveFlag != 0)
                cYuan.setYliao(yliaoid);
            if(zybuSaveFlag != 0)
                cYuan.setZybwsheng(zybuid);
            cYuan.setId(UUID.randomUUID().toString());
            cYuan.setKshi(cyuan.getKshi());
            cYuan.setXming(cyuan.getXming());
            cYuan.setDhua(cyuan.getDhua());
            cYuan.setYjian(cyuan.getYjian());
            cYuan.setCreatetime(new Date());
            int cyuanSaveFlag = cyuanService.saveOneCyuan(cYuan);


            if(cyuanSaveFlag != 0){
                result.success();
            }
        }
        return result;
    }
}
