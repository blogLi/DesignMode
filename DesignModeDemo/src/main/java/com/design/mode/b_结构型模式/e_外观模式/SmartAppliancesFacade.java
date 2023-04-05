package com.design.mode.b_结构型模式.e_外观模式;

import lombok.Data;
import lombok.val;

/**
 * 智能音箱
 * 外观（Facade）角色
 */
@Data
public class SmartAppliancesFacade {

    //聚合电灯、TV、空调
    private Light light=new Light();
    private Tv tv=new Tv();
    private AirCondition airCondition=new AirCondition();

    public void say(String msg){
        if (msg.contains("打开")){
          on();
        }else if(msg.contains("关闭")){
          off();
        }else {
            System.out.println("没听见");
        }
    }

    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off(){
        light.off();
        tv.off();
        airCondition.off();
    }
}
