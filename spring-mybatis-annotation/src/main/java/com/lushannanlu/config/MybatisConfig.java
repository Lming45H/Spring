package com.lushannanlu.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
public class MybatisConfig {
    //创建SqlSessionFactoryBean对象,设置形参，Spring会自动去调用IOC容器中已有的数据源
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

//    @Bean
//    public MapperScannerConfigurer getMapperScannerConfigurer(){
//        MapperScannerConfigurer mp = new MapperScannerConfigurer();
//        mp.setBasePackage("com.lushannanlu.dao");
//        return mp;
//    }


}
