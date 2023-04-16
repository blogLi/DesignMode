package com.design.mode.c_行为模式.g_中介者模式;

/**
 * 抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 */
public abstract class Mediator {

    public abstract void constact(String message,Person person);
}
