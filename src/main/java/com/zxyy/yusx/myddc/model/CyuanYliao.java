package com.zxyy.yusx.myddc.model;

import java.io.Serializable;
import java.util.Date;

public class CyuanYliao implements Serializable {
    private String id;

    private Integer jyan;

    private Integer fshe;

    private Integer ct;

    private Integer hci;

    private Integer csheng;

    private Integer xdian;

    private Integer tna;

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

    public Integer getJyan() {
        return jyan;
    }

    public void setJyan(Integer jyan) {
        this.jyan = jyan;
    }

    public Integer getFshe() {
        return fshe;
    }

    public void setFshe(Integer fshe) {
        this.fshe = fshe;
    }

    public Integer getCt() {
        return ct;
    }

    public void setCt(Integer ct) {
        this.ct = ct;
    }

    public Integer getHci() {
        return hci;
    }

    public void setHci(Integer hci) {
        this.hci = hci;
    }

    public Integer getCsheng() {
        return csheng;
    }

    public void setCsheng(Integer csheng) {
        this.csheng = csheng;
    }

    public Integer getXdian() {
        return xdian;
    }

    public void setXdian(Integer xdian) {
        this.xdian = xdian;
    }

    public Integer getTna() {
        return tna;
    }

    public void setTna(Integer tna) {
        this.tna = tna;
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