package com.design.mode.a_创建者模式.b_工厂模式.b简单工厂模式;

public abstract class Coffee {

    public abstract String getName();

    public void addSugar(){
        System.out.println("加糖");
    }

    public void addMilk(){
        System.out.println("加奶");
    }
}
