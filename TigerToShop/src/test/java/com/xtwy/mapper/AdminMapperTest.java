package com.xtwy.mapper;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;

import com.xtwy.bean.Admin;
import com.xtwy.common.Base;


public class AdminMapperTest extends Base{
	@Resource
	private AdminMapper adminMapper;

	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		Admin admin=adminMapper.selectByPrimaryKey(2);
		System.out.println(admin.getAccount());
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
