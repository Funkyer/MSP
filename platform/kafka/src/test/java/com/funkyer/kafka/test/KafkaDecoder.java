package com.funkyer.kafka.test;

import kafka.serializer.Decoder;

/**
 * Created by liushi on 17/10/17.
 */
public class KafkaDecoder implements Decoder<KeyMessage>

{
    @Override
    public KeyMessage fromBytes(byte[] bytes)
    {
        return (KeyMessage) JdkSerialize.deserialize(bytes);
    }
}
