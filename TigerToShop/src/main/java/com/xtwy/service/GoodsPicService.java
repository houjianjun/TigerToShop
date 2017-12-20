package com.xtwy.service;

import java.util.List;

import com.xtwy.bean.Goods;
import com.xtwy.bean.GoodsPic;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月19日下午6:33:02
 * @描述: 商品图片上传接口
 */

public interface GoodsPicService {
	public void removeGoodsPic(Integer[] keys);
	List<GoodsPic> getGoodsPicAll();
	public void addGoodsPic(GoodsPic goodsPic);
	/**
	 * 获取商品所有ID
	 * @param goodsId
	 * @return
	 */
	List<GoodsPic> getGoodsPic(Integer goodsId);
}
