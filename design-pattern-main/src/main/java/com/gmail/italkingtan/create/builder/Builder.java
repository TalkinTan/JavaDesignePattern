package com.gmail.italkingtan.create.builder;

/**
 * Created by tantan on 2017/1/23.
 */
public abstract class Builder {
    public Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildName();

    public abstract void buildSex();

    public abstract void buildHairStyle();

    /**
     * 建造者直接返回对象，在内部组装，组装细节，交给具体的实现子类
     * @return
     */
    public Actor getResult() {
        this.buildType();
        this.buildName();
        this.buildSex();
        this.buildHairStyle();

        return actor;
    }

}
