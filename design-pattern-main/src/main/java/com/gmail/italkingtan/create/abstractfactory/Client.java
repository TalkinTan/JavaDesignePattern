package com.gmail.italkingtan.create.abstractfactory;

import com.gmail.italkingtan.utils.XmlUtils;

/**
 * Created by tantan on 2017/1/22.
 */
public class Client {
    public static void main(String[] args) {

        SkinFactory skinFactory = (SkinFactory) XmlUtils.getBean("skinFactory");
        skinFactory.produceButton().display();
        skinFactory.produceCheckBox().display();
        skinFactory.productTextField().display();

    }
}
