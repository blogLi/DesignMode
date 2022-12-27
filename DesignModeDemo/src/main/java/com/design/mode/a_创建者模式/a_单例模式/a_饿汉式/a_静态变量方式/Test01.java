package com.design.mode.a_创建者模式.a_单例模式.a_饿汉式.a_静态变量方式;

public class Test01 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}
