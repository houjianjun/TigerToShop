package com.xtwy.mapper;

import com.xtwy.bean.Goodsclass;

public interface GoodsclassMapper {


    int deleteByPrimaryKey(Integer goodsclsid);

    int insert(Goodsclass record);

    int insertSelective(Goodsclass record);

    Goodsclass selectByPrimaryKey(Integer goodsclsid);

   
    int updateByPrimaryKeySelective(Goodsclass record);

    int updateByPrimaryKey(Goodsclass record);
}