package com.design.mode.a_创建者模式.b_工厂模式.e简单工厂_配置文件;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class CoffeeFactory {

    public static HashMap<String, Coffee> hashMap = new HashMap<String, Coffee>();

    static {
        Properties properties = new Properties();
        InputStream resourceAsStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(resourceAsStream);
            for(Object key:properties.keySet()){
                String className = properties.getProperty((String) key);
                Class aClass = Class.forName(className);
                Coffee coffee = (Coffee)aClass.newInstance();
                hashMap.put((String) key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) {
        return hashMap.get(name);
    }
}
