package com.zxyy.yusx.myddc.model;

import java.io.Serializable;
import java.util.Date;

public class CyuanZybwsheng implements Serializable {
    private String id;

    private Integer wsheng;

    private String cyuan;

    private String extendTxt1;

    private String extendTxt2;

    private String extendTxt3;

    private Double extendNum1;

    private Double extendNum2;

    private Integer extendInt;

    private Date extendDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getWsheng() {
        return wsheng;
    }

    public void setWsheng(Integer wsheng) {
        this.wsheng = wsheng;
    }

    public String getCyuan() {
        return cyuan;
    }

    public void setCyuan(String cyuan) {
        this.cyuan = cyuan == null ? null : cyuan.trim();
    }

    public String getExtendTxt1() {
        return extendTxt1;
    }

    public void setExtendTxt1(String extendTxt1) {
        this.extendTxt1 = extendTxt1 == null ? null : extendTxt1.trim();
    }

    public String getExtendTxt2() {
        return extendTxt2;
    }

    public void setExtendTxt2(String extendTxt2) {
        this.extendTxt2 = extendTxt2 == null ? null : extendTxt2.trim();
    }

    public String getExtendTxt3() {
        return extendTxt3;
    }

    public void setExtendTxt3(String extendTxt3) {
        this.extendTxt3 = extendTxt3 == null ? null : extendTxt3.trim();
    }

    public Double getExtendNum1() {
        return extendNum1;
    }

    public void setExtendNum1(Double extendNum1) {
        this.extendNum1 = extendNum1;
    }

    public Double getExtendNum2() {
        return extendNum2;
    }

    public void setExtendNum2(Double extendNum2) {
        this.extendNum2 = extendNum2;
    }

    public Integer getExtendInt() {
        return extendInt;
    }

    public void setExtendInt(Integer extendInt) {
        this.extendInt = extendInt;
    }

    public Date getExtendDate() {
        return extendDate;
    }

    public void setExtendDate(Date extendDate) {
        this.extendDate = extendDate;
    }
}