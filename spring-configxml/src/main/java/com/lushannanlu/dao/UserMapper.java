package com.lushannanlu.dao;

import com.lushannanlu.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from users")
    List<User> queryUser();
}
