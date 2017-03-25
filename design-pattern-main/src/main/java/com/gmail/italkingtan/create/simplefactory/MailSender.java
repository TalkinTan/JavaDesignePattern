package com.gmail.italkingtan.create.simplefactory;

/**
 * Created by tantan on 2017/1/17.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Mail Sender");
    }
}
