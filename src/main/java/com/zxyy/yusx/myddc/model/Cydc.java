package com.zxyy.yusx.myddc.model;

import java.io.Serializable;
import java.util.Date;

public class Cydc implements Serializable {
    private String id;

    private String dept;

    private String zyhao;

    private String sjhao;

    private String yjian;

    private Date createtime;

    private String creator;

    private String extendtxt1;

    private String extendtxt2;

    private Integer extendint1;

    private Double extenddouble1;

    private Date extenddate1;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getZyhao() {
        return zyhao;
    }

    public void setZyhao(String zyhao) {
        this.zyhao = zyhao == null ? null : zyhao.trim();
    }

    public String getSjhao() {
        return sjhao;
    }

    public void setSjhao(String sjhao) {
        this.sjhao = sjhao == null ? null : sjhao.trim();
    }

    public String getYjian() {
        return yjian;
    }

    public void setYjian(String yjian) {
        this.yjian = yjian == null ? null : yjian.trim();
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

    public Integer getExtendint1() {
        return extendint1;
    }

    public void setExtendint1(Integer extendint1) {
        this.extendint1 = extendint1;
    }

    public Double getExtenddouble1() {
        return extenddouble1;
    }

    public void setExtenddouble1(Double extenddouble1) {
        this.extenddouble1 = extenddouble1;
    }

    public Date getExtenddate1() {
        return extenddate1;
    }

    public void setExtenddate1(Date extenddate1) {
        this.extenddate1 = extenddate1;
    }
}