package com.funkyer.jdbc.domain;

/**
 * Created by dell on 2017/5/7.
 */

import java.io.Serializable;

/**
 *内容基类
 */
public class Content implements Serializable{

    private String  id;

    /**
     * 简介
     */
    private String introduce;
    /**
     * 名称
     */
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id='" + id + '\'' +
                ", introduce='" + introduce + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
