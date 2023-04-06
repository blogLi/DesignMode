package com.design.mode.b_结构型模式.f_组合模式;

/**
 * 菜单组件
 * 抽象根节点（Component）
 */
public abstract class MenuComponent {

    protected String name;
    protected int level;
    //添加菜单
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    //移除菜单
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    //获取指定的子菜单
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    //获取菜单名称
    public String getName(){
        return name;
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}
