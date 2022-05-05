package com.lushannanlu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.Controller;
/*
    父容器：排除视图组件，扫描除视图组件以外的
 */
@Configuration
@ComponentScan(basePackages = "com.lushannanlu")//开启扫描
@Import({DataSourceConfig.class, MybatisConfig.class})//引入数据源配置和mybatis配置
@PropertySource("classpath:dataSource.properties")//引入数据源文件
@MapperScan("com.lushannanlu.dao")//开启dao层接口扫描
public class SpringConfig {
}
