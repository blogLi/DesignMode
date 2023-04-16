package com.design.mode.c_行为模式.k_解释器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境（Context）角色：通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。
 */
public class Context {
    //定义一个map集合用来存储变量和对应的值
    private Map<Variable, Integer> map = new HashMap<>();

    //添加变量
    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    //根据变量获取对应的值
    public int getValue(Variable var) {
        return map.get(var);
    }
}
