package com.funkyer.kafka.test;

import java.io.Serializable;

/**
 * Created by liushi on 17/10/13.
 */

/**
 * Kafka 消息基础接口
 */
public class KeyMessage implements Serializable
{
    public KeyMessage()
    {

    }
    public KeyMessage(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "KeyMessage{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
