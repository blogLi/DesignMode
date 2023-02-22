package com.design.mode.b_结构型模式.b_适配器模式.a_类适配器模式;

//目标接口
public interface SDCard {

    //从SD卡中读取数据
    String readSD();

    //往SD卡中写入数据
    void writeSD(String msg);
}
