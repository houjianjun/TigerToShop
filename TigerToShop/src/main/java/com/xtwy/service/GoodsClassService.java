package com.xtwy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xtwy.bean.GoodsClass;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月18日上午10:19:10
 * @描述: 商品类别业务层接口
 */

public interface GoodsClassService {
	/**
	 * 添加商品分类
	 * @param goodsClass
	 */
	public void addGoodsClass(GoodsClass goodsClass);
	/**
	 * 查询所有商品分类
	 * @return
	 */
	public List<GoodsClass> getGoodsClassAll();
	/**
	 * 删除商品分类
	 * @param keys
	 */
	public void removeGoodsClass(Integer[] keys);
	/**
	 * 修改商品分类
	 * @param goodsClass
	 */
	public void editGoodsClass(GoodsClass goodsClass);
}
