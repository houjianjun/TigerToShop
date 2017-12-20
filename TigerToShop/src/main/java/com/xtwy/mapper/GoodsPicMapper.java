package com.xtwy.mapper;

import java.util.List;

import com.xtwy.bean.GoodsPic;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月19日下午6:24:53
 * @描述: 商品图片Mapper
 */
public interface GoodsPicMapper {
    int insert(GoodsPic record);
    GoodsPic selectByPrimaryKey(Integer goodspicid);
    int updateByPrimaryKey(GoodsPic record);
	void deleteByPrimaryKey(Integer[] keys);
	List<GoodsPic> selectByAll();
	List<GoodsPic> selectByGoodsId(Integer goodsId);
}