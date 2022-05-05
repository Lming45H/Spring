package com.lushannanlu.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ToMarryInvokHandle implements InvocationHandler {
    //为那个目标角色执行方法
    private Object target;
    //
    public ToMarryInvokHandle(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //增强方法
        placeMarry();
        method.invoke(target,args);
        takeMoney();
        return null;
    }

    public void placeMarry(){
        System.out.println("布置婚礼");
    }
    public void takeMoney(){
        System.out.println("收份子钱");
    }
}
