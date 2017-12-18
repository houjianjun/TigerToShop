package com.xtwy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xtwy.bean.GoodsType;
import com.xtwy.mapper.GoodsTypeMapper;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月15日上午11:59:03
 * @描述: 商品类型业务实现类
 */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
	@Resource
	private GoodsTypeMapper goodsTypeMapper;

	public void addGoodsType(GoodsType goodsType) {
		goodsTypeMapper.insert(goodsType);
	}

	@Override
	public List<GoodsType> getGoodsTypeAll() {
		return goodsTypeMapper.selectByAll();
	}

	@Override
	public void removeGoodsType(Integer[] keys) {
		goodsTypeMapper.deleteByPrimaryKeys(keys);
	}

	@Override
	public void editGoodsType(GoodsType goodsType) {
		goodsTypeMapper.updateByPrimaryKey(goodsType);
		
	}
}
