package com.design.mode.c_行为模式.e_状态模式.after;

import lombok.Data;

/**
 * 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 */
@Data
public abstract class LiftState {

    //声明环境角色类变量
    protected Context context;

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
