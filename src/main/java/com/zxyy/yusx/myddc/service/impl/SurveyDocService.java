package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.SurveyDocMapper;
import com.zxyy.yusx.myddc.model.SurveyDoc;
import com.zxyy.yusx.myddc.model.SurveyVo1;
import com.zxyy.yusx.myddc.service.ISurveyDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.List;

@Service
public class SurveyDocService implements ISurveyDocService {

    @Autowired
    public SurveyDocMapper surveyDocMapper;

    @Override
    public int saveSurveyDoc(SurveyDoc surveyDoc) {
        return surveyDocMapper.insert(surveyDoc);
    }

    public String getOneDeptSurvey(String dept){
        DecimalFormat df = new DecimalFormat("0.00");
        //List<SurveyVo1> surveyVo1s = surveyDocMapper.selectAllSurveyVo1();
        List<SurveyVo1> surveyVo1s = surveyDocMapper.selectOneDeptSurvey(dept);
        for (SurveyVo1 surveyVo1 : surveyVo1s) {
            int sum = 0;
            String[] satisfiesArr = surveyVo1.getItemSatisfies().split(",");
            String[] numArr = surveyVo1.getSatisfyNums().split(",");
            for (int i = 0; i < satisfiesArr.length; i++) {
                switch (satisfiesArr[i]) {
                    case "很不满意":
                        surveyVo1.setHbmy(Integer.parseInt(numArr[i]));
                        break;
                    case "不满意":
                        surveyVo1.setBmy(Integer.parseInt(numArr[i]));
                        break;
                    case "一般":
                        surveyVo1.setYb(Integer.parseInt(numArr[i]));
                        break;
                    case "满意":
                        surveyVo1.setMy(Integer.parseInt(numArr[i]));
                        break;
                    case "很满意":
                        surveyVo1.setHmy(Integer.parseInt(numArr[i]));
                        break;
                }
                sum = sum + Integer.parseInt(numArr[i]);
            }
            surveyVo1.setSumSurvey(sum);

            //调查项得分
            double achieveScore = surveyVo1.getHbmy()*1+surveyVo1.getBmy()*2+surveyVo1.getYb()*3+surveyVo1.getMy()*4+surveyVo1.getHmy()*5;
            //调查项总得分
            double totalScore = sum * 5;
            //每项满意度
            double satisfyPrecent = achieveScore/totalScore;

            double finalScore = 0.00;
            if(satisfyPrecent - 0.9 >= 0){
                finalScore = totalScore;
            } else{
                double v = 90 - (satisfyPrecent * 100);
                double v1 = (int) v * 0.1;
                finalScore = achieveScore - v1;
            }
            surveyVo1.setAchieveScore(achieveScore);
            surveyVo1.setTotalScore(totalScore);
            surveyVo1.setSatisfyPrecent(df.format(satisfyPrecent));
            surveyVo1.setFinalScore(finalScore);
        }

        double sumFinalScore = 0.0;
        double sumTotalScore = 0.0;
        for (SurveyVo1 surveyVo : surveyVo1s){
            sumFinalScore=sumFinalScore+surveyVo.getFinalScore();
            sumTotalScore=sumTotalScore+surveyVo.getTotalScore();
        }
        double totalPrecent = sumFinalScore / sumTotalScore;
        return df.format(totalPrecent);
    }

    @Override
    public List<SurveyVo1> getAllSurveyVo1() {
        DecimalFormat df = new DecimalFormat("0.00");
        List<SurveyVo1> surveyVo1s = surveyDocMapper.selectAllSurveyVo1();
        for (SurveyVo1 surveyVo1 : surveyVo1s) {
            int sum = 0;
            String[] satisfiesArr = surveyVo1.getItemSatisfies().split(",");
            String[] numArr = surveyVo1.getSatisfyNums().split(",");
            for (int i = 0; i < satisfiesArr.length; i++) {
                switch (satisfiesArr[i]) {
                    case "很不满意":
                        surveyVo1.setHbmy(Integer.parseInt(numArr[i]));
                        break;
                    case "不满意":
                        surveyVo1.setBmy(Integer.parseInt(numArr[i]));
                        break;
                    case "一般":
                        surveyVo1.setYb(Integer.parseInt(numArr[i]));
                        break;
                    case "满意":
                        surveyVo1.setMy(Integer.parseInt(numArr[i]));
                        break;
                    case "很满意":
                        surveyVo1.setHmy(Integer.parseInt(numArr[i]));
                        break;
                }
                sum = sum + Integer.parseInt(numArr[i]);
            }
            surveyVo1.setSumSurvey(sum);

            //调查项得分
            double achieveScore = surveyVo1.getHbmy()*1+surveyVo1.getBmy()*2+surveyVo1.getYb()*3+surveyVo1.getMy()*4+surveyVo1.getHmy()*5;
            //调查项总得分
            double totalScore = sum * 5;
            //每项满意度
            double satisfyPrecent = achieveScore/totalScore;

            double finalScore = 0.00;
            if(satisfyPrecent - 0.9 >= 0){
                finalScore = totalScore;
            } else{
                double v = 90 - (satisfyPrecent * 100);
                double v1 = (int) v * 0.1;
                finalScore = achieveScore - v1;
            }
            surveyVo1.setAchieveScore(achieveScore);
            surveyVo1.setTotalScore(totalScore);
            surveyVo1.setSatisfyPrecent(df.format(satisfyPrecent));
            surveyVo1.setFinalScore(finalScore);
        }
        return surveyVo1s;
    }
}
