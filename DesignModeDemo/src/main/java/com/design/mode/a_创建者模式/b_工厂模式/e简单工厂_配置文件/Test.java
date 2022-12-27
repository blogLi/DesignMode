package com.design.mode.a_创建者模式.b_工厂模式.e简单工厂_配置文件;

public class Test {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee(CoffeeType.American.getName());
        coffee.getName();
    }
}
