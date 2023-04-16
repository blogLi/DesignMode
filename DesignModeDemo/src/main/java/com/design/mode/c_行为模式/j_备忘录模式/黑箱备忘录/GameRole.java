package com.design.mode.c_行为模式.j_备忘录模式.黑箱备忘录;

import lombok.Data;

/**
 * 游戏角色类
 * 发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 */
@Data
public class GameRole {

    //生命力
    private int vit;

    //攻击力
    private int atk;

    //防御力
    private int def;

    //初始化内部状态
    public void initState() {
        vit = 100;
        atk = 100;
        def = 100;
    }

    //战斗方法
    public void fight() {
        vit = 0;
        atk = 0;
        def = 0;
    }

    //保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    //恢复角色初始化状态
    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        vit = roleStateMemento.getVit();
        atk = roleStateMemento.getAtk();
        def = roleStateMemento.getDef();
    }

    //展示状态
    public void displayState() {
        System.out.println("生命力：" + vit);
        System.out.println("攻击力：" + atk);
        System.out.println("防御力：" + def);
    }

    @Data
    private class RoleStateMemento implements Memento {
        //生命力
        private int vit;

        //攻击力
        private int atk;

        //防御力
        private int def;

        public RoleStateMemento() {
        }

        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }
    }
}
