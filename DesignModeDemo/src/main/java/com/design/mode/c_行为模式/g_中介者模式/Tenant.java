package com.design.mode.c_行为模式.g_中介者模式;

/**
 * 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 * 租房者
 */
public class Tenant extends Person{


    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    //和中介沟通
    public void constact(String message){
        mediator.constact(message,this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("租房者获取到的信息是："+message);
    }
}
