package com.gmail.italkingtan.create.prototype;

import java.io.Serializable;

/**
 * Created by tantan on 2017/1/23.
 */
public class Attachment implements Serializable{
    private int id;

    private String name;

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
}
