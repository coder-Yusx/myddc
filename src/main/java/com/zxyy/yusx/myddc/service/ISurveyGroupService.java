package com.zxyy.yusx.myddc.service;

import com.zxyy.yusx.myddc.model.SurveyGroup;

import java.util.List;

public interface ISurveyGroupService {
    int batchSaveSurveyGroup(List<SurveyGroup> surveyGroups);
}
