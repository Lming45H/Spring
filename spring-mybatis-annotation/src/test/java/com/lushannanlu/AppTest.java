package com.lushannanlu;

import static org.junit.Assert.assertTrue;

import com.lushannanlu.config.SpringConfig;
import com.lushannanlu.pojo.User;
import com.lushannanlu.service.UserServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
       ApplicationContext Context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServiceImp userSericeImp = (UserServiceImp) Context.getBean("userServiceImp");
        User zhangsan = userSericeImp.queryUserByName("zhangsan");
        System.out.println(zhangsan);
    }
}
