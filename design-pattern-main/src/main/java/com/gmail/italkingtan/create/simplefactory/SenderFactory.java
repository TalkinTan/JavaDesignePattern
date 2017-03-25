package com.gmail.italkingtan.create.simplefactory;

/**
 * Created by tantan on 2017/1/17.
 */
public class SenderFactory {
    public static Sender smsSender() {
        return new SmsSender();
    }

    public static Sender mailSender() {
        return new MailSender();
    }
}
