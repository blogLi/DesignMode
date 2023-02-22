package com.design.mode.b_结构型模式.a_代理模式.a_静态代理;

//代售点
public class ProxyPoint implements SellTickets{

    //声明火车站对象
    private TrainStation trainStation=new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取服务费用");
        trainStation.sell();
    }
}
