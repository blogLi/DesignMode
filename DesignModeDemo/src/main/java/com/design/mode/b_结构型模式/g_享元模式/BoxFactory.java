package com.design.mode.b_结构型模式.g_享元模式;

import java.util.HashMap;

/**
 *  具体享元（Concrete Flyweight）角色 ：它实现了抽象享元类，称为享元对象；
 *  在具体享元类中为内部状态提供了存储空间。通常我们可以结合单例模式来设计具体享元类，为每一个具体享元类提供唯一的享元对象。
 */
public class BoxFactory {

    private static HashMap<String,AbstractBox> map;

    public BoxFactory(){
        map=new HashMap<>();
        AbstractBox iBox=new IBox();
        AbstractBox lBox=new LBox();
        AbstractBox oBox=new OBox();
        map.put("I",iBox);
        map.put("L",lBox);
        map.put("O",oBox);
    }

    public static final BoxFactory getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static class SingletonHolder{
        private static final BoxFactory INSTANCE=new BoxFactory();
    }

    public AbstractBox getBox(String key){
        return map.get(key);
    }
}
