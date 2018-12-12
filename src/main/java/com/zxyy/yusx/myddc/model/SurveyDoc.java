package com.zxyy.yusx.myddc.model;

import java.io.Serializable;
import java.util.Date;

public class SurveyDoc implements Serializable {
    private String docId;

    private String docName;

    private String docDiscribe;

    private String docWriter;

    private Date docCreatetime;

    private Integer docStatus;

    private String docExtend1;

    private String docExtend2;

    private String docExtend3;

    private String docExtend4;

    private String docExtend5;

    private static final long serialVersionUID = 1L;

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId == null ? null : docId.trim();
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName == null ? null : docName.trim();
    }

    public String getDocDiscribe() {
        return docDiscribe;
    }

    public void setDocDiscribe(String docDiscribe) {
        this.docDiscribe = docDiscribe == null ? null : docDiscribe.trim();
    }

    public String getDocWriter() {
        return docWriter;
    }

    public void setDocWriter(String docWriter) {
        this.docWriter = docWriter == null ? null : docWriter.trim();
    }

    public Date getDocCreatetime() {
        return docCreatetime;
    }

    public void setDocCreatetime(Date docCreatetime) {
        this.docCreatetime = docCreatetime;
    }

    public Integer getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(Integer docStatus) {
        this.docStatus = docStatus;
    }

    public String getDocExtend1() {
        return docExtend1;
    }

    public void setDocExtend1(String docExtend1) {
        this.docExtend1 = docExtend1 == null ? null : docExtend1.trim();
    }

    public String getDocExtend2() {
        return docExtend2;
    }

    public void setDocExtend2(String docExtend2) {
        this.docExtend2 = docExtend2 == null ? null : docExtend2.trim();
    }

    public String getDocExtend3() {
        return docExtend3;
    }

    public void setDocExtend3(String docExtend3) {
        this.docExtend3 = docExtend3 == null ? null : docExtend3.trim();
    }

    public String getDocExtend4() {
        return docExtend4;
    }

    public void setDocExtend4(String docExtend4) {
        this.docExtend4 = docExtend4 == null ? null : docExtend4.trim();
    }

    public String getDocExtend5() {
        return docExtend5;
    }

    public void setDocExtend5(String docExtend5) {
        this.docExtend5 = docExtend5 == null ? null : docExtend5.trim();
    }
}