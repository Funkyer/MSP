package com.funkyer.kafka.service;

/**
 * Created by liushi on 17/10/16.
 */
public interface SubscribeKafkaMessage
{
    /**
     * 订阅topic消息
     * @param topic
     */
    public void subscribe(String topic);

    public void consumeMessage(KeyMessage message);

}
