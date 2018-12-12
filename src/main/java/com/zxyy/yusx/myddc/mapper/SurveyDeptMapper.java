package com.zxyy.yusx.myddc.mapper;

import com.zxyy.yusx.myddc.model.DeptVo1;
import com.zxyy.yusx.myddc.model.SurveyDept;
import com.zxyy.yusx.myddc.tk.TKMapper;

import java.util.List;

public interface SurveyDeptMapper extends TKMapper<SurveyDept> {

    int bacthInsertSurveyDept(List<SurveyDept> surveyDepts);

    List<DeptVo1> selectAllDepts();
}