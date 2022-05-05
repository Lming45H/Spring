package com.lushannanlu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = "com.lushannanlu")//开启扫描
@EnableAspectJAutoProxy//开启aop
public class Myconfig {
}
