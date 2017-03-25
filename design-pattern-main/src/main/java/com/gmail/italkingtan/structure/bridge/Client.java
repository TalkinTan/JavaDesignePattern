package com.gmail.italkingtan.structure.bridge;

import com.gmail.italkingtan.utils.XmlUtils;

/**
 * <pre>
 *     桥接模式，当一个类具有多维度时，使用桥接关联
 *     如：图片展示格式（JPG，PNG）和 对应的操作系统（Linux、Windows等）
 * </pre>
 * Created by tantan on 2017/1/23.
 */
public class Client {
    public static void main(String[] args) {
        Image image = XmlUtils.getBean("bridgeImage",Image.class);
        ImageImpl imageImpl = XmlUtils.getBean("brideImageImpl",ImageImpl.class);

        image.setImageImpl(imageImpl);
        image.paintImage("小龙女");
    }
}
