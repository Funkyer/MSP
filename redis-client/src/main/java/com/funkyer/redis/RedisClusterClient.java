package com.funkyer.redis;

import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

public class RedisClusterClient 
{
	private Set<HostAndPort> clusterNode ;
	private JedisPoolConfig config;
	
	private static final String host = "192.168.1.102";
	
	private void genClusterNode()
	{
		clusterNode = new HashSet<HostAndPort>();
		clusterNode.add(new HostAndPort(host, 8190));
		clusterNode.add(new HostAndPort(host, 8191));
		clusterNode.add(new HostAndPort(host, 8192));
		clusterNode.add(new HostAndPort(host, 8193));
		clusterNode.add(new HostAndPort(host, 8194));
		clusterNode.add(new HostAndPort(host, 8195));
	}
	
	private void genJadisConfig()
	{
		config = new JedisPoolConfig();
		config.setMaxTotal(1000);
		config.setMaxTotal(100);
		config.setTestOnBorrow(true);
	}
	public JedisCluster clusterInit()
	{
		genClusterNode();
		genJadisConfig();
		return new JedisCluster(clusterNode,5000,config);
	}

	public static void main(String[] args) {
		RedisClusterClient redisClusterClient = new RedisClusterClient();
		JedisCluster redis = redisClusterClient.clusterInit();
		redis.set("ls","liushi");
	}
}
