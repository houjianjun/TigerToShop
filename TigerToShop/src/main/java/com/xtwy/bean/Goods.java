package com.xtwy.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月18日下午4:59:56
 * @描述: 商品实体类
 */
public class Goods {
	private Integer goodsId;

	private String goodsName;

	private Integer goodsClsId;

	private Integer goodsTypeId;

	private BigDecimal price;

	private String stock;

	private Double weight;

	private Integer brandId;

	private Integer grounding;

	private Date createDate;
	//商品类别
	private GoodsClass goodsClass;
	//商品类型
	private GoodsType goodsType;
	//商品图片
	private List<GoodsPic> goodsPic;

	public List<GoodsPic> getGoodsPic() {
		return goodsPic;
	}

	public void setGoodsPic(List<GoodsPic> goodsPic) {
		this.goodsPic = goodsPic;
	}

	public GoodsClass getGoodsClass() {
		return goodsClass;
	}

	public void setGoodsClass(GoodsClass goodsClass) {
		this.goodsClass = goodsClass;
	}

	public GoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getGoodsClsId() {
		return goodsClsId;
	}

	public void setGoodsClsId(Integer goodsClsId) {
		this.goodsClsId = goodsClsId;
	}

	public Integer getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(Integer goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
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
		this.stock = stock;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getGrounding() {
		return grounding;
	}

	public void setGrounding(Integer grounding) {
		this.grounding = grounding;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = new Date();
	}
}