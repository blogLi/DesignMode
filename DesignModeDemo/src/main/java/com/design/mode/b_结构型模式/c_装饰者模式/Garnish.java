package com.design.mode.b_结构型模式.c_装饰者模式;

import lombok.Data;

/**
 *抽象装饰（Decorator）角色  装饰类
 */
@Data
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public Garnish(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
