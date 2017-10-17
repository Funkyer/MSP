package com.funkyer.kafka.test;

/**
 * Created by liushi on 17/10/16.
 */
public class UserDto
{
    private String name;
    private int age;

    public UserDto()
    {

    }
    public UserDto(String name,int age)
    {
        this.age = age;
        this.name = name;
    }
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
}
