package com.xtwy.mapper;

import java.util.List;

import com.xtwy.bean.Goods;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月18日下午5:00:57
 * @描述: 商品Mapper
 */
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsid);
    int insert(Goods record);
    Goods selectByPrimaryKey(Integer goodsid);
    int updateByPrimaryKey(Goods record);
    List<Goods> getGoodsAll();
}