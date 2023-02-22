package com.design.mode.b_结构型模式.b_适配器模式.b_对象适配器模式;

public class Computer {

    //从SD中读取数据
    public String readSD(SDCard sdCard){
        if (sdCard==null){
            throw new RuntimeException("SDCard不能为空");
        }
        return sdCard.readSD();
    }
}
