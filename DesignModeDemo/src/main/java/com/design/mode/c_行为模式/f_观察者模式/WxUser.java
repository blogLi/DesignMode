package com.design.mode.c_行为模式.f_观察者模式;


/**
 * ConcrereObserver：具体观察者，实现抽象观察者定义的更新接口，以便在得到主题更改通知时更新自身的状态。
 */
public class WxUser implements Observer{

    private String name;

    public WxUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name+"接收到了更新消息:"+msg);
    }
}
