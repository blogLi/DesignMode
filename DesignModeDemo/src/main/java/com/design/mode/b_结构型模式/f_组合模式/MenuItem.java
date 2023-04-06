package com.design.mode.b_结构型模式.f_组合模式;

/**
 * 菜单项
 * 叶子节点（Leaf）
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name,int level) {
        this.name=name;
        this.level=level;
    }

    @Override
    public void print() {
        System.out.println("菜单项："+name);
    }
}
