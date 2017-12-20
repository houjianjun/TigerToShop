package com.xtwy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xtwy.bean.Goods;
import com.xtwy.mapper.GoodsMapper;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月18日下午7:08:16
 * @描述: 商品业务实现类
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> getGoodsAll() {
		return goodsMapper.getGoodsAll();
	}

	@Override
	public void addGoods(Goods goods) {
		//
		goodsMapper.insert(goods);		
	}

	@Override
	public void removeGoods(Integer[] keys) {
		goodsMapper.deleteByPrimaryKey(keys);
	}

}
