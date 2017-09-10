package com.funkyer.redis;

import org.apache.commons.lang.ArrayUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * Created by dell on 2017/5/7.
 */
public class SerializeUtil {

    public static byte[] serialize(Object object) {

        if(null == object)
        {
            return null;
        }
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        try {
//序列化
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            byte[] bytes = baos.toByteArray();
            return bytes;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static Object unserialize(byte[] bytes) {
        if(ArrayUtils.isEmpty(bytes))
        {
            return null;
        }
        ByteArrayInputStream bais = null;
        try {
//反序列化
            bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
