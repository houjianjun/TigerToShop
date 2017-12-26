package com.xtwy.mapper;

import java.util.List;

import com.xtwy.bean.ShoppingCart;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月21日下午6:56:42
 * @描述: 购物车Mapper接口
 */
public interface ShoppingCartMapper {

    int deleteByPrimaryKey(Integer cartId);

    int insert(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKey(ShoppingCart record);
    
    List<ShoppingCart> selectByWhere(ShoppingCart shoppingCart);
}
