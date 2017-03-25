package com.gmail.italkingtan.structure.decorator;

/**
 * Created by tantan on 2017/1/23.
 */
public class ScrollBarDecorator extends Decorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    void display() {
        this.scrollBar();
        super.display();
    }

    public void scrollBar() {
        System.out.println("加上滚动条");
    }
}
