package com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式.静态工厂;

import com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式.Coffee;
import com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式.CoffeeType;

public class Test {
    public static void main(String[] args) {
        Coffee coffee = SimpleCoffeeFactory.creatCoffee(CoffeeType.English);
        System.out.println(coffee.getName());
    }
}
