package com.funkyer.kafka.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.kafka.support.KafkaHeaders;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by liushi on 17/10/16.
 */
public class KafkaProduecService
{
    @Autowired
    @Qualifier("kafkaTopicTest")
    MessageChannel channel;

    public void sendUserInfo(String topic, Object obj) {

        channel.send(MessageBuilder.withPayload(obj)
                .setHeader(KafkaHeaders.TOPIC,topic)
                .build());
    }

    public void setChannel(MessageChannel channel) {
        this.channel = channel;
    }
}
