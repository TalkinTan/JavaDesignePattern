package com.gmail.italkingtan.structure.bridge;

/**
 * Created by tantan on 2017/1/23.
 */
public class WindowsImageImpl implements ImageImpl {
    @Override
    public void paintImage(Matrix matrix) {
        System.out.println("Windows图像绘制");
    }
}
