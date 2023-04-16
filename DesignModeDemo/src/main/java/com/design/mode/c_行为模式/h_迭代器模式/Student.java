package com.design.mode.c_行为模式.h_迭代器模式;

import lombok.Data;

/**
 * 学生类
 */
@Data
public class Student {

    private String name;

    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }
}
