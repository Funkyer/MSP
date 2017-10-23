package com.funkyer.kafka.common;

import com.funkyer.kafka.KeyMessage;
import com.funkyer.serializer.Serializer;
import kafka.serializer.Decoder;

/**
 * Created by liushi on 17/10/17.
 */
public class KafkaDecoder implements Decoder<KeyMessage>

{
    private com.funkyer.serializer.Serializer<KeyMessage> serializer;

    @Override
    public KeyMessage fromBytes(byte[] bytes)
    {
        return (KeyMessage) serializer.deserialize(bytes);
    }

    public void setSerializer(Serializer<KeyMessage> serializer) {
        this.serializer = serializer;
    }
}
