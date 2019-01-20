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
    public SurveyUser validateUser(SurveyUser surveyUser) {

        return surveyUserMapper.selectOne(surveyUser);
    }
}
