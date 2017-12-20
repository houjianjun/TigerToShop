package com.xtwy.mapper;

import javax.annotation.Resource;

import org.junit.Test;

import com.xtwy.bean.GoodsClass;
import com.xtwy.common.Base;

public class GoodsClassMapperTest extends Base{
	@Resource
	private GoodsClassMapper gcm;
	@Test
	public void testDeleteByPrimaryKey() {
		Integer[] keys= {20,21};
		gcm.deleteByPrimaryKey(keys);
	}

	@Test
	public void testInsert() {
		GoodsClass gc=new GoodsClass();
		gc.setGoodsClsName("建材家具");
		gcm.insert(gc);
		
	}

	@Test
	public void testSelectByPrimaryKey() {
		GoodsClass goodsClass=gcm.selectByPrimaryKey(5);
		System.out.println(goodsClass.getGoodsClsName());
	}

	@Test
	public void testUpdateByPrimaryKey() {
		GoodsClass gc=new GoodsClass();
		gc.setGoodsClsId(2);
		gc.setGoodsClsName("建材家具");
		gcm.updateByPrimaryKey(gc);
	}

}
