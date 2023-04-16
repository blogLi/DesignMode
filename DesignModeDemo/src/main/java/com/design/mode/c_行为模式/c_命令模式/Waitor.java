package com.design.mode.c_行为模式.c_命令模式;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类
 * 调用者/请求者（Invoker）角色： 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
 */
@Data
public class Waitor {

    private List<Command> commands=new ArrayList<>();

    public void setCommand(Command command){
        //将cmd对象存储到list中
        commands.add(command);
    }

    public void orderUp(){
        System.out.println("新订单来了");
        for (Command command:commands){
            if (command!=null) {
                command.execute();
            }
        }
    }

}
