package com.design.mode.c_行为模式.i_访问者模式;

/**
 * 抽象元素（Element）角色：定义了一个接受访问者的方法（ accept ），其意义是指，每一个元素都要可以被访问者访问。
 */
public interface Animal {

    void accept(Person person);
}
