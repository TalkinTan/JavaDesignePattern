package com.gmail.italkingtan.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * Bean的工具类
 * Created by tantan on 2017/1/22.
 */
public class XmlUtils {
    public static Object getBean(String beanName) {
        Object bean = null;

        try {
            SAXReader saxReader = new SAXReader();
            //从resources文件编译完成后，会生成在target根目录下，通过classpath来找到资源文件
            Document document = saxReader.read(XmlUtils.class.getResourceAsStream("/beans.xml"));

            Element rootElement = document.getRootElement();
            List<Element> elementList = rootElement.elements();
            for (Element element : elementList) {
                String id = element.attributeValue("id");
                if (beanName.equals(id)) {
                    String clazzName = element.attributeValue("class");
                    Class clazz = Class.forName(clazzName);
                    bean = clazz.newInstance();

                    break;
                }
            }


        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return bean;
    }

    public static <T> T getBean(String beanName, Class<T> clazz) {
        return (T) getBean(beanName);
    }
}
