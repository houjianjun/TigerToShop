package com.xtwy.mapper;

import java.util.List;

import com.xtwy.bean.GoodsClass;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月18日上午10:26:21
 * @描述: 商品分类Mapper接口
 */
public interface GoodsClassMapper {
	/**
	 * 删除商品分类
	 * @param goodsClsId
	 * @return
	 */
    int deleteByPrimaryKey(Integer[] goodsclsid);
    /**
     * 添加商品分类
     * @param record
     * @return
     */
    int insert(GoodsClass record);
    /**
     * 查询一个商品分类
     * @param goodsclsid
     * @return
     */
    GoodsClass selectByPrimaryKey(Integer goodsclsid);
    /**
     * 更改商品分类
     * @param record
     * @return
     */
    int updateByPrimaryKey(GoodsClass record);
    /**
     * 查询所有类别
     * @return
     */
    List<GoodsClass> selectByAll();
    /**
     * 按条件查询
     * @param goodsClass
     * @return
     */
    List<GoodsClass> selectByWhere(GoodsClass goodsClass);
}