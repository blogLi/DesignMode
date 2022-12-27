package com.design.mode.a_创建者模式.a_单例模式.a_饿汉式.a_静态变量方式;

//该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance。
//instance对象是随着类的加载而创建的。如果该对象足够大的话，而一直没有使用就会造成内存的浪费。
public class Singleton {

    private static Singleton instance=new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }


}
