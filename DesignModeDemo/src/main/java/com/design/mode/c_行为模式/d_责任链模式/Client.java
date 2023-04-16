package com.design.mode.c_行为模式.d_责任链模式;

public class Client {

    public static void main(String[] args) {
        LeaveRequest leaveRequest=new LeaveRequest("张三",3,"生病");
        GroupLeader groupLeader=new GroupLeader();
        Manager manager=new Manager();
        GeneralManager generalManager=new GeneralManager();

        //设置处理链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequest);
    }
}
