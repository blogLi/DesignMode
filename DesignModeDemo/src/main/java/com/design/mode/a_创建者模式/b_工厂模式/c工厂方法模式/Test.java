package com.design.mode.a_创建者模式.b_工厂模式.c工厂方法模式;

public class Test {

    public static void main(String[] args) {
        CoffeeStore coffeeStore=new CoffeeStore();
        coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());
        System.out.println(coffeeStore.orderCoffee().getName());;
        coffeeStore.setCoffeeFactory(new EnglishFactory());
        System.out.println(coffeeStore.orderCoffee().getName());
    }
}
