package com.funkyer.serializer;

/**
 * Created by liushi on 17/10/13.
 */
public interface Serializer<T>
{
    public byte[] serialize(T o);

    public T deserialize(byte[] bytes);
}
