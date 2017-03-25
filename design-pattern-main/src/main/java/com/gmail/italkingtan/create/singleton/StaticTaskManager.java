package com.gmail.italkingtan.create.singleton;

/**
 * 使用静态内部类，实现单例模式
 * Created by tantan on 2017/1/22.
 */
public class StaticTaskManager {
    //构造方法必须是私有的
    private StaticTaskManager() {

    }

    //返回单例
    public static StaticTaskManager getInstance() {
        return InnerManager.taskManager;
    }

    private static class InnerManager {
        private static StaticTaskManager taskManager = new StaticTaskManager();
    }

}
