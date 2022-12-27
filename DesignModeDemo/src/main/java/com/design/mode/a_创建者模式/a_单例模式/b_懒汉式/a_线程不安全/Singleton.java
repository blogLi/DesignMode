package com.design.mode.a_创建者模式.a_单例模式.b_懒汉式.a_线程不安全;

public class Singleton {

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
