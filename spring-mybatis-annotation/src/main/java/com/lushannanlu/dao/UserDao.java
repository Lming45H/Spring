package com.lushannanlu.dao;

import com.lushannanlu.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface UserDao {
    //查询所有用户
    @Select("select * from users")
    List<User> queryUser();
}
