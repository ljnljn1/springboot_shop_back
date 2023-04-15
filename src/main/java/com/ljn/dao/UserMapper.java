package com.ljn.dao;

import com.ljn.po.User;

import org.apache.ibatis.annotations.Mapper;
import tk_mybatis.MyMapper;

import java.util.List;
@Mapper
public interface UserMapper extends MyMapper<User> {
    List<User> getAllUser();
}