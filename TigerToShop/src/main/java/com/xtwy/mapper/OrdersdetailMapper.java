package com.xtwy.mapper;

import com.xtwy.bean.Ordersdetail;

public interface OrdersdetailMapper {
  

    int deleteByPrimaryKey(Integer orderdetailid);

    int insert(Ordersdetail record);

    int insertSelective(Ordersdetail record);

    Ordersdetail selectByPrimaryKey(Integer orderdetailid);


    int updateByPrimaryKeySelective(Ordersdetail record);

    int updateByPrimaryKey(Ordersdetail record);
}