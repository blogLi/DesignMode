package com.design.mode.a_创建者模式.a_单例模式.b_懒汉式.d_静态内部类方式;

//静态内部类单例模式中实例由内部类创建，由于 JVM 在加载外部类的过程中, 是不会加载静态内部类的,
// 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
// 静态属性由于被static 修饰，保证只被实例化一次，并且严格保证实例化顺序。
public class Singleton {

    private Singleton (){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
