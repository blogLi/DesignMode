package com.design.mode.a_创建者模式.b_工厂模式.a点咖啡案例;

public class Test {

    public static void main(String[] args) {
        CoffeeStore coffeeStore=new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee(CoffeeType.English);
        System.out.println(coffee.getName());
    }
}
