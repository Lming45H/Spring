package com.lushannanlu;

import com.lushannanlu.config.Myconfig;
import com.lushannanlu.pojo.Dog;
import com.lushannanlu.pojo.User;
import com.lushannanlu.utils.GetContext;
import org.springframework.context.ApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = GetContext.getContext();
        User user = (User) context.getBean("user");
        System.out.println(user);

        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog);
    }
}
