package com.design.mode.a_创建者模式.a_单例模式.c_存在问题.b_反射问题解决;

public class Singleton {

    private static boolean flag=false;

    private Singleton() {
        if (flag){
            throw new RuntimeException("不可创建多对象");
        }
        flag=true;
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (Singleton.class) {
            if (instance != null) {
                return instance;
            }
            instance = new Singleton();
            return instance;
        }
    }
}
