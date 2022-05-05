package com.lushannanlu.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetContext {

    public static ApplicationContext getContext(){
        return new ClassPathXmlApplicationContext("spring.xml");
    }
}
