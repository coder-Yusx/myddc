package com.zxyy.yusx.myddc.mapper;

import com.zxyy.yusx.myddc.model.SurveyDoc;
import com.zxyy.yusx.myddc.model.SurveyVo1;
import com.zxyy.yusx.myddc.tk.TKMapper;

import java.util.List;

public interface SurveyDocMapper extends TKMapper<SurveyDoc> {

    List<SurveyVo1> selectAllSurveyVo1();

    List<SurveyVo1> selectOneDeptSurvey(String dept);
}