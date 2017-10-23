package com.funkyer.kafka.service;

/**
 * Created by liushi on 17/10/13.
 */

import com.funkyer.kafka.KeyMessage;

/**
 * 发送kafka消息
 */
public interface KafkaProducer
{

    public void sendMessage(String topic, KeyMessage message);

}
