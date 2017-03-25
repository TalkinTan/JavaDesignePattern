package com.gmail.italkingtan.structure.facade;

/**
 * <pre>
 *     为子系统中的一组接口提供一个统一的入口。
 *     外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 *
 *     应用场景，读文件类，加密类，写文件类，三个类都放到一个统一的facade访问，facade层也可再抽象一层
 * </pre>
 * Created by tantan on 2017/1/23.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new EncryptFacade("src.txt","dest.txt");
        facade.method();
    }
}
