package com.design.mode.b_结构型模式.a_代理模式.b_jdk动态代理;

//火车站
public class TrainStation implements SellTickets {


    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }


}
