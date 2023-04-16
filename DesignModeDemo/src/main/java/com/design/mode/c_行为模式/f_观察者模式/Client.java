package com.design.mode.c_行为模式.f_观察者模式;

public class Client {

    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subscriptionSubject=new SubscriptionSubject();
        //订阅公众号
        WxUser wxUser1=new WxUser("孙悟空");
        subscriptionSubject.attach(wxUser1);
        WxUser wxUser2=new WxUser("猪八戒");
        subscriptionSubject.attach(wxUser2);
        WxUser wxUser3=new WxUser("沙僧");
        subscriptionSubject.attach(wxUser3);
        //公众号更新，方法消息给观察者
        subscriptionSubject.notify("天降好消息");

    }
}
