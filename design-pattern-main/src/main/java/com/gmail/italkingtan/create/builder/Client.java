package com.gmail.italkingtan.create.builder;

import com.gmail.italkingtan.utils.XmlUtils;

/**
 * Created by tantan on 2017/1/23.
 */
public class Client {
    public static void main(String[] args) {

        Builder builder = XmlUtils.getBean("builder",Builder.class);
        Actor actor = builder.getResult();

        System.out.println("==角色创建完成==");
        System.out.println(actor.getType());
        System.out.println(actor.getSex());
        System.out.println(actor.getName());
        System.out.println(actor.getHairStyle());
    }

}
