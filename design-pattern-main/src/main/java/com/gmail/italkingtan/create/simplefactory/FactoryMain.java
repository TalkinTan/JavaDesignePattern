package com.gmail.italkingtan.create.simplefactory;

/**
 * 简单工厂
 * Created by tantan on 2017/1/17.
 */
public class FactoryMain {
    public static void main(String[] args) {
        Sender sender = SenderFactory.mailSender();
        sender.send();
    }
}
