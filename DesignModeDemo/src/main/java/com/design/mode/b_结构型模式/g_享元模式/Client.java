package com.design.mode.b_结构型模式.g_享元模式;

public class Client {
    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox box = instance.getBox("O");
        box.display("红色");
    }
}
