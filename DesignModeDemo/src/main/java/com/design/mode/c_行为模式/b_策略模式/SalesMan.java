package com.design.mode.c_行为模式.b_策略模式;

/**
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 */
public class SalesMan {

    private Strategy strategy;

    public SalesMan(Strategy strategy){
        this.strategy=strategy;
    }

    public void salesManShow(){
        strategy.show();
    }
}
