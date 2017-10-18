package com.funkyer.kafka.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by liushi on 17/10/11.
 */
public class Test1
{
    public static void main(String[] args)
    {
        PropertyConfigurator.configure("/Users/liushi/WebstormProjects/MSP/platform/kafka/src/test/resources/log4j.properties");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:kafka.test.spring.xml","classpath:kafka.test.consumer.spring.xml"});
        KafkaProduecService service = (KafkaProduecService) context.getBean("producerTest");

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("输入 name 和 age");
            String name = scanner.next();
            int age = scanner.nextInt();
            String sex = scanner.next();

            service.sendUserInfo("test",new BMessage(name,age,sex));
        }

    }
}
