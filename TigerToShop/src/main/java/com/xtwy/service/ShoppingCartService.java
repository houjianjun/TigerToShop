package com.xtwy.service;

import java.util.List;

import com.xtwy.bean.ShoppingCart;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月21日下午7:01:53
 * @描述: 购物车接口
 */
public interface ShoppingCartService {
	//添加商品到购物车
	public void addShoppingCart(ShoppingCart shoppingCart);
	//根据用户Id获取购物车信息
	public List<ShoppingCart> getShoppingCart(Integer memberId);
}
