package com.funkyer.redis;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

public class RedisClusterClient implements InitializingBean
{
	private String redisCluster;

	private JedisCluster jedisCluster;

	private Set<HostAndPort> clusterNode =  new HashSet<HostAndPort>(); ;
	private JedisPoolConfig config;

	public void afterPropertiesSet() throws Exception
	{
		if(StringUtils.isNotBlank(redisCluster))
		{
			String[] hostAndPorts = redisCluster.split(";");
			for(String hostAndPort : hostAndPorts)
			{
				String[] hp = hostAndPort.split(":");
				clusterNode.add(new HostAndPort(hp[0], Integer.parseInt(hp[1])));
			}
		}
		genJadisConfig();
		jedisCluster = new JedisCluster(clusterNode,5000,config);
	}
	private void genJadisConfig()
	{
		config = new JedisPoolConfig();
		config.setMaxTotal(1000);
		config.setMaxTotal(100);
		config.setTestOnBorrow(true);
	}

	public void setRedisCluster(String redisCluster) {
		this.redisCluster = redisCluster;
	}

	public JedisCluster getJedisCluster() {
		return jedisCluster;
	}

	public void setJedisCluster(JedisCluster jedisCluster) {
		this.jedisCluster = jedisCluster;
	}
}
