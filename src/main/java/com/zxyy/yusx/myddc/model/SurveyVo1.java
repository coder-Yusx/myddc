package com.zxyy.yusx.myddc.model;

public class SurveyVo1 {

    private String deptName;

    private String deptCode;

    private String itemName;

    private String itemCode;

    private int hbmy;

    private int bmy;

    private int yb;

    private int my;

    private int hmy;

    private String itemSatisfies;

    private String satisfyNums;

    //调查项总数
    private int sumSurvey;

    //每项得分=调查项总数*每项分值
    private double achieveScore;
    //每项总分=调查项总数*每项最高分
    private double totalScore;
    //每项满意度=每项得分/每项总分
    private String satisfyPrecent;
    //按百分之九十标准对比后得分
    private double finalScore;
    //总满意度=四项得分/四项总分
    private String totalPrecent;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getHbmy() {
        return hbmy;
    }

    public void setHbmy(int hbmy) {
        this.hbmy = hbmy;
    }

    public int getBmy() {
        return bmy;
    }

    public void setBmy(int bmy) {
        this.bmy = bmy;
    }

    public int getYb() {
        return yb;
    }

    public void setYb(int yb) {
        this.yb = yb;
    }

    public int getMy() {
        return my;
    }

    public void setMy(int my) {
        this.my = my;
    }

    public int getHmy() {
        return hmy;
    }

    public void setHmy(int hmy) {
        this.hmy = hmy;
    }

    public String getItemSatisfies() {
        return itemSatisfies;
    }

    public void setItemSatisfies(String itemSatisfies) {
        this.itemSatisfies = itemSatisfies;
    }

    public String getSatisfyNums() {
        return satisfyNums;
    }

    public void setSatisfyNums(String satisfyNums) {
        this.satisfyNums = satisfyNums;
    }

    public int getSumSurvey() {
        return sumSurvey;
    }

    public void setSumSurvey(int sumSurvey) {
        this.sumSurvey = sumSurvey;
    }

    public double getAchieveScore() {
        return achieveScore;
    }

    public void setAchieveScore(double achieveScore) {
        this.achieveScore = achieveScore;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public String getSatisfyPrecent() {
        return satisfyPrecent;
    }

    public void setSatisfyPrecent(String satisfyPrecent) {
        this.satisfyPrecent = satisfyPrecent;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public String getTotalPrecent() {
        return totalPrecent;
    }

    public void setTotalPrecent(String totalPrecent) {
        this.totalPrecent = totalPrecent;
    }
}
