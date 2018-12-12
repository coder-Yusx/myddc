package com.zxyy.yusx.myddc.model;

import java.io.Serializable;
import java.util.Date;

public class Zgong implements Serializable {
    private String id;

    private String creator;

    private String dept;

    private String dcha;

    private String advice;

    private Date createtime;

    private String extendtxt1;

    private String extendtxt2;

    private Integer extendnum1;

    private Integer extendnum2;

    private Date extendtime1;

    private Date extendtime2;

    private Double extenddouble1;

    private Double extenddouble2;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getDcha() {
        return dcha;
    }

    public void setDcha(String dcha) {
        this.dcha = dcha == null ? null : dcha.trim();
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public Integer getExtendnum1() {
        return extendnum1;
    }

    public void setExtendnum1(Integer extendnum1) {
        this.extendnum1 = extendnum1;
    }

    public Integer getExtendnum2() {
        return extendnum2;
    }

    public void setExtendnum2(Integer extendnum2) {
        this.extendnum2 = extendnum2;
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
}