package com.design.mode.other.factory;


import com.design.mode.a_创建者模式.b_工厂模式.e简单工厂_配置文件.Coffee;

public class AmericanCoffee extends Coffee {

    @Override
    public void getName() {
        System.out.println("美式咖啡");
    }
}
