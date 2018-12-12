package com.zxyy.yusx.myddc.model;

import java.util.List;

public class ZGongVo {

    private String zgyjian;
    private List<Dcx> zgbmen;
    private String username;

    public String getZgyjian() {
        return zgyjian;
    }

    public void setZgyjian(String zgyjian) {
        this.zgyjian = zgyjian;
    }

    public List<Dcx> getZgbmen() {
        return zgbmen;
    }

    public void setZgbmen(List<Dcx> zgbmen) {
        this.zgbmen = zgbmen;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}