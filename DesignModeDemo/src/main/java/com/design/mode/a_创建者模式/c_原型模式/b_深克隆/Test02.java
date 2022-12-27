package com.design.mode.a_创建者模式.c_原型模式.b_深克隆;

import com.design.mode.other.prototype.Citation;
import com.design.mode.other.prototype.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
public class Test02 {
    public static void main(String[] args) throws Exception{
        Citation citation1=new Citation();
        citation1.setSchoolName("成都");
        Student student1=new Student();
        citation1.setStudent(student1);
        student1.setName("小明");
        citation1.show();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\MyFile\\StudyFile\\test\\yuanxing\\1.txt"));
        oos.writeObject(citation1);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\MyFile\\StudyFile\\test\\yuanxing\\1.txt"));
        Citation citation2 = (Citation) ois.readObject();
        Student student2=new Student();
        student2.setName("小白");
        citation2.setStudent(student2);
        citation2.show();
        citation2.setSchoolName("自贡");
        citation2.show();
        citation1.show();
    }
}
