package com.zxyy.yusx.myddc.mapper;

import com.zxyy.yusx.myddc.model.SurveyItem;
import com.zxyy.yusx.myddc.tk.TKMapper;

import java.util.List;

public interface SurveyItemMapper extends TKMapper<SurveyItem> {

    int bacthInsertSurveyItem(List<SurveyItem> surveyItems);
}