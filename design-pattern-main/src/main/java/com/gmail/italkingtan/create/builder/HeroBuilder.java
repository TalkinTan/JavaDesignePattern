package com.gmail.italkingtan.create.builder;

/**
 * Created by tantan on 2017/1/23.
 */
public class HeroBuilder extends Builder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildName() {
        actor.setName("张飞");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("平头");
    }
}
