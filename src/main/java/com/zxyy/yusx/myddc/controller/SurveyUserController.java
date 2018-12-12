package com.zxyy.yusx.myddc.controller;

import com.zxyy.yusx.myddc.model.SurveyUser;
import com.zxyy.yusx.myddc.result.AjaxResult;
import com.zxyy.yusx.myddc.service.impl.SurveyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class SurveyUserController {

    @Autowired
    private SurveyUserService surveyUserService;

    @RequestMapping(value = "/login/{username}", method = RequestMethod.GET)
    public AjaxResult login(@PathVariable("username") String username, HttpServletRequest request) {
        boolean flag = false;
        SurveyUser surveyUser = new SurveyUser();
        if (StringUtil.isNotEmpty(username)) {
            surveyUser.setUserName(username);
        }

        if (StringUtil.isNotEmpty(surveyUser.getUserName())) {
            flag = surveyUserService.validateUser(surveyUser);
        }
        AjaxResult result = new AjaxResult();
        result.failure();
        if (flag){
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
        }
        result.success();
        return result;
    }
}
