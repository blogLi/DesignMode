package com.design.mode.a_创建者模式.a_单例模式.b_懒汉式.c_双重检查锁;


public class Singleton {

    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
