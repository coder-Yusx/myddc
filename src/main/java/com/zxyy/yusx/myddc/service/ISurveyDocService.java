package com.zxyy.yusx.myddc.service;

import com.zxyy.yusx.myddc.model.SurveyDoc;
import com.zxyy.yusx.myddc.model.SurveyVo1;

import java.util.List;

public interface ISurveyDocService {
    int saveSurveyDoc(SurveyDoc surveyDoc);

    List<SurveyVo1> getAllSurveyVo1();

    String getOneDeptSurvey(String dept);
}
