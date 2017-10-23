package com.funkyer.serializer.impl;

import com.funkyer.serializer.Serializer;

/**
 * Created by liushi on 17/10/18.
 */
public class JdkSerializerSpi<T> implements Serializer<T> {
    @Override
    public byte[] serialize(T o) {
        return JdkSerialize.serialize(o);
    }

    @Override
    public T deserialize(byte[] bytes)
    {
        return (T)JdkSerialize.deserialize(bytes);
    }
}
