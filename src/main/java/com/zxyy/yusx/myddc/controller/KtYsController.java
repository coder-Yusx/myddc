package com.zxyy.yusx.myddc.controller;

import com.zxyy.yusx.myddc.model.KtYs;
import com.zxyy.yusx.myddc.model.KtYsVo;
import com.zxyy.yusx.myddc.result.AjaxResult;
import com.zxyy.yusx.myddc.service.impl.KtYsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/ss")
public class KtYsController {

    @Autowired
    private KtYsService ktYsService;

    @RequestMapping(value = "/addssdcys")
    public AjaxResult addSsdcys(@RequestBody KtYsVo ktYsVo){

        KtYs ktYs = new KtYs();
        ktYs.setOperaId(UUID.randomUUID().toString());
        ktYs.setDept(ktYsVo.getDept());
        ktYs.setRole(ktYsVo.getRole());
        ktYs.setPosition(ktYsVo.getPosition());
        ktYs.setItem1(ktYsVo.getItem1());
        if(ktYsVo.getItem2() != null && ktYsVo.getItem2().length > 0){
            String item2 = "";
            for(String item : ktYsVo.getItem2()){
                item2 = item2 + item+",";
            }
            ktYs.setItem2(item2);
        }
        if(ktYsVo.getItem3() != null && ktYsVo.getItem3().length > 0 ){
            String item3 = "";
            for(String item : ktYsVo.getItem3()){
                item3 = item3 + item+",";
            }
            ktYs.setItem3(item3);
        }
        ktYs.setItem4(ktYsVo.getItem4());
        ktYs.setItem5(ktYsVo.getItem5());
        ktYs.setItem6(ktYsVo.getItem6());

        int i = ktYsService.saveSsdcys(ktYs);

        AjaxResult result = new AjaxResult();
        if(i > 0){
            result.success();
        }else {
            result.failure();
        }
        return result;
    }
}
