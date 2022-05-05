package com.lushannanlu;

import static org.junit.Assert.assertTrue;

import com.lushannanlu.config.Myconfig;
import com.lushannanlu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        assertTrue( true );
    }
    @Test
    public void aopTest(){
        ApplicationContext Context = new AnnotationConfigApplicationContext(Myconfig.class);
        UserService userService = (UserService) Context.getBean("userService");
        userService.doSome();
    }
}
