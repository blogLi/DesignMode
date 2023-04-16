package com.design.mode.c_行为模式.g_中介者模式;

import lombok.Data;

/**
 *具体中介者（ConcreteMediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 */
@Data
public class MediatorStructure extends Mediator{

    //聚合房主和租房者
    private HouseOwner houseOwner;

    private Tenant tenant;

    @Override
    public void constact(String message, Person person) {
        if (person ==houseOwner){
            tenant.getMessage(message);
        }else {
            houseOwner.getMessage(message);
        }
    }
}
