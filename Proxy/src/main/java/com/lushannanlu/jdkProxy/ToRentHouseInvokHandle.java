package com.lushannanlu.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ToRentHouseInvokHandle implements InvocationHandler {
    private Object target;

    public ToRentHouseInvokHandle(Object target){
        this.target = target;
    }

    //代理角色的处理程序，增强行为 proxy:代理对象 method:目标角色的方法 args:目标对象的方法形参
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //目标行为增强
        lookHouse();
        //目标角色的方法实现
        Object result = method.invoke(target,args);
        signWord();
        //目标方法的返回值
        return result;
    }
    //
    private void signWord() {
        System.out.println("签合同");
    }

    private void lookHouse() {
        System.out.println("看房子");
    }
}
