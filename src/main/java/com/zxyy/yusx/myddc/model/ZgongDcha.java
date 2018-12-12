package com.zxyy.yusx.myddc.model;

import java.io.Serializable;
import java.util.Date;

public class ZgongDcha implements Serializable {
    private String id;

    private String dcha;

    private String dept;

    private Integer fwtdu;

    private Integer bsxlv;

    private Integer fwzliao;

    private Integer ldjlv;

    private String zgong;

    private String extendtxt1;

    private String extendtxt2;

    private String extendtxt3;

    private Integer extendint1;

    private Integer extendint2;

    private Double extenddouble1;

    private Double extenddouble2;

    private Date extendtime1;

    private Date extendtime2;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDcha() {
        return dcha;
    }

    public void setDcha(String dcha) {
        this.dcha = dcha == null ? null : dcha.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public Integer getFwtdu() {
        return fwtdu;
    }

    public void setFwtdu(Integer fwtdu) {
        this.fwtdu = fwtdu;
    }

    public Integer getBsxlv() {
        return bsxlv;
    }

    public void setBsxlv(Integer bsxlv) {
        this.bsxlv = bsxlv;
    }

    public Integer getFwzliao() {
        return fwzliao;
    }

    public void setFwzliao(Integer fwzliao) {
        this.fwzliao = fwzliao;
    }

    public Integer getLdjlv() {
        return ldjlv;
    }

    public void setLdjlv(Integer ldjlv) {
        this.ldjlv = ldjlv;
    }

    public String getZgong() {
        return zgong;
    }

    public void setZgong(String zgong) {
        this.zgong = zgong == null ? null : zgong.trim();
    }

    public String getExtendtxt1() {
        return extendtxt1;
    }

    public void setExtendtxt1(String extendtxt1) {
        this.extendtxt1 = extendtxt1 == null ? null : extendtxt1.trim();
    }

    public String getExtendtxt2() {
        return extendtxt2;
    }

    public void setExtendtxt2(String extendtxt2) {
        this.extendtxt2 = extendtxt2 == null ? null : extendtxt2.trim();
    }

    public String getExtendtxt3() {
        return extendtxt3;
    }

    public void setExtendtxt3(String extendtxt3) {
        this.extendtxt3 = extendtxt3 == null ? null : extendtxt3.trim();
    }

    public Integer getExtendint1() {
        return extendint1;
    }

    public void setExtendint1(Integer extendint1) {
        this.extendint1 = extendint1;
    }

    public Integer getExtendint2() {
        return extendint2;
    }

    public void setExtendint2(Integer extendint2) {
        this.extendint2 = extendint2;
    }

    public Double getExtenddouble1() {
        return extenddouble1;
    }

    public void setExtenddouble1(Double extenddouble1) {
        this.extenddouble1 = extenddouble1;
    }

    public Double getExtenddouble2() {
        return extenddouble2;
    }

    public void setExtenddouble2(Double extenddouble2) {
        this.extenddouble2 = extenddouble2;
    }

    public Date getExtendtime1() {
        return extendtime1;
    }

    public void setExtendtime1(Date extendtime1) {
        this.extendtime1 = extendtime1;
    }

    public Date getExtendtime2() {
        return extendtime2;
    }

    public void setExtendtime2(Date extendtime2) {
        this.extendtime2 = extendtime2;
    }
}