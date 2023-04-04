package com.design.mode.b_结构型模式.c_装饰者模式;

/**
 * 鸡蛋类 具体装饰（ConcreteDecorator）角色
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(4,"培根",fastFood);
    }

    @Override
    public float cost() {
        //计算价格
        return getPrice()+getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
