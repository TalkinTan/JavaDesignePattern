package com.gmail.italkingtan.create.singleton;

/**
 * Created by tantan on 2017/1/22.
 */
public class Client {
    public static void main(String[] args) {
        StaticTaskManager manager1 = StaticTaskManager.getInstance();
        StaticTaskManager manager2 = StaticTaskManager.getInstance();

        System.out.println(manager1 == manager2);

    }
}
