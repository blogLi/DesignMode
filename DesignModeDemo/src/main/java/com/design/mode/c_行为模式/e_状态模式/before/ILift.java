package com.design.mode.c_行为模式.e_状态模式.before;

/**
 * 电梯
 */
public interface ILift {
    int OPENING_STATE=1;
    int CLOSING_STATE=2;
    int RUNNING_STATE=3;
    int STOPPING_STATE=4;

    void setState(int state);

    void open();

    void close();

    void run();

    void stop();
}
