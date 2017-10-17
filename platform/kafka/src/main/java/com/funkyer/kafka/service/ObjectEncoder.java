package com.funkyer.kafka.service;


import com.funkyer.serializer.Serializer;

/**
 * Created by liushi on 17/10/13.
 */

public class ObjectEncoder<T> implements kafka.serializer.Encoder<T>
{
    private Serializer serializer;

    @Override
    public byte[] toBytes(T t)
    {
        return serializer.serialize(t);
    }
}
