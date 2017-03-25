package com.gmail.italkingtan.structure.combination;

/**
 * <pre>
 *     组合模式，例如：文件夹、文本类型、视频类型等，杀毒
 *     透明组合模式（基类拥有行为方法，便于变量声明，因为方法都是一样的）
 *     安全组合模式 (基类没有add，remove方法，申明时，需要显示声明，直接申明子类)
 * </pre>
 * Created by tantan on 2017/1/23.
 */
public class Client {
    public static void main(String[] args) {
        Component file = new Leaf("文件1");
        Component file1 = new Leaf("文件11");
        Component file2 = new Leaf("文件21");

        Component folder1 = new Composite("文件夹1");
        Component folder2 = new Composite("文件夹2");

        Component folder = new Composite("主文件夹");

        folder1.add(file1);
        folder2.add(file2);

        folder.add(file);
        folder.add(folder1);
        folder.add(folder2);

        folder.virus();
    }
}
