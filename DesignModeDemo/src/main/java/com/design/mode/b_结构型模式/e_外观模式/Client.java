package com.design.mode.b_结构型模式.e_外观模式;

public class Client {

    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade=new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开");
    }
}
