package com.lushannanlu.service;

import com.lushannanlu.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    //查询所有用户
    public List<User> queryUser();
}
