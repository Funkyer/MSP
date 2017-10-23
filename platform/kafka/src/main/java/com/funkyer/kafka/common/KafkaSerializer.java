package com.funkyer.kafka.common;

import com.funkyer.kafka.KeyMessage;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

/**
 * Created by liushi on 17/10/17.
 */
public class KafkaSerializer implements Serializer<KeyMessage>
{

    private com.funkyer.serializer.Serializer<KeyMessage> serializer;
    @Override
    public void configure(Map<String, ?> configs, boolean isKey)
    {

    }

    @Override
    public byte[] serialize(String topic, KeyMessage keyMessage)
    {
        return serializer.serialize(keyMessage);
    }

    @Override
    public void close() {

    }

    public void setSerializer(com.funkyer.serializer.Serializer<KeyMessage> serializer) {
        this.serializer = serializer;
    }
}
