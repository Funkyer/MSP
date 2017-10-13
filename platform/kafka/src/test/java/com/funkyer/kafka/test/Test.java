package com.funkyer.kafka.test;

/**
 * Created by liushi on 17/10/11.
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new KafkaConsumer("test2","1","1")).start();


    }
}
