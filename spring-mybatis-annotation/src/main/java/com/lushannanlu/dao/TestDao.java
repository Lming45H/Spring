package com.lushannanlu.dao;

import com.lushannanlu.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

public interface TestDao {
    @Select("select * from users where username = #{username}")
    User queryUserByName(@Param("username") String username);
}
