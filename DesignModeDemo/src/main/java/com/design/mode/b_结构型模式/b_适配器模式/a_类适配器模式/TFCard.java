package com.design.mode.b_结构型模式.b_适配器模式.a_类适配器模式;

//适配者类的接口
public interface TFCard {

    //从TF卡中读取数据
    String readTF();

    //往TF卡中写入数据
    void writeTF(String msg);
}
