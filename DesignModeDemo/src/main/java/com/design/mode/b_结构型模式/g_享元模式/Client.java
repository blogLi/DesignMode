package com.design.mode.b_结构型模式.g_享元模式;

public class Client {
    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox box1 = instance.getBox("O");
        box1.display("红色");

        AbstractBox box2 = instance.getBox("I");
        box2.display("白色");

        AbstractBox box3 = instance.getBox("I");
        box3.display("紫色");

        System.out.println(box2==box3);

        Integer i1=2;
        Integer i2=3;

    }
}
