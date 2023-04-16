package com.design.mode.c_行为模式.i_访问者模式;

/**
 * 具体访问者（ConcreteVisitor）角色：给出对每一个元素类访问时所产生的具体行为。
 */
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫咪");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主任喂食狗狗");
    }
}
