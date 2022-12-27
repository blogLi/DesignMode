package com.design.mode.a_创建者模式.c_原型模式.a_浅克隆;

import com.design.mode.other.prototype.Citation;
import com.design.mode.other.prototype.Student;

//浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
//String类型有点特殊，它本身没有实现Cloneable接口，故根本无法克隆，只能传递引用。在clone()后，指向的值为常量。克隆出来的对象改变他的值，
// 实际上是改变了克隆出来对象String类型成员的指向，不会影响被克隆对象的值及其指向。这样String在拷贝的时候就表现出了“深拷贝”的特点；
// 实际上String作为不可更改的类（immutable class），在new赋值的时候，就已经创建了一个新的对象；

public class Test01 {
    public static void main(String[] args) throws Exception{
        Citation citation1=new Citation();
        citation1.setSchoolName("成都");
        citation1.setYear(2021);
        Student student1=new Student();
        citation1.setStudent(student1);
        student1.setName("小明");
        citation1.show();
        Citation citation2 = citation1.clone();
        System.out.println(citation1.getStudent()==citation2.getStudent());
        citation2.show();
        citation2.setYear(2022);
        citation2.getStudent().setName("小红");
        citation2.setSchoolName("自贡");
        citation1.show();
        citation2.show();

    }
}
