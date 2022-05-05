package com.lushannanlu.jdkProxy;

import com.lushannanlu.staticproxy.ToMarry;
import com.lushannanlu.staticproxy.ToRentHouse;
import com.lushannanlu.staticproxy.User;

public class JdkProxyTest {
    public static void main(String[] args) {
        //目标对象
        User user = new User();
        //不同行为方法代理对象增强处理程序
        ToRentHouseInvokHandle handle = new ToRentHouseInvokHandle(user);
        //目标角色委托代理类
        JdkProxy jdkProxy = new JdkProxy(user,handle);
        //得到代理对象
        ToRentHouse proxy = (ToRentHouse) jdkProxy.getProxy();
        //代理对象执行方法
        proxy.toRentHouse();

        ToMarryInvokHandle toMarryInvokHandle = new ToMarryInvokHandle(user);
        JdkProxy jdkProxy1 = new JdkProxy(user, toMarryInvokHandle);
        ToMarry proxy1 = (ToMarry) jdkProxy1.getProxy();
        proxy1.toMarry();
    }
}
