package com.design.mode.other.prototype;

import lombok.Data;

import java.io.Serializable;

//奖状
@Data
public class Citation implements Cloneable {

    private String schoolName;

    private Student student;

    private int year;

    @Override
    public Citation clone() throws CloneNotSupportedException {
        Citation clone = (Citation) super.clone();
//        clone.setStudent(clone.getStudent().clone());
        return clone;
    }

    public void show(){
        System.out.println(year+" "+schoolName+"学校,"+student.getName()+"同学");
    }



}
