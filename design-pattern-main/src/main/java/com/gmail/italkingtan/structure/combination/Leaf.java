package com.gmail.italkingtan.structure.combination;

/**
 * Created by tantan on 2017/1/23.
 */
public class Leaf extends Component {

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void virus() {
        System.out.println("对文件:" + name + " 进行杀毒");
    }
}
