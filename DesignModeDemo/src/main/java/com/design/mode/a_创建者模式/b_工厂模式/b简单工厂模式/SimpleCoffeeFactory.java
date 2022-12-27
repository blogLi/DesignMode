package com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式;

public class SimpleCoffeeFactory {
    public Coffee creatCoffee(CoffeeType coffeeType){

        Coffee coffee=null;
        if (CoffeeType.American.equals(coffeeType)){
            coffee=new AmericanCoffee();
        }else if(CoffeeType.English.equals(coffeeType)){
            coffee=new EnglishCoffee();
        }else {
            throw new RuntimeException("无此咖啡");
        }
        return coffee;
    }
}
