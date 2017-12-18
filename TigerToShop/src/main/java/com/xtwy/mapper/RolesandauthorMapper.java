package com.xtwy.mapper;

import com.xtwy.bean.Rolesandauthor;

public interface RolesandauthorMapper {


    int deleteByPrimaryKey(Integer raid);

    int insert(Rolesandauthor record);

    int insertSelective(Rolesandauthor record);

    Rolesandauthor selectByPrimaryKey(Integer raid);

  

    int updateByPrimaryKeySelective(Rolesandauthor record);

    int updateByPrimaryKey(Rolesandauthor record);
}