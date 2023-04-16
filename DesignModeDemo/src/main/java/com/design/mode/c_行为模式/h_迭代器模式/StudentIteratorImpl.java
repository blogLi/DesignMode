package com.design.mode.c_行为模式.h_迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 */
public class StudentIteratorImpl implements StudentIterator{

    List<Student> students;

    //用来记录遍历时的位子
    private int position;

    public StudentIteratorImpl(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return position<students.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置的对象
        Student currentStudent = students.get(position);
        position++;
        return currentStudent;
    }
}
