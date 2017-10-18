package com.funkyer.kafka.test;

/**
 * Created by liushi on 17/10/18.
 */
public class Message extends KeyMessage
{
    private String sex;

    public Message(String name,int age,String sex)
    {
        super(name,age);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sex='" + sex + '\'' +
                '}' + super.toString();
    }
}
