package com.xtwy.service;

import java.util.List;

import com.xtwy.bean.GoodsType;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月15日上午11:58:28
 * @描述: 商品类型业务类
 */
public interface GoodsTypeService {
	/**
	 * 添加商品类型
	 * @param goodsType
	 */
	public void addGoodsType(GoodsType goodsType);
	/**
	 * 获取所有商品
	 * @return
	 */
	public List<GoodsType> getGoodsTypeAll();
	/**
	 * 删除商品
	 * @param keys
	 */
	public void removeGoodsType(Integer[] keys);
	/**
	 * 修改商品
	 * @param goodsType
	 */
	public void editGoodsType(GoodsType goodsType);
}
