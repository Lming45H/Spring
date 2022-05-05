package com.lushannanlu.staticproxy;

public class HouseTest {
    public static void main(String[] args) {

        //目标角色
        ToRentHouse user = new User();

        //代理角色
        RentAgency rentAgency = new RentAgency(user);//目标角色委托代理角色

        //代理角色实现目标角色行为
        rentAgency.toRentHouse();
    }
}
