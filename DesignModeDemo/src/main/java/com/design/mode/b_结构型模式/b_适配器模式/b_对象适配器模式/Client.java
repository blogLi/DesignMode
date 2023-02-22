package com.design.mode.b_结构型模式.b_适配器模式.b_对象适配器模式;

public class Client {

    public static void main(String[] args) {
        Computer computer=new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("---------------");
        String tfMsg = computer.readSD(new SDAdapterDF(new TFCardImpl()));
        System.out.println(tfMsg);
    }
}
