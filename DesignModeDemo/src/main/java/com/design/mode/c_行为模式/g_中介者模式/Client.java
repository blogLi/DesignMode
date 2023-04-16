package com.design.mode.c_行为模式.g_中介者模式;

public class Client {

    public static void main(String[] args) {

        //创建中介者对象
        MediatorStructure mediator=new MediatorStructure();
        //创建租房者对象
        Tenant tenant=new Tenant("小明",mediator);
        //创建房东对象
        HouseOwner houseOwner=new HouseOwner("张三",mediator);
        //中介知道具体的租房者和房东
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);
        tenant.constact("我要三居室");
        houseOwner.constact("我这有三室");
    }
}
