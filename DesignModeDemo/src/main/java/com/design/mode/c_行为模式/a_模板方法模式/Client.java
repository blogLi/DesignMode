package com.design.mode.c_行为模式.a_模板方法模式;

public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass=new ConcreteClass_CaiXin();
        abstractClass.cookProcess();
        abstractClass=new ConcreteClass_BaoCai();
        abstractClass.cookProcess();
    }
}
