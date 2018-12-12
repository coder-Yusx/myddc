package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.SurveyDeptMapper;
import com.zxyy.yusx.myddc.model.DeptVo1;
import com.zxyy.yusx.myddc.model.SurveyDept;
import com.zxyy.yusx.myddc.service.ISurveyDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyDeptService implements ISurveyDeptService {
    @Autowired
    public SurveyDeptMapper surveyDeptMapper;

    @Override
    public int batchSaveSurveyDept(List<SurveyDept> surveyDepts) {
        return surveyDeptMapper.bacthInsertSurveyDept(surveyDepts);
    }

    @Override
    public List<DeptVo1> getAllDepts() {
        return surveyDeptMapper.selectAllDepts();
    }
}
