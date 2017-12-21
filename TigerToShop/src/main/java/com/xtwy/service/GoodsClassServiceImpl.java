package com.xtwy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xtwy.bean.GoodsClass;
import com.xtwy.mapper.GoodsClassMapper;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月18日上午11:23:29
 * @描述: 商品类别实现类
 */
@Service
public class GoodsClassServiceImpl implements GoodsClassService {
	@Resource
	private GoodsClassMapper goodsClassMapper;
	
	@Override
	public void addGoodsClass(GoodsClass goodsClass) {
		goodsClassMapper.insert(goodsClass);

	}

	@Override
	public List<GoodsClass> getGoodsClassAll() {
		return goodsClassMapper.selectByAll();
	}

	@Override
	public void removeGoodsClass(Integer[] keys) {
		goodsClassMapper.deleteByPrimaryKey(keys);	
	}

	@Override
	public void editGoodsClass(GoodsClass goodsClass) {
		goodsClassMapper.updateByPrimaryKey(goodsClass);
	}

	@Override
	public GoodsClass getGoodsClass(Integer goodsClsId) {
		return goodsClassMapper.selectByPrimaryKey(goodsClsId);
	}

}
