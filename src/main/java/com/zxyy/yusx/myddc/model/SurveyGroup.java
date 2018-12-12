package com.zxyy.yusx.myddc.model;

import java.io.Serializable;

public class SurveyGroup implements Serializable {
    private String groupId;

    private String groupName;

    private Integer groupSort;

    private String groupDept;

    private Integer groupStatus;

    private String groupExtend1;

    private String groupExtend2;

    private String groupExtend3;

    private String groupExtend4;

    private String groupExtend5;

    private static final long serialVersionUID = 1L;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getGroupSort() {
        return groupSort;
    }

    public void setGroupSort(Integer groupSort) {
        this.groupSort = groupSort;
    }

    public String getGroupDept() {
        return groupDept;
    }

    public void setGroupDept(String groupDept) {
        this.groupDept = groupDept == null ? null : groupDept.trim();
    }

    public Integer getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
    }

    public String getGroupExtend1() {
        return groupExtend1;
    }

    public void setGroupExtend1(String groupExtend1) {
        this.groupExtend1 = groupExtend1 == null ? null : groupExtend1.trim();
    }

    public String getGroupExtend2() {
        return groupExtend2;
    }

    public void setGroupExtend2(String groupExtend2) {
        this.groupExtend2 = groupExtend2 == null ? null : groupExtend2.trim();
    }

    public String getGroupExtend3() {
        return groupExtend3;
    }

    public void setGroupExtend3(String groupExtend3) {
        this.groupExtend3 = groupExtend3 == null ? null : groupExtend3.trim();
    }

    public String getGroupExtend4() {
        return groupExtend4;
    }

    public void setGroupExtend4(String groupExtend4) {
        this.groupExtend4 = groupExtend4 == null ? null : groupExtend4.trim();
    }

    public String getGroupExtend5() {
        return groupExtend5;
    }

    public void setGroupExtend5(String groupExtend5) {
        this.groupExtend5 = groupExtend5 == null ? null : groupExtend5.trim();
    }
}