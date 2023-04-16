package com.design.mode.c_行为模式.c_命令模式;

import java.util.Map;

/**
 *  具体命令（Concrete Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 */
public class OrderCommand implements Command{

    //持有接收者对象
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"桌的订单");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (String key:foodDir.keySet()){
            receiver.makeFood(key,foodDir.get(key));
        }
        System.out.println(order.getDiningTable()+"桌的饭准备完毕！");
    }
}
