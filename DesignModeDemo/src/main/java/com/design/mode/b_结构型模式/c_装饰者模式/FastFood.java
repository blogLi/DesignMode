package com.design.mode.b_结构型模式.c_装饰者模式;

import lombok.Data;

//快餐类  抽象构件（Component）角色
@Data
public abstract class FastFood {

    private float price;

    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public abstract float cost();
}
