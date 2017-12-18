package com.xtwy.mapper;

import com.xtwy.bean.Roles;

public interface RolesMapper {

    int deleteByPrimaryKey(Integer rolesid);

    int insert(Roles record);

    int insertSelective(Roles record);

    Roles selectByPrimaryKey(Integer rolesid);

   

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}