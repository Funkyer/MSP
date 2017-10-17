package com.funkyer.kafka.test;

import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

/**
 * Created by liushi on 17/10/17.
 */
public class KafkaSerializer implements Serializer<KeyMessage>
{

    @Override
    public void configure(Map<String, ?> configs, boolean isKey)
    {

    }

    @Override
    public byte[] serialize(String topic, KeyMessage keyMessage)
    {
        return JdkSerialize.serialize(keyMessage);
    }

    @Override
    public void close() {

    }
}
