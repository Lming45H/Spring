package com.lushannanlu.service;

import com.lushannanlu.dao.UserMapper;
import com.lushannanlu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserMapper userMapper;//需要一个接口的代理对象

    public List<User> queryUser(){
        return userMapper.queryUser();//通过代理对象执行接口中的方法
    }
}
