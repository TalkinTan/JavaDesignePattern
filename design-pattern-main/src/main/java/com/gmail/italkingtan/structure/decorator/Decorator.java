package com.gmail.italkingtan.structure.decorator;

/**
 *
 * 装饰模式，实现【被装饰者】，另外关联【被装饰者】
 * Created by tantan on 2017/1/23.
 */
public class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    void display() {
        component.display();
    }
}
