package com.design.mode.c_行为模式.c_命令模式;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Order order1=new Order();
        order1.setDiningTable("1号");
        order1.setFood("鸡蛋面",1);
        order1.setFood("可乐",2);
        Order order2=new Order();
        order2.setDiningTable("2号");
        order2.setFood("煎饼",1);
        order2.setFood("白开水",2);
        SeniorChef receiver=new SeniorChef();
        Command command1=new OrderCommand(receiver,order1);
        Command command2=new OrderCommand(receiver,order2);
        List<Command> commands=new ArrayList<>();
        commands.add(command1);
        commands.add(command2);
        Waitor waitor=new Waitor();
        waitor.setCommands(commands);
        waitor.orderUp();

        Thread thread=new Thread();
        thread.start();
        thread.run();

    }
}
