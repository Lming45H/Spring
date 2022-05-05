package com.lushannanlu;

import com.lushannanlu.dao.UserMapper;
import com.lushannanlu.pojo.User;
import com.lushannanlu.service.UserService;
import com.lushannanlu.utils.GetContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestConstructor;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) Context.getBean("userService");
        List<User> users = userService.queryUser();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
