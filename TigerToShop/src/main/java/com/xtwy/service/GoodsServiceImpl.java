package com.xtwy.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xtwy.bean.Goods;
import com.xtwy.bean.GoodsClass;
import com.xtwy.bean.GoodsPic;
import com.xtwy.common.Base64Pic;
import com.xtwy.mapper.GoodsClassMapper;
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
	@Resource
	private GoodsClassMapper goodsClassMapper;

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

	@Override
	public List<Goods> getFloorGoodsList(String className) {
		GoodsClass temp = new GoodsClass();
		temp.setGoodsClsName(className);
		List<GoodsClass> clsList = goodsClassMapper.selectByWhere(temp);
		Goods goods = new Goods();
		if (clsList.size() > 0) {
			goods.setGoodsClsId(clsList.get(0).getGoodsClsId());
		}
		List<Goods> list = goodsMapper.getFloorGoodsList(goods);
		List<Goods> newList = new ArrayList<>();
		for (Goods goods2 : list) {
			for (GoodsPic GoodsPic : goods2.getGoodsPic()) {
				GoodsPic.setGoodsPath(Base64Pic.GetImageStr(GoodsPic.getGoodsPath()));
			}
			newList.add(goods2);
		}
		return list;
	}

	@Override
	public Goods getGoods(Integer goodsId) {
		return goodsMapper.selectByPrimaryKey(goodsId);
	}
}
