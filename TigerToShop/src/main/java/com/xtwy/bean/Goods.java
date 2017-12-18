package com.xtwy.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private Integer goodsclsid;

    private Integer goodstypeid;

    private BigDecimal price;

    private String stock;

    private Double weight;

    private Integer brandid;

    private Integer grounding;

    private Date createdate;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getGoodsclsid() {
        return goodsclsid;
    }

    public void setGoodsclsid(Integer goodsclsid) {
        this.goodsclsid = goodsclsid;
    }

    public Integer getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(Integer goodstypeid) {
        this.goodstypeid = goodstypeid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock == null ? null : stock.trim();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getGrounding() {
        return grounding;
    }

    public void setGrounding(Integer grounding) {
        this.grounding = grounding;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}