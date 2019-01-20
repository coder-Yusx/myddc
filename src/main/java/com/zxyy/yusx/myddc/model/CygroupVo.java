package com.zxyy.yusx.myddc.model;

import java.util.List;

public class CygroupVo {

    private String groupname;
    private List<CyitemVo> itemlist;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public List<CyitemVo> getItemlist() {
        return itemlist;
    }

    public void setItemlist(List<CyitemVo> itemlist) {
        this.itemlist = itemlist;
    }
}
