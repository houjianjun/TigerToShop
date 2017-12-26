package com.xtwy.mapper;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.xtwy.bean.ShoppingCart;
import com.xtwy.common.Base;

public class ShoppingCartMapperTest extends Base{
	@Resource
	private ShoppingCartMapper shoppingCartMapper;

	@Test
	public void testSelectByWhere() {
		ShoppingCart shoppingCart=new ShoppingCart();
		shoppingCart.setMemberId(1);
		List<ShoppingCart> list=shoppingCartMapper.selectByWhere(shoppingCart);
		for (ShoppingCart shoppingCart2 : list) {
			System.out.println(shoppingCart2.getGoods().getGoodsName());
		}
	}

}
