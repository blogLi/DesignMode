package com.design.mode.a_创建者模式.c_原型模式.c_测试;

import com.design.mode.other.prototype.Citation;
import com.design.mode.other.prototype.Student;
import org.springframework.beans.BeanUtils;

public class Test03 {
    public static void main(String[] args) {
        Citation citation1=new Citation();
        citation1.setSchoolName("成都");
        Student student1=new Student();
        citation1.setStudent(student1);
        student1.setName("小明");
        citation1.show();
        Citation citation2=new Citation();
        BeanUtils.copyProperties(citation1,citation2);
        citation2.show();
        citation2.setSchoolName("自贡");
        citation2.getStudent().setName("小白");
        citation1.show();
        citation2.show();

    }
}
