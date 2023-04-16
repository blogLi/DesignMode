package com.design.mode.c_行为模式.i_访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构（Object Structure）角色：定义当中所提到的对象结构，对象结构是一个抽象表述，具体点可以理解为一个具有容器性质或者复合对象特性的类，
 *     它会含有一组元素（ Element ），并且可以迭代这些元素，供访问者访问。
 */
public class Home {

    private List<Animal> animalList=new ArrayList<>();

    public void add(Animal animal){
        animalList.add(animal);
    }
    public void action(Person person){
        for (Animal animal : animalList) {
            animal.accept(person);
        }
    }
}
