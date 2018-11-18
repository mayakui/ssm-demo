package com.myk.service;

import com.myk.dao.entity.UseInfo;
import com.myk.dao.mapper.UseInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/11/17 0017.
 */

@Service
public class UseInfoService {

    @Autowired
    private UseInfoMapper useInfoMapper;

    public UseInfo getUseInfo(Integer id){
        return useInfoMapper.selectByPrimaryKey(id);
    }
}
