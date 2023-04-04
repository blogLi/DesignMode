package com.design.mode.b_结构型模式.c_装饰者模式;

public class Client {

    public static void main(String[] args) {
        //点一份炒饭
        FastFood food=new FriedRice();
        System.out.println(food.getDesc()+":"+food.cost());
        //在上面炒饭中加一份鸡蛋
        food=new Egg(food);
        System.out.println(food.getDesc()+":"+food.cost());
        //再加一个鸡蛋
        food=new Egg(food);
        System.out.println(food.getDesc()+":"+food.cost());
        //再加一个培根
        food=new Bacon(food);
        System.out.println(food.getDesc()+":1"+food.cost());

    }
}
