package com.design.mode.a_创建者模式.a_单例模式.a_饿汉式.b_静态代码块方式;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance()==Singleton.getInstance());
    }
}
