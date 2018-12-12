package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.SurveyItemMapper;
import com.zxyy.yusx.myddc.model.SurveyItem;
import com.zxyy.yusx.myddc.service.ISurveyItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyItemService implements ISurveyItemService {
    @Autowired
    public SurveyItemMapper surveyItemMapper;

    @Override
    public int batchSaveSurveyItem(List<SurveyItem> surveyItems) {
        return surveyItemMapper.bacthInsertSurveyItem(surveyItems);
    }
}
