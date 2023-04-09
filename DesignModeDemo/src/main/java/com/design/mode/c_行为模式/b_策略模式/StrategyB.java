package com.design.mode.c_行为模式.b_策略模式;

/**
 *具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现或行为。
 */
public class StrategyB  implements Strategy{
    @Override
    public void show() {
        System.out.println("买200减50");
    }
}
