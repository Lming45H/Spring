package com.lushannanlu.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
    动态生成指定接口的代理类(代理角色实现什么行为)
 */
public class JdkProxy {
    //目标角色
    private Object target;
    private InvocationHandler handler;
    //得到目标角色
    public JdkProxy(Object target,InvocationHandler handler){
        this.target = target;
        this.handler = handler;
    }
    public Object getProxy(){
        //返回得到目标角色的代理对象 三个参数：类加载器，目标角色实现的接口数组,处理程序
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(), handler);
    }


}
