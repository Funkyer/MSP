package com.funkyer.redis;

import org.apache.commons.lang.StringUtils;
import redis.clients.jedis.JedisCluster;
import redis.clients.util.SafeEncoder;

import java.util.Map;

/**
 * Created by dell on 2017/4/26.
 */
public class RedisClient
{
    private String prefix;
    private RedisClusterClient redisClusterClient;


    public void set(String key,Object object)
    {
        byte[] keys = getKeys(key);
        byte[] serializeObject = SerializeUtil.serialize(object);
        getJedisCluster().set(keys,serializeObject);
    }

    public Object get(String key)
    {
        byte[] keys = getKeys(key);
        return SerializeUtil.unserialize(getJedisCluster().get(keys));
    }

    public void hmset(String key,Map map)
    {
        byte[] keys = getKeys(key);
        getJedisCluster().hmset(keys,map);
    }

    public Map hmget(String key)
    {
        byte[] keys = getKeys(key);
        return getJedisCluster().hgetAll(keys);
    }

    public void expire(String key,int seconds)
    {
        byte[] keys = getKeys(key);
        getJedisCluster().expire(keys,seconds);
    }

    public long ttl(String key)
    {
        byte[] keys = getKeys(key);
        return getJedisCluster().ttl(keys);
    }


    private byte[] getKeys(String key)
    {
        if(StringUtils.isNotBlank(prefix))
        {
            return SafeEncoder.encode(prefix+":"+key);
        }else
        {
            return SafeEncoder.encode(key);
        }
    }



    private JedisCluster getJedisCluster()
    {
        return redisClusterClient.getJedisCluster();
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setRedisClusterClient(RedisClusterClient redisClusterClient) {
        this.redisClusterClient = redisClusterClient;
    }
}
