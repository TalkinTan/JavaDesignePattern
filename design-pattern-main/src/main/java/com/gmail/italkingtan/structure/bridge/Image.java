package com.gmail.italkingtan.structure.bridge;

/**
 * Created by tantan on 2017/1/23.
 */
public abstract class Image {
    ImageImpl imageImpl;

    public void setImageImpl(ImageImpl imageImpl) {
        this.imageImpl = imageImpl;
    }

    //绘制图片
    public abstract void paintImage(String fileName);
}
