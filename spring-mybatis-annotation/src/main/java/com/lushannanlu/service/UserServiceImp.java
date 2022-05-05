package com.lushannanlu.service;

import com.lushannanlu.dao.TestDao;
import com.lushannanlu.dao.UserDao;
import com.lushannanlu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImp implements UserService{
    @Autowired(required = false)
    private UserDao userDao;
    @Autowired(required = false)
    private TestDao testDao;
    @Override
    public List<User> queryUser() {
        return userDao.queryUser();
    }

    public User queryUserByName(String username){
        return testDao.queryUserByName(username);
    }
}
