package com.design.mode.a_创建者模式.a_单例模式.a_饿汉式.c_枚举;

public class Test {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1==instance2);
    }
}
