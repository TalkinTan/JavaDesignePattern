package com.gmail.italkingtan.create.factory;

import com.gmail.italkingtan.utils.XmlUtils;

/**
 * 工厂方法
 * Created by tantan on 2017/1/22.
 */
public class Client {
    public static void main(String[] args) {
        //可通过xml配置factory
//        Factory factory = new DatabaseFactory();
        Factory factory = (Factory) XmlUtils.getBean("factoryBean");
        factory.writeLogger();
    }
}
