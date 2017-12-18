package com.xtwy.bean;

public class Goodspic {
    private Integer goodspicid;

    private String goodspath;

    private Integer goodsid;

    public Integer getGoodspicid() {
        return goodspicid;
    }

    public void setGoodspicid(Integer goodspicid) {
        this.goodspicid = goodspicid;
    }

    public String getGoodspath() {
        return goodspath;
    }

    public void setGoodspath(String goodspath) {
        this.goodspath = goodspath == null ? null : goodspath.trim();
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }
}