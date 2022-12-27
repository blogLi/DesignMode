package com.design.mode.other.prototype;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Cloneable {

    private String name;


    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
