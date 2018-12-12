package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.SurveyUserMapper;
import com.zxyy.yusx.myddc.model.SurveyUser;
import com.zxyy.yusx.myddc.service.ISurveyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.util.StringUtil;

@Service
public class SurveyUserService implements ISurveyUserService {

    @Autowired
    private SurveyUserMapper surveyUserMapper;

    @Override
    public boolean validateUser(SurveyUser surveyUser) {

        SurveyUser user = surveyUserMapper.selectOne(surveyUser);

        if (user != null) {
            return true;
        }
        return false;
    }
}
