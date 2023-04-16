package com.design.mode.c_行为模式.h_迭代器模式;

public class Client {

    public static void main(String[] args) {
        StudentAggregateImpl aggregate=new StudentAggregateImpl();
        aggregate.add(new Student("小明","1"));
        aggregate.add(new Student("小白","2"));
        aggregate.add(new Student("小红","3"));
        aggregate.add(new Student("小绿","4"));
        StudentIterator studentIterator = aggregate.getStudentIterator();
        while (studentIterator.hasNext()){
            Student next = studentIterator.next();
            System.out.println(next);
        }
    }
}
