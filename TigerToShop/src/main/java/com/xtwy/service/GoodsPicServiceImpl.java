package com.xtwy.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xtwy.bean.GoodsPic;
import com.xtwy.common.Base64Pic;
import com.xtwy.mapper.GoodsPicMapper;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月19日下午6:34:38
 * @描述: 商品图片实现类
 */
@Service
public class GoodsPicServiceImpl implements GoodsPicService {
	@Resource
	private GoodsPicMapper goodsPicMapper;

	@Override
	public void addGoodsPic(GoodsPic goodsPic) {
		goodsPicMapper.insert(goodsPic);
	}

	@Override
	public void removeGoodsPic(Integer[] keys) {
		goodsPicMapper.deleteByPrimaryKey(keys);
	}

	@Override
	public List<GoodsPic> getGoodsPicAll() {
		return goodsPicMapper.selectByAll();
	}

	@Override
	public List<GoodsPic> getGoodsPic(Integer goodsId) {
		List<GoodsPic> list=goodsPicMapper.selectByGoodsId(goodsId);
		List<GoodsPic> newList=new ArrayList<>();
		for (GoodsPic goodsPic : list) {
			goodsPic.setGoodsPath(Base64Pic.GetImageStr(goodsPic.getGoodsPath()));
			newList.add(goodsPic);
		}
		return newList;
	}

}
