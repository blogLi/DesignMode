package com.design.mode.a_创建者模式.a_单例模式.c_存在问题.b_反射;

import java.lang.reflect.Constructor;

public class Test01 {

    public static void main(String[] args) throws Exception{
        //获取Singleton类的字节码对象
        Class clazz = Singleton.class;
        //获取Singleton类的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        Singleton singleton1 = (Singleton) constructor.newInstance();
        Singleton singleton2 = (Singleton) constructor.newInstance();
        System.out.println(singleton1==singleton2);
    }
}
