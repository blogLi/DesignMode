package com.design.mode.c_行为模式.e_状态模式.after;

public class Client {
    public static void main(String[] args) {
        Context context=new Context();
        context.setLiftState(new RunningState());
        context.close();
        context.run();
        context.stop();
    }
}
