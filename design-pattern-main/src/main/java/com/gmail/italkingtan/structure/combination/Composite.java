package com.gmail.italkingtan.structure.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tantan on 2017/1/23.
 */
public class Composite extends Component {
    //组合模式，容器类必须有抽象构件类有聚合关系
    public List<Component> componentList = new ArrayList();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return componentList.get(i);
    }

    @Override
    public void virus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒

        for (Component c : componentList) {
            c.virus();
        }
    }
}
