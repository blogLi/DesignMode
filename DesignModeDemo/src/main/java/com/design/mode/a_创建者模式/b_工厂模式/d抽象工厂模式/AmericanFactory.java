package com.design.mode.a_创建者模式.b_工厂模式.d抽象工厂模式;

public class AmericanFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Mochamusi();
    }
}
