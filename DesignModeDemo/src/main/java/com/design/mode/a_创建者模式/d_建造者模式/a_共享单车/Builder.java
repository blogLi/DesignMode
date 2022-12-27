package com.design.mode.a_创建者模式.d_建造者模式.a_共享单车;

public abstract class Builder {

    protected Bike mBike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
