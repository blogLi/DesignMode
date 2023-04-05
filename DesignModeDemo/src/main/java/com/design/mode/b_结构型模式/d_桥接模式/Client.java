package com.design.mode.b_结构型模式.d_桥接模式;

public class Client {

    public static void main(String[] args) {

        OpratingSystem system=new Mac(new AviFile());
        system.play("葫芦娃");
    }
}
