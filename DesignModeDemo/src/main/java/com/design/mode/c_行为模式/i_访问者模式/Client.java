package com.design.mode.c_行为模式.i_访问者模式;

public class Client {

    public static void main(String[] args) {

        Home home=new Home();
        Cat cat=new Cat();
        Dog dog=new Dog();
        home.add(cat);
        home.add(dog);
        Owner owner=new Owner();
        home.action(owner);
        Someone someone=new Someone();
        home.action(someone);
    }
}
