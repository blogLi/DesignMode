package com.design.mode.a_创建者模式.b_工厂模式.e简单工厂_配置文件;

public enum CoffeeType {

    American("American"),English("American");

    private String name;
    private CoffeeType(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
