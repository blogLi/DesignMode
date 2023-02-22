package com.design.mode.b_结构型模式.a_代理模式.c_cglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private TrainStation station=new TrainStation();

    public TrainStation getProxyObject() {
        //创建Enhancer对象，类似于jdk代理中的Proxy对象
        Enhancer enhancer=new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation)enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("方法执行了");
        System.out.println("代售点收取一定的服务费用");
        Object obj = method.invoke(station, objects);
        return obj;
    }
}
