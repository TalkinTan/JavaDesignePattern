package com.gmail.italkingtan.create.factory;

/**
 * Created by tantan on 2017/1/22.
 */
public class FileFactory extends Factory {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
