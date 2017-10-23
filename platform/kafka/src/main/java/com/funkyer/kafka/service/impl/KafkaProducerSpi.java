package com.funkyer.kafka.service.impl;


import com.funkyer.kafka.service.KafkaProducer;
import com.funkyer.kafka.KeyMessage;
import org.springframework.integration.kafka.support.KafkaHeaders;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by liushi on 17/10/16.
 */
public class KafkaProducerSpi implements KafkaProducer
{

    MessageChannel channel;

    @Override
    public void sendMessage(String topic, KeyMessage message)
    {
        channel.send(MessageBuilder.withPayload(message)
                .setHeader(KafkaHeaders.TOPIC,topic)
                .build());
    }

    public void setChannel(MessageChannel channel) {
        this.channel = channel;
    }
}
