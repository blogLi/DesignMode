package com.design.mode.c_行为模式.d_责任链模式;

/**
 * 小组长
 * 具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNumber()+"天，"+leaveRequest.getContent());
        System.out.println("小组长审批同意");
    }
}
