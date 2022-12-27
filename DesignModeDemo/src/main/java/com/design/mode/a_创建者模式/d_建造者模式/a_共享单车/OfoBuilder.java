package com.design.mode.a_创建者模式.d_建造者模式.a_共享单车;

public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶底座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
