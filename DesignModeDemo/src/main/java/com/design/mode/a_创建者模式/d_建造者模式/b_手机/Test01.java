package com.design.mode.a_创建者模式.d_建造者模式.b_手机;

public class Test01 {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder().cpu("intel").mainboard("华硕").memory("金士顿").screen("三星").build();
        System.out.println(phone);
    }
}
