package com.zxyy.yusx.myddc.service;

import com.zxyy.yusx.myddc.model.DeptVo1;
import com.zxyy.yusx.myddc.model.SurveyDept;

import java.util.List;

public interface ISurveyDeptService {
    int batchSaveSurveyDept(List<SurveyDept> surveyDepts);

    List<DeptVo1> getAllDepts();
}
