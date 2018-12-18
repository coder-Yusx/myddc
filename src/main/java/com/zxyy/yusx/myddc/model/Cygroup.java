package com.zxyy.yusx.myddc.model;

import java.io.Serializable;
import java.util.Date;

public class Cygroup implements Serializable {
    private String id;

    private String groupname;

    private String cyid;

    private String extendtxt1;

    private String extendtxt2;

    private Integer extendint;

    private Double extenddouble;

    private Date extenddate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getCyid() {
        return cyid;
    }

    public void setCyid(String cyid) {
        this.cyid = cyid == null ? null : cyid.trim();
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

    public Integer getExtendint() {
        return extendint;
    }

    public void setExtendint(Integer extendint) {
        this.extendint = extendint;
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