package com.ljn.dao;

import com.ljn.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {

    List<User> getAllUser();
}
