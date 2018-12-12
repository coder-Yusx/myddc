package com.zxyy.yusx.myddc.model;

import java.io.Serializable;

public class YyKshi implements Serializable {
    private String id;

    private String deptcode;

    private String deptname;

    private String spellcode;

    private String depttype;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getSpellcode() {
        return spellcode;
    }

    public void setSpellcode(String spellcode) {
        this.spellcode = spellcode == null ? null : spellcode.trim();
    }

    public String getDepttype() {
        return depttype;
    }

    public void setDepttype(String depttype) {
        this.depttype = depttype == null ? null : depttype.trim();
    }
}