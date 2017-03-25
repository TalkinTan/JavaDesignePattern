package com.gmail.italkingtan.create.factory;

/**
 * Created by tantan on 2017/1/22.
 */
public abstract class Factory {
    public abstract Logger createLogger();

    public void writeLogger() {
        createLogger().writeLogger();
    }
}
