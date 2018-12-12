package com.zxyy.yusx.myddc.model;

import java.io.Serializable;

public class SurveyDept implements Serializable {
    private String deptId;

    private String deptName;

    private Integer deptSort;

    private String deptDoc;

    private Integer deptStatus;

    private String deptExtend1;

    private String deptExtend2;

    private String deptExtend3;

    private String deptExtend4;

    private String deptExtend5;

    private static final long serialVersionUID = 1L;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getDeptSort() {
        return deptSort;
    }

    public void setDeptSort(Integer deptSort) {
        this.deptSort = deptSort;
    }

    public String getDeptDoc() {
        return deptDoc;
    }

    public void setDeptDoc(String deptDoc) {
        this.deptDoc = deptDoc == null ? null : deptDoc.trim();
    }

    public Integer getDeptStatus() {
        return deptStatus;
    }

    public void setDeptStatus(Integer deptStatus) {
        this.deptStatus = deptStatus;
    }

    public String getDeptExtend1() {
        return deptExtend1;
    }

    public void setDeptExtend1(String deptExtend1) {
        this.deptExtend1 = deptExtend1 == null ? null : deptExtend1.trim();
    }

    public String getDeptExtend2() {
        return deptExtend2;
    }

    public void setDeptExtend2(String deptExtend2) {
        this.deptExtend2 = deptExtend2 == null ? null : deptExtend2.trim();
    }

    public String getDeptExtend3() {
        return deptExtend3;
    }

    public void setDeptExtend3(String deptExtend3) {
        this.deptExtend3 = deptExtend3 == null ? null : deptExtend3.trim();
    }

    public String getDeptExtend4() {
        return deptExtend4;
    }

    public void setDeptExtend4(String deptExtend4) {
        this.deptExtend4 = deptExtend4 == null ? null : deptExtend4.trim();
    }

    public String getDeptExtend5() {
        return deptExtend5;
    }

    public void setDeptExtend5(String deptExtend5) {
        this.deptExtend5 = deptExtend5 == null ? null : deptExtend5.trim();
    }
}