package com.design.mode.c_行为模式.a_模板方法模式;

/**
 * 炒菜心
 * 具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的组成步骤。
 */
public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("倒入菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("放盐");
    }
}
