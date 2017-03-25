package com.gmail.italkingtan.structure.decorator;

/**
 * Created by tantan on 2017/1/23.
 */
public class BlackFrameDecorator extends Decorator {

    public BlackFrameDecorator(Component component) {
        super(component);
    }

    @Override
    void display() {
        this.blackFrame();
        super.display();
    }

    public void blackFrame() {
        System.out.println("加上黑色边框");
    }
}
