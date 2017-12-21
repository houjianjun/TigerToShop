package com.xtwy.service;

import java.util.List;

import com.xtwy.bean.Goods;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月18日下午6:59:48
 * @描述: 商品业务接口
 */
public interface GoodsService {
	/**
	 * 获取所有商品
	 * @return
	 */
	List<Goods> getGoodsAll();
	/**
	 * 添加商品
	 * @param goods
	 */
	public void addGoods(Goods goods);
	void removeGoods(Integer[] keys);
	/**
	 * 获取楼层商品
	 * @param className
	 * @return
	 */
	List<Goods> getFloorGoodsList(String className);
	/**
	 * 获取一个商品
	 */
	Goods getGoods(Integer goodsId);

}
