package com.gmail.italkingtan.create.prototype;

import java.io.IOException;

/**
 * Created by tantan on 2017/1/23.
 */
public class Client {
    public static void main(String[] args) {
        WeeklyLog weeklyLog_old = new WeeklyLog();
        weeklyLog_old.setName("周报");
        weeklyLog_old.setContent("每天任务");

        Attachment attachment = new Attachment();
        weeklyLog_old.setAttachment(attachment);

        WeeklyLog weeklyLog_new = weeklyLog_old.clone();

        System.out.println("=浅拷贝=");
        //比较是否同一个对象，内存地址比较
        System.out.println(weeklyLog_new == weeklyLog_old);
        //打印出true，可见引用类型的对象，没有深度拷贝，引用类型对象是同一个对象
        System.out.println(weeklyLog_new.getAttachment() == weeklyLog_old.getAttachment());
        System.out.println(weeklyLog_new.getName());
        System.out.println(weeklyLog_new.getContent());


        try {
            System.out.println("==深度拷贝==");
            WeeklyLog deepCopyWeeklyLog = weeklyLog_old.deepClone();

            //比较是否同一个对象，内存地址比较
            System.out.println(deepCopyWeeklyLog == weeklyLog_old);
            //打印出true，可见引用类型的对象，没有深度拷贝，引用类型对象是同一个对象
            System.out.println(deepCopyWeeklyLog.getAttachment() == weeklyLog_old.getAttachment());
            System.out.println(deepCopyWeeklyLog.getName());
            System.out.println(deepCopyWeeklyLog.getContent());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
