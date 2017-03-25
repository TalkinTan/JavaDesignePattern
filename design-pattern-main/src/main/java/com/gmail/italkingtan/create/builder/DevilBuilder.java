package com.gmail.italkingtan.create.builder;

/**
 * Created by tantan on 2017/1/23.
 */
public class DevilBuilder extends Builder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildName() {
        actor.setName("撒旦");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("光头");
    }
}
