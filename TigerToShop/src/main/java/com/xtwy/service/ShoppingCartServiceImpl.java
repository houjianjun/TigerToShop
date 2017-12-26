package com.xtwy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xtwy.bean.ShoppingCart;
import com.xtwy.mapper.ShoppingCartMapper;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月21日下午7:03:25
 * @描述: 购物车实现类
 */
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	@Resource
	private ShoppingCartMapper shoppingCartMapper;

	@Override
	public void addShoppingCart(ShoppingCart shoppingCart) {
		// 如果购物车中已存在该商品，进行数量更新，根据用户ID与商品ID查询
		List<ShoppingCart> list = shoppingCartMapper.selectByWhere(shoppingCart);
		if (list.size() > 0) {
			ShoppingCart newShoppingCart = list.get(0);
			newShoppingCart.setGoodsNum(newShoppingCart.getGoodsNum()+shoppingCart.getGoodsNum());
			shoppingCartMapper.updateByPrimaryKey(newShoppingCart);
		} else {
			//不存在则进行更新
			shoppingCartMapper.insert(shoppingCart);
		}
	}

	@Override
	public List<ShoppingCart> getShoppingCart(Integer memberId) {
		ShoppingCart shoppingCart=new ShoppingCart();
		shoppingCart.setMemberId(memberId);
		List<ShoppingCart> list=shoppingCartMapper.selectByWhere(shoppingCart);
		return list;
	}
}
