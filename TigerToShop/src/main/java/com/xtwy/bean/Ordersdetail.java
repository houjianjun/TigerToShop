package com.xtwy.bean;

import java.math.BigDecimal;

public class Ordersdetail {
    private Integer orderdetailid;

    private String ordersnum;

    private String goodsid;

    private BigDecimal price;

    private Integer goodsnum;

    private String remark;

    public Integer getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    public String getOrdersnum() {
        return ordersnum;
    }

    public void setOrdersnum(String ordersnum) {
        this.ordersnum = ordersnum == null ? null : ordersnum.trim();
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}