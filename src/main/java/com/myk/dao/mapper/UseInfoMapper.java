package com.myk.dao.mapper;

import com.myk.dao.entity.UseInfo;

public interface UseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseInfo record);

    int insertSelective(UseInfo record);

    UseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseInfo record);

    int updateByPrimaryKey(UseInfo record);
}