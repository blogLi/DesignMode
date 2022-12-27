package com.design.mode.a_创建者模式.d_建造者模式.a_共享单车;

public class MobikeBuilder extends Builder{

    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
