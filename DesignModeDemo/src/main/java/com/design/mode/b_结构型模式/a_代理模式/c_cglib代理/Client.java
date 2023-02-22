package com.design.mode.b_结构型模式.a_代理模式.c_cglib代理;

public class Client {

    public static void main(String[] args) {
        ProxyFactory factory=new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
