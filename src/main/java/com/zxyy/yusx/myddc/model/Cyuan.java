package com.zxyy.yusx.myddc.model;

import java.io.Serializable;
import java.util.Date;

public class Cyuan implements Serializable {
    private String id;

    private String kshi;

    private String ysheng;

    private String hshi;

    private String yliao;

    private String hqin;

    private String zybwsheng;

    private String yjian;

    private String xming;

    private String dhua;

    private Date createtime;

    private String creator;

    private String extendTxt1;

    private String extendTxt2;

    private String extendTxt3;

    private Double extendNum1;

    private Double extendNum2;

    private Integer extendInt;

    private Date extendTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getKshi() {
        return kshi;
    }

    public void setKshi(String kshi) {
        this.kshi = kshi == null ? null : kshi.trim();
    }

    public String getYsheng() {
        return ysheng;
    }

    public void setYsheng(String ysheng) {
        this.ysheng = ysheng == null ? null : ysheng.trim();
    }

    public String getHshi() {
        return hshi;
    }

    public void setHshi(String hshi) {
        this.hshi = hshi == null ? null : hshi.trim();
    }

    public String getYliao() {
        return yliao;
    }

    public void setYliao(String yliao) {
        this.yliao = yliao == null ? null : yliao.trim();
    }

    public String getHqin() {
        return hqin;
    }

    public void setHqin(String hqin) {
        this.hqin = hqin == null ? null : hqin.trim();
    }

    public String getZybwsheng() {
        return zybwsheng;
    }

    public void setZybwsheng(String zybwsheng) {
        this.zybwsheng = zybwsheng == null ? null : zybwsheng.trim();
    }

    public String getYjian() {
        return yjian;
    }

    public void setYjian(String yjian) {
        this.yjian = yjian == null ? null : yjian.trim();
    }

    public String getXming() {
        return xming;
    }

    public void setXming(String xming) {
        this.xming = xming == null ? null : xming.trim();
    }

    public String getDhua() {
        return dhua;
    }

    public void setDhua(String dhua) {
        this.dhua = dhua == null ? null : dhua.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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

    public Date getExtendTime() {
        return extendTime;
    }

    public void setExtendTime(Date extendTime) {
        this.extendTime = extendTime;
    }
}