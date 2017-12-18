package com.xtwy.bean;

public class Goodsclass {
    private Integer goodsclsid;

    private String goodsclsname;

    private String accesspath;

    private String goodstype;

    private Integer ordersid;

    private String remark;

    public Integer getGoodsclsid() {
        return goodsclsid;
    }

    public void setGoodsclsid(Integer goodsclsid) {
        this.goodsclsid = goodsclsid;
    }

    public String getGoodsclsname() {
        return goodsclsname;
    }

    public void setGoodsclsname(String goodsclsname) {
        this.goodsclsname = goodsclsname == null ? null : goodsclsname.trim();
    }

    public String getAccesspath() {
        return accesspath;
    }

    public void setAccesspath(String accesspath) {
        this.accesspath = accesspath == null ? null : accesspath.trim();
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype == null ? null : goodstype.trim();
    }

    public Integer getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(Integer ordersid) {
        this.ordersid = ordersid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}