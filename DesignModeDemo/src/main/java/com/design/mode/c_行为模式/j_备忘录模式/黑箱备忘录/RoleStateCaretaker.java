package com.design.mode.c_行为模式.j_备忘录模式.黑箱备忘录;

import com.design.mode.c_行为模式.j_备忘录模式.白箱备忘录.RoleStateMemento;
import lombok.Data;

/**
 * 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 */
@Data
public class RoleStateCaretaker {

    private Memento memento;
}
