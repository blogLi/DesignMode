package com.design.mode.a_创建者模式.d_建造者模式.a_共享单车;

public class Test01 {

    public static void main(String[] args) {
        showBike(new MobikeBuilder());
        showBike(new OfoBuilder());
    }

    public static void showBike(Builder builder){
        Director director=new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
