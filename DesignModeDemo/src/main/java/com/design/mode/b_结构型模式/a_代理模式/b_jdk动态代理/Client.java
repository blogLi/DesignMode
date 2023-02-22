package com.design.mode.b_结构型模式.a_代理模式.b_jdk动态代理;

public class Client {
    public static void main(String[] args) {
        ProxyFactory factory=new ProxyFactory();
        SellTickets proxyObject = factory.getProxyObject();
        System.out.println("---------");
        proxyObject.sell();
    }
}
