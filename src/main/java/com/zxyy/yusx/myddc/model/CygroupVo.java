package com.zxyy.yusx.myddc.model;

import java.util.List;

public class CygroupVo {

    private String groupname;
    private List<Cyitem> itemlist;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public List<Cyitem> getItemlist() {
        return itemlist;
    }

    public void setItemlist(List<Cyitem> itemlist) {
        this.itemlist = itemlist;
    }
}
