package com.design.mode.c_行为模式.b_策略模式;

public class Client {

    public static void main(String[] args) {
        SalesMan salesMan=new SalesMan(new StrategyA());
        salesMan.salesManShow();
        salesMan=new SalesMan(new StrategyB());
        salesMan.salesManShow();
    }
}
