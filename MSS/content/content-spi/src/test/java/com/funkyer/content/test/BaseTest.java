package com.funkyer.content.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liushi on 17/10/9.
 */
public class BaseTest
{
    private ClassPathXmlApplicationContext context = null;

    private String path;
    public BaseTest(String path)
    {
        this.path = path;
    }

    public void init()
    {
        context = new ClassPathXmlApplicationContext(this.path);

    }

    public ClassPathXmlApplicationContext getContext() {
        return context;
    }

    public void setContext(ClassPathXmlApplicationContext context) {
        this.context = context;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
