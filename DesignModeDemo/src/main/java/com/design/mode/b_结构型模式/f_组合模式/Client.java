package com.design.mode.b_结构型模式.f_组合模式;

public class Client {

    public static void main(String[] args) {

        //创建菜单树
        MenuComponent menu1=new Menu("菜单管理",2);
        menu1.add(new MenuItem("页面访问",3));
        menu1.add(new MenuItem("展开菜单",3));
        menu1.add(new MenuItem("编辑菜单",3));
        menu1.add(new MenuItem("删除菜单",3));
        menu1.add(new MenuItem("新增菜单",3));

        MenuComponent menu2=new Menu("权限管理",2);
        menu2.add(new MenuItem("页面访问",3));
        menu2.add(new MenuItem("提交保存",3));

        MenuComponent menu3=new Menu("角色管理",2);
        menu3.add(new MenuItem("页面访问",3));
        menu3.add(new MenuItem("新增角色",3));
        menu3.add(new MenuItem("删除角色",3));

        //创建一级菜单
        MenuComponent menu=new Menu("系统管理",1);
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);

        menu.print();

    }
}
