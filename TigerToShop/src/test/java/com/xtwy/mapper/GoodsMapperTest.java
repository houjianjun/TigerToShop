package com.xtwy.mapper;

import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.xtwy.bean.Goods;
import com.xtwy.common.Base;

public class GoodsMapperTest extends Base{
	@Resource
	private GoodsMapper goodsMapper;
	@Test
	public void testDeleteByPrimaryKey() {
		
	}

	@Test
	public void testInsert() {
		Goods goods=new Goods();
		goods.setGoodsName("笔记本");
		goodsMapper.insert(goods);
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}
	@Test
	public void testGetGoodsAll() {
		List<Goods> list=goodsMapper.getGoodsAll();
		for (Goods goods : list) {
			System.out.println(goods.getGoodsClass().getGoodsClsName());
		}
	}

}
