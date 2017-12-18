package com.xtwy.mapper;

import com.xtwy.bean.Author;

public interface AuthorMapper {


    int deleteByPrimaryKey(Integer authorid);

    int insert(Author record);

    int insertSelective(Author record);

    Author selectByPrimaryKey(Integer authorid);

  
    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
}