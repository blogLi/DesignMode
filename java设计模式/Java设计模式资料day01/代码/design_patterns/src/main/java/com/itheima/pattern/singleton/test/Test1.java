package com.itheima.pattern.singleton.test;

public class Test1 {
    private static ClassTest classTest=new ClassTest();

    public static ClassTest getClassTest() {
        return classTest;
    }

}
