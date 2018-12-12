package com.zxyy.yusx.myddc.mapper;

import com.zxyy.yusx.myddc.model.SurveyGroup;
import com.zxyy.yusx.myddc.model.SurveyItem;
import com.zxyy.yusx.myddc.tk.TKMapper;

import java.util.List;

public interface SurveyGroupMapper extends TKMapper<SurveyGroup> {

    int bacthInsertSurveyGroup(List<SurveyGroup> surveyGroups);
}