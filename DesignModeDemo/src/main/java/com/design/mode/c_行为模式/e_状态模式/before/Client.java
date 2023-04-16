package com.design.mode.c_行为模式.e_状态模式.before;

public class Client {

    public static void main(String[] args) {
        Lift left=new Lift();
        left.setState(ILift.OPENING_STATE);
        left.open();
        left.close();
        left.run();
        left.stop();
    }
}
