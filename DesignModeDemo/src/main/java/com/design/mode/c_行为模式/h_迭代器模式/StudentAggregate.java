package com.design.mode.c_行为模式.h_迭代器模式;

import java.util.List;

/**
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合元素以及创建迭代器对象的接口。
 */
public interface StudentAggregate {


    void add(Student student);

    void delete(Student student);

    //获取迭代器
    StudentIterator getStudentIterator();
}
