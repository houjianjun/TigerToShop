package com.xtwy.mapper;

import com.xtwy.bean.Goodspic;

public interface GoodspicMapper {


    int deleteByPrimaryKey(Integer goodspicid);

    int insert(Goodspic record);

    int insertSelective(Goodspic record);

    Goodspic selectByPrimaryKey(Integer goodspicid);

  

    int updateByPrimaryKeySelective(Goodspic record);

    int updateByPrimaryKey(Goodspic record);
}