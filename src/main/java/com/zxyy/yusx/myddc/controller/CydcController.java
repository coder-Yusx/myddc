package com.zxyy.yusx.myddc.controller;

import com.zxyy.yusx.myddc.model.CydcVo;
import com.zxyy.yusx.myddc.result.AjaxResult;
import com.zxyy.yusx.myddc.service.ICydcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cydc")
@RestController
public class CydcController {

    @Autowired
    private ICydcService cydcService;

    @RequestMapping(value = "/addcydc",method = RequestMethod.POST)
    public AjaxResult addCydc(@RequestBody CydcVo cyuan){
        return null;
    }
}
