package com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式;



public class CoffeeStore {

    public Coffee orderCoffee(CoffeeType coffeeType){
        SimpleCoffeeFactory simpleCoffeeFactory=new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.creatCoffee(coffeeType);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
