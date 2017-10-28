package com.funkyer.mss.content.test;

import com.funkyer.msm.content.api.VodManage;
import com.funkyer.msm.content.api.domain.Vod;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Date;

/**
 * Created by liushi on 17/10/9.
 */
public class TestVodManage extends BaseTest
{
    static TestVodManage testVodManage = new TestVodManage("classpath:/META-INF/conf/test/vod.spring.xml");
    private ClassPathXmlApplicationContext context = null;

    public TestVodManage(String path) {
        super(path);
        init();
    }


    public void testVodManage()
    {
       VodManage vodManage = (VodManage) getContext().getBean("msm.VodManage");
        Vod vod = new Vod();
        vod.setId("1");
        System.out.println(vodManage.query(vod));

    }

    public static void main(String[] args) throws IOException {

//        String host = null;
//            try {
//                long s1 = new Date().getTime();
//                 host = InetAddress.getLocalHost().getHostName();
//                long s2 = new Date().getTime();
//                System.out.println(host + " 耗时=" + (s2 - s1) + "毫秒");
//            } catch (UnknownHostException var28) {
//            }
//        System.out.println(host);
        long s1 = new Date().getTime();
        testVodManage.testVodManage();
                        long s2 = new Date().getTime();

        System.out.println( " 耗时=" + (s2 - s1) + "毫秒");

    }
}
