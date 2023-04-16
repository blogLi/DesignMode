package com.design.mode.c_行为模式.c_命令模式;

/**
 * 厨师类
 * 实现者/接收者（Receiver）角色： 接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
 */
public class SeniorChef {

    public void  makeFood(String name,Integer num){
        System.out.println(num+"份"+name);
    }
}
