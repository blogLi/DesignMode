package com.design.mode.a_创建者模式.d_建造者模式.a_共享单车;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }

    public Bike construct(){
        builder.buildFrame();;
        builder.buildSeat();
        return builder.createBike();
    }
}
