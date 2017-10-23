package com.funkyer.serializer.impl;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by liushi on 17/8/25.
 */
public class JdkSerialize
{
    /**
     * 先序列化再执行压缩，减少网络流量
     */
    public static byte[] serialize(Object obj)
    {
        try {
            ByteArrayOutputStream bis = new ByteArrayOutputStream();
            ObjectOutputStream stream = new ObjectOutputStream(bis);
            stream.writeObject(obj);
            stream.close();
            byte[] bytes = bis.toByteArray();
            //使用zip压缩，缩小网络包
            return bytes;
        } catch (Exception e) {

        }
        return null;
    }

    /**
     * 先解压缩，再反序列化
     */
    public static Object deserialize(byte[] bytes)
    {
        try
        {
            //使用zip解压缩
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ObjectInputStream stream = new ObjectInputStream(bis);
            return stream.readObject();
        }
        catch (Exception e)
        {
        }
        return null;
    }
}
