package com.design.mode.b_结构型模式.g_享元模式;

import java.util.HashMap;

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
