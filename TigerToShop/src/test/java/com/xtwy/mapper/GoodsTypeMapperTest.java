package com.xtwy.mapper;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;

import com.xtwy.bean.GoodsType;
import com.xtwy.common.Base;

public class GoodsTypeMapperTest extends Base{
	@Resource
	private GoodsTypeMapper gtm;
	
	@Test
	public void testDeleteByPrimaryKey() {
		Integer[] keys= {6};
		gtm.deleteByPrimaryKeys(keys);
	}

	@Test
	public void testInsert() {
		GoodsType goodstype=new GoodsType();
		goodstype.setGoodsType("衣服");
		gtm.insert(goodstype);
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
