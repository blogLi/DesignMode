package com.design.mode.c_行为模式.f_观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject：具体主题（具体被观察者），该角色将有关状态存入具体观察者对象，在具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
 */
public class SubscriptionSubject implements Subject{

    private List<Observer> wxUserList=new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        wxUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        wxUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : wxUserList) {
            observer.update(message);
        }
    }
}
