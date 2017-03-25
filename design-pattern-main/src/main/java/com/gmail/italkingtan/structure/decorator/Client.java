package com.gmail.italkingtan.structure.decorator;

/**
 * <pre>
 *     动态地给一个对象增加一些额外的职责，就增加对象功能来说，
 *     装饰模式比生成子类实现更为灵活。装饰模式是一种对象结构型模式。
 * </pre>
 * Created by tantan on 2017/1/23.
 */
public class Client {
    public static void main(String[] args) {
        //有点类似IO流，也是使用了装饰模式
        //这种方式是【透明装饰模式】，可以装饰多次
        Component window = new Window();
        Decorator scollDecorator = new ScrollBarDecorator(window);
        Decorator blackDecorator = new BlackFrameDecorator(scollDecorator);
        blackDecorator.display();
    }
}
