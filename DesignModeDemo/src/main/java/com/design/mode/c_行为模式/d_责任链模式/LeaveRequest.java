package com.design.mode.c_行为模式.d_责任链模式;

import lombok.Data;

/**
 * 请假条
 */
@Data
public class LeaveRequest {

    //姓名
    private String name;
    //天数
    private int number;
    //请假内容
    private String content;

    public LeaveRequest(String name, int number, String content) {
        this.name = name;
        this.number = number;
        this.content = content;
    }
}
