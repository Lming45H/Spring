package com.lushannanlu.config;

import com.lushannanlu.pojo.Dog;
import com.lushannanlu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//spring配置类
@Configuration
@ComponentScan(value="com.lushannanlu")//将扫描到加了四类注解的类都交给spring管理 且id默认为首字母小写
public class Myconfig {

}
