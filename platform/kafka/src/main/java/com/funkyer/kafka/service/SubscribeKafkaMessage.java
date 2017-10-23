package com.funkyer.kafka.service;

import com.funkyer.kafka.KeyMessage;

import java.util.Collection;

/**
 * Created by liushi on 17/10/16.
 */
public interface SubscribeKafkaMessage
{
    /**
     * 订阅topic消息 返回订阅topic
     */
    public String subscribe();

    public void consumeMessage(Collection<KeyMessage>  messages);

}
