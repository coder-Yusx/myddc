package com.zxyy.yusx.myddc.model;

import java.io.Serializable;
import java.util.Date;

public class Cyitem implements Serializable {
    private String id;

    private String itemname;

    private Integer itemscore;

    private String gid;

    private String extendtxt1;

    private String extendtxt2;

    private Integer exttendint;

    private Double extenddouble;

    private Date extenddate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public Integer getItemscore() {
        return itemscore;
    }

    public void setItemscore(Integer itemscore) {
        this.itemscore = itemscore;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
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

    public Integer getExttendint() {
        return exttendint;
    }

    public void setExttendint(Integer exttendint) {
        this.exttendint = exttendint;
    }

    public Double getExtenddouble() {
        return extenddouble;
    }

    public void setExtenddouble(Double extenddouble) {
        this.extenddouble = extenddouble;
    }

    public Date getExtenddate() {
        return extenddate;
    }

    public void setExtenddate(Date extenddate) {
        this.extenddate = extenddate;
    }
}