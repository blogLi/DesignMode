package com.design.mode.b_结构型模式.c_装饰者模式;

/**
 * 炒面类   具体构件（Concrete Component）角色
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(8,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
