package com.design.mode.b_结构型模式.g_享元模式;

/**
 * 俄罗斯方块
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
