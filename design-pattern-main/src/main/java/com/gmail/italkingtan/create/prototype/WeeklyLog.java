package com.gmail.italkingtan.create.prototype;

import java.io.*;

/**
 * Created by tantan on 2017/1/23.
 */
public class WeeklyLog implements Cloneable, Serializable {
    private int id;

    private String name;

    private String content;

    //附件,主要用于测试【深拷贝】和【浅拷贝】
    private Attachment attachment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    protected WeeklyLog clone() {
        Object cloneObj = null;
        try {
            cloneObj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return (WeeklyLog) cloneObj;
    }

    //深度克隆，将对象序列化，放入对象流当中来处理
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        WeeklyLog deepCloneObj = null;

        //将当前对象，写入到对象流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //从对象流中读取，克隆出新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        deepCloneObj = (WeeklyLog) ois.readObject();

        return deepCloneObj;
    }
}
