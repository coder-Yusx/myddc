package com.zxyy.yusx.myddc.model;

import java.io.Serializable;

public class SurveyItem implements Serializable {
    private String itemId;

    private String itemName;

    private Integer itemSort;

    private Integer itemStar;

    private String itemGroup;

    private Integer itemStatus;

    private String itemExtend1;

    private String itemExtend2;

    private String itemExtend3;

    private String itemExtend4;

    private String itemExtend5;

    private static final long serialVersionUID = 1L;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getItemSort() {
        return itemSort;
    }

    public void setItemSort(Integer itemSort) {
        this.itemSort = itemSort;
    }

    public Integer getItemStar() {
        return itemStar;
    }

    public void setItemStar(Integer itemStar) {
        this.itemStar = itemStar;
    }

    public String getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(String itemGroup) {
        this.itemGroup = itemGroup == null ? null : itemGroup.trim();
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getItemExtend1() {
        return itemExtend1;
    }

    public void setItemExtend1(String itemExtend1) {
        this.itemExtend1 = itemExtend1 == null ? null : itemExtend1.trim();
    }

    public String getItemExtend2() {
        return itemExtend2;
    }

    public void setItemExtend2(String itemExtend2) {
        this.itemExtend2 = itemExtend2 == null ? null : itemExtend2.trim();
    }

    public String getItemExtend3() {
        return itemExtend3;
    }

    public void setItemExtend3(String itemExtend3) {
        this.itemExtend3 = itemExtend3 == null ? null : itemExtend3.trim();
    }

    public String getItemExtend4() {
        return itemExtend4;
    }

    public void setItemExtend4(String itemExtend4) {
        this.itemExtend4 = itemExtend4 == null ? null : itemExtend4.trim();
    }

    public String getItemExtend5() {
        return itemExtend5;
    }

    public void setItemExtend5(String itemExtend5) {
        this.itemExtend5 = itemExtend5 == null ? null : itemExtend5.trim();
    }
}