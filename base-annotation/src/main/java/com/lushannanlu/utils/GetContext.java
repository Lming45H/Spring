package com.lushannanlu.utils;

import com.lushannanlu.config.Myconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetContext {

    public static ApplicationContext getContext(){
        return new AnnotationConfigApplicationContext(Myconfig.class);
    }
}
