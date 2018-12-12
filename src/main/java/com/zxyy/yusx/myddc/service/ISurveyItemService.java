package com.zxyy.yusx.myddc.service;

import com.zxyy.yusx.myddc.model.SurveyItem;

import java.util.List;

public interface ISurveyItemService {
    int batchSaveSurveyItem(List<SurveyItem> surveyItems);
}
