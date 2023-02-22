package com.design.mode.b_结构型模式.b_适配器模式.a_类适配器模式;

public class Client {

    public static void main(String[] args) {
        Computer computer=new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("---------------");
        String msgTF = computer.readSD(new SDAdapterDF());
        System.out.println(msgTF);
    }
}
