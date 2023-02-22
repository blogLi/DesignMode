package com.design.mode.b_结构型模式.b_适配器模式.a_类适配器模式;

//具体的SD卡
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SDCard read msg: Hello world SD";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg:"+msg);
    }
}
