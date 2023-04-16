package com.design.mode.c_行为模式.j_备忘录模式.白箱备忘录;

public class Client {
    public static void main(String[] args) {
        System.out.println("大战前");
        GameRole gameRole=new GameRole();
        gameRole.initState();
        gameRole.displayState();
        RoleStateCaretaker roleStateCaretaker=new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());
        System.out.println("大战后");
        gameRole.fight();
        gameRole.displayState();
        System.out.println("恢复之前状态");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.displayState();
    }
}
