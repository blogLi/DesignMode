package com.design.mode.a_创建者模式.b_工厂模式.c工厂方法模式;

public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
