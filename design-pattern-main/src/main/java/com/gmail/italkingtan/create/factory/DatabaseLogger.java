package com.gmail.italkingtan.create.factory;

/**
 * Created by tantan on 2017/1/22.
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLogger() {
        System.out.println("Database Logger");
    }
}
