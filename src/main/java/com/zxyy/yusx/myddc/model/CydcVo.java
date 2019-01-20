package com.zxyy.yusx.myddc.model;

import java.util.List;

public class CydcVo {

    private String kshi;
    private String zyhao;
    private String sjhao;
    private String yjian;
    private List<CygroupVo> dcha;

    public String getKshi() {
        return kshi;
    }

    public void setKshi(String kshi) {
        this.kshi = kshi;
    }

    public String getZyhao() {
        return zyhao;
    }

    public void setZyhao(String zyhao) {
        this.zyhao = zyhao;
    }

    public String getSjhao() {
        return sjhao;
    }

    public void setSjhao(String sjhao) {
        this.sjhao = sjhao;
    }

    public List<CygroupVo> getDcha() {
        return dcha;
    }

    public void setDcha(List<CygroupVo> dcha) {
        this.dcha = dcha;
    }

    public String getYjian() {
        return yjian;
    }

    public void setYjian(String yjian) {
        this.yjian = yjian;
    }
}
