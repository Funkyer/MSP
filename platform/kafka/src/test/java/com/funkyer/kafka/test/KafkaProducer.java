package com.funkyer.kafka.test;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import kafka.serializer.StringEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by liushi on 17/10/11.
 */
public class KafkaProducer extends Thread
{
    private String topic;

    public KafkaProducer(String topic)
    {
        this.topic = topic;
    }

    public Producer createProducer()
    {
        Properties properties = new Properties();
        properties.put("zookeeper.connect", "192.168.1.102:2181");//声明zk
        properties.put("serializer.class", StringEncoder.class.getName());
        properties.put("metadata.broker.list", "localhost:9092,192.168.1.103:9092");// 声明kafka broker
//        properties.put("partitioner.class","com.funkyer.kafka.test.CidPartitioner");
        properties.put("producer.type", "sync");
        return new Producer<Integer, String>(new ProducerConfig(properties));

    }

    @Override
    public void run() {
        Producer producer = createProducer();
        int i=0;
        while(true) {
            for (int z = 0; z < 2; z++) {


            List<KeyedMessage<String, String>> messageList = new ArrayList<KeyedMessage<String, String>>();

                messageList.add(new KeyedMessage<String, String>(topic,String.valueOf(z), "message: " + i++));
            producer.send(messageList);
        }
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new KafkaProducer("test2").start();
    }
}
