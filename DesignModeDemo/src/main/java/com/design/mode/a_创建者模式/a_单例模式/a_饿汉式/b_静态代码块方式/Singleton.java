package com.design.mode.a_创建者模式.a_单例模式.a_饿汉式.b_静态代码块方式;

//该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着类的加载而创建。所以和饿汉式的静态变量方式基本上一样，当然该方式也存在内存浪费问题。
public class Singleton {

    private static Singleton instance;

    static {
        instance=new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}
