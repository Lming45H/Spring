package com.lushannanlu.staticproxy;
/*
    用户实现行为
 */
public class User implements ToRentHouse,ToMarry{
    @Override
    public void toRentHouse() {
        System.out.println("我要租两百平米大房子");
    }

    @Override
    public void toMarry() {
        System.out.println("我要去结婚");
    }
}
