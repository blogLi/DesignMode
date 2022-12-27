package com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式.静态工厂;

import com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式.AmericanCoffee;
import com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式.Coffee;
import com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式.CoffeeType;
import com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式.EnglishCoffee;

public class SimpleCoffeeFactory {
    public static  Coffee creatCoffee(CoffeeType coffeeType){

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
