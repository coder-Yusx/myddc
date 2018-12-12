package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.SurveyGroupMapper;
import com.zxyy.yusx.myddc.model.SurveyGroup;
import com.zxyy.yusx.myddc.service.ISurveyGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyGroupService implements ISurveyGroupService {
    @Autowired
    public SurveyGroupMapper surveyGroupMapper;

    @Override
    public int batchSaveSurveyGroup(List<SurveyGroup> surveyGroups) {
        return surveyGroupMapper.bacthInsertSurveyGroup(surveyGroups);
    }
}
