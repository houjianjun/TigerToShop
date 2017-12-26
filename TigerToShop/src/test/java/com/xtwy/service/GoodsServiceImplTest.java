package com.xtwy.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.xtwy.bean.Goods;
import com.xtwy.bean.GoodsPic;
import com.xtwy.common.Base;

public class GoodsServiceImplTest extends Base{
	@Resource
	private GoodsService goodsService;
	@Test
	public void testGetFloorGoodsList() {
		List<Goods> list=goodsService.getFloorGoodsList("建材家具");
		for (Goods goods : list) {
			System.out.println(goods.getGoodsName());
			for (GoodsPic goodsPic : goods.getGoodsPic()) {
				System.out.println(goodsPic.getGoodsPath());
			}
		}
	}

}
