package com.gmail.italkingtan.structure.combination;

/**
 * Created by tantan on 2017/1/23.
 */
public abstract class Component {

    public String name;

    public void add(Component component) {
        System.out.println("不支持添加抽象构件");
    }

    public void remove(Component component) {
        System.out.println("不支持添加抽象构件");

    }

    public Component getChild(int i) {
        System.out.println("不支持添加抽象构件");
        return null;
    }

    //杀毒
    public abstract void virus();

}
