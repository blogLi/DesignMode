package com.design.mode.a_创建者模式.a_单例模式.c_存在问题.b_反射;

public class Singleton {

    private Singleton() {
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
