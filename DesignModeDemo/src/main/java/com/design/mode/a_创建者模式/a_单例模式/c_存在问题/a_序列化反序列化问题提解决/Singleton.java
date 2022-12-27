package com.design.mode.a_创建者模式.a_单例模式.c_存在问题.a_序列化反序列化问题提解决;

import java.io.Serializable;

//在Singleton类中添加 readResolve() 方法，在反序列化时被反射调用，如果定义了这个方法，就返回这个方法的值，如果没有定义，则返回新new出来的对象
public class Singleton implements Serializable {

    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /*** 下面是为了解决序列化反序列化破解单例模式 */
    private Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
