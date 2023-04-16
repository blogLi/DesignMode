package com.design.mode.c_行为模式.d_责任链模式;

/**
 * 总经理
 * 具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(2,Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNumber()+"天，"+leaveRequest.getContent());
        System.out.println("总经理审批同意");
    }
}
