package com.xtwy.bean;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月19日下午6:23:51
 * @描述: 商品图片
 */
public class GoodsPic {
    private Integer goodsPicId;

    private String goodsPath;

    private Integer goodsId;

    private Integer isFirst;

	public Integer getGoodsPicId() {
		return goodsPicId;
	}

	public void setGoodsPicId(Integer goodsPicId) {
		this.goodsPicId = goodsPicId;
	}

	public String getGoodsPath() {
		return goodsPath;
	}

	public void setGoodsPath(String goodsPath) {
		this.goodsPath = goodsPath;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getIsFirst() {
		return isFirst;
	}

	public void setIsFirst(Integer isFirst) {
		this.isFirst = isFirst;
	}
}