package com.design.mode.a_创建者模式.b_工厂模式.a点咖啡案例;

public class CoffeeStore {

    public Coffee orderCoffee(CoffeeType coffeeType){
        Coffee coffee=null;
        if(CoffeeType.American.equals(coffeeType)){
            coffee=new AmericanCoffee();
        }else if (CoffeeType.English.equals(coffeeType)){
            coffee=new EnglishCoffee();
        }else {
            throw new RuntimeException("无此咖啡");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
