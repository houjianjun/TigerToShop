package com.xtwy.mapper;

import org.springframework.stereotype.Repository;

import com.xtwy.bean.Admin;

@Repository
public interface AdminMapper {

    int deleteByPrimaryKey(Integer adminid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}