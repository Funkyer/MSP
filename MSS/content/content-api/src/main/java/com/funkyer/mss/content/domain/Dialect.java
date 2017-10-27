package com.funkyer.mss.content.domain;

import java.io.Serializable;

/**
 * Created by dell on 17-4-4.
 */
public class Dialect implements Serializable
{
    private static final long serialVersionUID = 2571953551404438390L;
    private String key;

    private String name;

    private String introduce;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
