package com.design.mode.c_行为模式.e_状态模式.after;

import lombok.Data;

/**
 * 环境（Context）角色：也称为上下文，它定义了客户程序需要的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 */
@Data
public class Context {

    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StoppingState STOPPING_STATE = new StoppingState();

    //定义一个当前电梯状态变量
    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        liftState.open();
    }

    public void close(){
        liftState.close();
    }

    public void run(){
        liftState.run();
    }

    public void stop(){
        liftState.stop();
    }

}
