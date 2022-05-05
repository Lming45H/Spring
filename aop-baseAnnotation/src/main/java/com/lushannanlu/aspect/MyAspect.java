package com.lushannanlu.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect//声明切面=切入点+通知 切入点规定在那些方法进行切入 切入时执行那些通知
@Component//交给spring容器实例化
public class MyAspect {

    /*
        定义切入点
     */
    @Pointcut("execution(* com.lushannanlu.service..*.*(..))")
    public void cut(){}

//    @Before(value = "cut()")
//    public void Before(){
//        System.out.println("这是前置通知");
//    }
    @Around(value = "cut()")
    public Object Around(ProceedingJoinPoint pjp){
        //前置通知
        System.out.println("前置通知");
        Object obj = null;
        try{
            obj = pjp.proceed();//不写这句话方法不会被调用，后续通知不被执行
            //返回通知
            System.out.println("返回通知");
        }catch (Throwable e) {
            //异常通知
            e.printStackTrace();
        }
        //最终通知
        System.out.println("最终通知");
        return obj;
    }

}
