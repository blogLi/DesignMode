package com.design.mode.b_结构型模式.b_适配器模式.a_类适配器模式;

//适配器类
public class SDAdapterDF extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("Adapter read TFCard");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("Adapter write TFCard");
        writeTF(msg);
    }
}
