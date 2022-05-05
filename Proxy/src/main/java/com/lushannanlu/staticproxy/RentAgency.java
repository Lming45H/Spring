package com.lushannanlu.staticproxy;
/*
    房屋中介实现行为，并增强用户行为
 */
public class RentAgency implements ToRentHouse{
    private ToRentHouse target;

    //接受目标角色委托
    public RentAgency(ToRentHouse target) {
        this.target = target;
    }

    @Override
    public void toRentHouse() {
        //增强目标角色行为 看房
        lookHouse();
        //目标角色行为
        target.toRentHouse();
        //增强目标角色行为  签合同
        signWord();

    }

    private void signWord() {
        System.out.println("签合同");
    }

    private void lookHouse() {
        System.out.println("看房子");
    }
}
