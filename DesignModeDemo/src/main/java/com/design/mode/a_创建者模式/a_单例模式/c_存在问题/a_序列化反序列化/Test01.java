package com.design.mode.a_创建者模式.a_单例模式.c_存在问题.a_序列化反序列化;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test01 {

    public static void main(String[] args) throws Exception {
//        writeObject2File();
        Singleton singleton1 = readObjectFromFile();
        Singleton singleton2 = readObjectFromFile();
        System.out.println(singleton1==singleton2);
    }

    public static Singleton readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\MyFile\\StudyFile\\DesignModeDemo\\src\\main\\java\\com\\design\\mode\\other\\singleton\\1.txt"));
        return (Singleton) ois.readObject();
    }

    public static void writeObject2File() throws Exception {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\MyFile\\StudyFile\\DesignModeDemo\\src\\main\\java\\com\\design\\mode\\other\\singleton\\1.txt"));
        oos.writeObject(instance);
    }
}
