package com.xtwy.mapper;

import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.xtwy.bean.GoodsPic;
import com.xtwy.common.Base;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月19日下午6:31:02
 * @描述: 商品图片测试
 */
public class GoodsPicMapperTest extends Base {

	@Resource
	private GoodsPicMapper goodsPicMapper;

	@Test
	public void testDeleteByPrimaryKey() {

	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
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
	public void testSelectByGoodsId() {
		List<GoodsPic> list = goodsPicMapper.selectByGoodsId(1);
		System.out.println(list.size());
	}

}
