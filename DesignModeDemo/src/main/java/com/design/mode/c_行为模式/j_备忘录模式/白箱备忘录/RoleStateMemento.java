package com.design.mode.c_行为模式.j_备忘录模式.白箱备忘录;

import lombok.Data;

/**
 * 备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 */
@Data
public class RoleStateMemento {

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
