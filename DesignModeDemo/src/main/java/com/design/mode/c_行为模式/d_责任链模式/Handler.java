package com.design.mode.c_行为模式.d_责任链模式;

import lombok.Data;

/**
 * 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 */
@Data
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;
    //该淋到请假区间
    private int numStart;
    private int numEnd;
    //声明后继者（上级领导）
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //各级领导处理请假条的方法
    protected abstract void handleLeave(LeaveRequest leaveRequest);

    //提交请假条
    public final void submit(LeaveRequest leaveRequest) {
        //领导审批是否通过
        this.handleLeave(leaveRequest);
        if (nextHandler != null && leaveRequest.getNumber() > numEnd) {
            nextHandler.submit(leaveRequest);
        }else {
            System.out.println("流程结束");
        }
    }
}
