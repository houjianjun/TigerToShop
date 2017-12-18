package com.xtwy.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xtwy.bean.GoodsType;
import com.xtwy.common.Base;

public class GoodsTypeServiceImplTest extends Base{
	@Autowired
	private GoodsTypeService goodsTypeService;
	
	@Test
	public void testAddGoodsType() {
		GoodsType goodsType=new GoodsType();
		goodsType.setGoodsType("服装");
		goodsTypeService.addGoodsType(goodsType);
	}
	
	@Test
	public void testGetGoodsType() {
		List<GoodsType> list=goodsTypeService.getGoodsTypeAll();
		for (GoodsType goodsType : list) {
			System.out.println(goodsType.getGoodsType());
		}
	}

}
