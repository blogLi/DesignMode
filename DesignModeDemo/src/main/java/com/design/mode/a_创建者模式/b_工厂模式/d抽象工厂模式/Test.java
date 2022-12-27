package com.design.mode.a_创建者模式.b_工厂模式.d抽象工厂模式;

public class Test {

    public static void main(String[] args) {
        ItalyFactory italyFactory=new ItalyFactory();
        italyFactory.createCoffee().getName();
        italyFactory.createDessert().show();
        AmericanFactory americanFactory=new AmericanFactory();
        americanFactory.createCoffee().getName();
        americanFactory.createDessert().show();
    }
}
