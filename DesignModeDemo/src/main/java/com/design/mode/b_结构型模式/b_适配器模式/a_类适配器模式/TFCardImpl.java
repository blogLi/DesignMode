package com.design.mode.b_结构型模式.b_适配器模式.a_类适配器模式;

//适配者类
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "TFCard read msg: Hello world TF";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg:"+msg);
    }
}
