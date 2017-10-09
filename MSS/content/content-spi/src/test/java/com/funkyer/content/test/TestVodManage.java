package com.funkyer.content.test;

import com.funkyer.msm.api.VodManage;
import com.funkyer.msm.api.domain.Vod;
import org.omg.Messaging.SyncScopeHelper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by liushi on 17/10/9.
 */
public class TestVodManage
{
    private ClassPathXmlApplicationContext context = null;
    public void init(String path)
    {
        context = new ClassPathXmlApplicationContext(path);

    }
    public TestVodManage(String path) {

        init(path);
    }


    public void testVodManage()
    {
       VodManage vodManage = (VodManage) context.getBean("msm.VodManage");
        Vod vod = new Vod();
        vod.setId("1");
        System.out.println(vodManage.query(vod));

    }

    public static void main(String[] args) throws IOException {
         TestVodManage testVodManage = new TestVodManage("classpath:/META-INF/conf/test/vod.spring.xml");

        testVodManage.testVodManage();
    }
}
