package com.funkyer.kafka.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liushi on 17/10/11.
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new KafkaConsumer("test","10","1")).start();
    }
}
