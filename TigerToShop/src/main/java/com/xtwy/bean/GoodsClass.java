package com.xtwy.bean;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月18日上午10:20:25
 * @描述: 商品类别
 */
public class GoodsClass {
	private Integer goodsClsId;

	private String goodsClsName;

	private Integer parentClsId;

	private String accessPath;

	private String goodsType;

	private Integer ordersId;

	private String remark;

	public Integer getGoodsClsId() {
		return goodsClsId;
	}

	public void setGoodsClsId(Integer goodsClsId) {
		this.goodsClsId = goodsClsId;
	}

	public Integer getParentClsId() {
		return parentClsId;
	}

	public void setParentClsId(Integer parentClsId) {
		if(parentClsId==null) {
			parentClsId=0;
		}
		this.parentClsId = parentClsId;
	}

	public String getGoodsClsName() {
		return goodsClsName;
	}

	public void setGoodsClsName(String goodsClsName) {
		this.goodsClsName = goodsClsName;
	}

	public String getAccessPath() {
		return accessPath;
	}

	public void setAccessPath(String accessPath) {
		this.accessPath = accessPath;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public Integer getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}