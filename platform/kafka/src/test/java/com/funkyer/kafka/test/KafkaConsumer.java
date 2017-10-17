package com.funkyer.kafka.test;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liushi on 17/10/11.
 */
public class KafkaConsumer implements Runnable
{
    private String topic;
    private String name;
    private String group;

    public KafkaConsumer(String topic,String name,String group)
    {
        this.topic = topic;
        this.name = name;
        this.group = group;
    }
    private ConsumerConnector createConsumer()
    {
        Properties properties = new Properties();
        properties.put("zookeeper.connect", "192.168.1.102:2181");//声明zk
        properties.put("zookeeper.session.timeout.ms", "10000");
        properties.put("metadata.broker.list", "192.168.1.102:9092,192.168.1.103:9092,192.168.1.103:9093");

        properties.put("group.id", group);// 必须要使用别的组名称， 如果生产者和消费者都在同一组，则不能访问同一组内的topic数据  同一组，则不能访问同一组内的topic数据

        properties.put("group.name",this.name);
        return Consumer.createJavaConsumerConnector(new ConsumerConfig(properties));
    }

    @Override
    public void run() {
        long id = Thread.currentThread().getId();
        ConsumerConnector consumer = createConsumer();
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(topic, 3); // 一次从主题中获取一个数据
        Map<String, List<KafkaStream<byte[], byte[]>>>  messageStreams = consumer.createMessageStreams(topicCountMap);
        List<KafkaStream<byte[], byte[]> >streams = messageStreams.get(topic);// 获取每次接收到的这个数据
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (final KafkaStream stream : streams) {
            executor.submit(new KafkaConsumerThread(stream));
        }
    }


}
