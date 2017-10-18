package com.funkyer.kafka.test;

/**
 * Created by liushi on 17/10/18.
 */
public class BMessage extends KeyMessage
{
    private String sex;

    public BMessage(String name,int age,String sex)
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
        return "BMessage{" +
                "sex='" + sex + '\'' +
                '}' + super.toString();
    }
}
