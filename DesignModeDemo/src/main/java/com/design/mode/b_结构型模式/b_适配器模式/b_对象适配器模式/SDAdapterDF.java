package com.design.mode.b_结构型模式.b_适配器模式.b_对象适配器模式;

//适配器类
public class SDAdapterDF  implements SDCard {

    //声明适配者类
    private TFCard tfCard;

    public SDAdapterDF(TFCard tfCard){
        this.tfCard=tfCard;
    }
    @Override
    public String readSD() {
        System.out.println("Adapter read TFCard");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("Adapter write TFCard");
        tfCard.writeTF(msg);
    }
}
