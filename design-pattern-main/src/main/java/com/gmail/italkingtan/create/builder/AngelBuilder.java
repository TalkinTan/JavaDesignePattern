package com.gmail.italkingtan.create.builder;

/**
 * Created by tantan on 2017/1/23.
 */
public class AngelBuilder extends Builder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildName() {
        actor.setName("安吉拉");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("飘逸");
    }
}
