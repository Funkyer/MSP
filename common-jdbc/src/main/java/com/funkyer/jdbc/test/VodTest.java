package com.funkyer.jdbc.test;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.funkyer.jdbc.VodSpi;
import com.funkyer.jdbc.domain.Vod;

/**
 * Created by dell on 17-4-5.
 */
public class VodTest {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/META-INF/conf/spring/*.spring.xml");
       
        
        VodSpi vodspi =  (VodSpi) context.getBean("jdbc.vodspi");
        
        Vod vod = new Vod();
        
        vod.setId(UUID.randomUUID().toString());
        vod.setName("ls");
        vod.setVodType(1);
        
        vodspi.addVod(vod);
	}
}
