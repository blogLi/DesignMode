package com.design.mode.c_行为模式.b_策略模式;

/**
 *具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现或行为。
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
