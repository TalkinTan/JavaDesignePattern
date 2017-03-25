package com.gmail.italkingtan.structure.bridge;

/**
 * Created by tantan on 2017/1/23.
 */
public class JPGImage extends Image {
    @Override
    public void paintImage(String fileName) {
        Matrix m = new Matrix();
        imageImpl.paintImage(m);
        System.out.println("JPG图像 ：" + fileName);
    }

}
