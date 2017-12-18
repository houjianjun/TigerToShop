package com.xtwy.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xtwy.bean.GoodsType;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月15日下午1:27:57
 * @描述: 商品类型Mapper接口
 */
@Repository
public interface GoodsTypeMapper {
	/**
	 * 删除记录
	 * @param goodstypeid
	 * @return
	 */
	int deleteByPrimaryKeys(Integer[] goodsTypeId);
	/**
	 * 添加记录
	 * @param record
	 * @return
	 */
	int insert(GoodsType record);
	/**
	 * 更改记录
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(GoodsType record);
	/**
	 * 根据主键查询记录
	 * @param goodstypeid
	 * @return
	 */
	GoodsType selectByPrimaryKey(Integer goodstypeid);
	/**
	 * 查询所有记录
	 * @return
	 */
	List<GoodsType> selectByAll();
}