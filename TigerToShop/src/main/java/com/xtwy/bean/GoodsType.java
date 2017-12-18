package com.xtwy.bean;

public class GoodsType {
    private Integer goodsTypeId;
    private String goodsTypeName;
    private String accessPath;
    private String goodsType;
    private String tempPrefix;
    private String contextPrefix;
    private String remark;
	public Integer getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(Integer goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
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

	public String getTempPrefix() {
		return tempPrefix;
	}

	public void setTempPrefix(String tempPrefix) {
		this.tempPrefix = tempPrefix;
	}

	public String getContextPrefix() {
		return contextPrefix;
	}

	public void setContextPrefix(String contextPrefix) {
		this.contextPrefix = contextPrefix;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
