package com.design.mode.c_行为模式.f_观察者模式;

/**
 *   Subject：抽象主题（抽象被观察者），抽象主题角色把所有观察者对象保存在一个集合里，每个主题都可以有任意数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象。
 */
public interface Subject {

    //添加订阅者（观察者对象）
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知观察者更新消息
    void  notify(String message);
}
