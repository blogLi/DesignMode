package com.design.mode.a_创建者模式.b_工厂模式.c工厂方法模式;


public class CoffeeStore {


    private CoffeeFactory coffeeFactory;

    public CoffeeFactory getCoffeeFactory() {
        return coffeeFactory;
    }

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(){
        return coffeeFactory.createCoffee();
    }
}
