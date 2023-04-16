package com.design.mode.c_行为模式.h_迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 */
public class StudentAggregateImpl implements StudentAggregate{

    List<Student> students=new ArrayList<>();
    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(students);
    }
}
