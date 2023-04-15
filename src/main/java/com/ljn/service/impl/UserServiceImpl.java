package com.ljn.service.impl;

import com.ljn.dao.UserDao;
import com.ljn.dao.UserMapper;
import com.ljn.po.User;
import com.ljn.service.UserSercvice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
  @Author:lijingnan
  @Date:2023/4/13 17:09
  @Description:
*/
@Service
public class UserServiceImpl implements UserSercvice {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
