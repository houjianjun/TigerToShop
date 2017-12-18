package com.xtwy.mapper;

import com.xtwy.bean.Member;

public interface MemberMapper {
  

    int deleteByPrimaryKey(Integer memberid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer memberid);


    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}