package com.design.mode.c_行为模式.c_命令模式;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单类
 */
@Data
public class Order {

    //餐桌号码
    private String diningTable;

    //所下餐品
    private Map<String,Integer> foodDir=new HashMap<String,Integer>();

    public void setFood(String name,Integer num){
        foodDir.put(name,num);
    }
}
