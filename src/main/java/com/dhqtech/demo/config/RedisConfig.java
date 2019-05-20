package com.dhqtech.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.jedis.JedisConnection;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import redis.clients.jedis.JedisPoolConfig;
//
///**
// * @author eehuangyanwen@163.com
// * @date 2019/5/13 20:05
// */
//@Configuration
//public class RedisConfig {
//    private RedisConnectionFactory connectionFactory = null;
//    @Bean(name = "RedisConnetcitonFactory")
//    public  RedisConnectionFactory initRedisConnectionFactory(){
//        if (this.connectionFactory != null){
//            return this.connectionFactory;
//        }
//        JedisPoolConfig poolConfig = new JedisPoolConfig();
////        最大空闲数
//        poolConfig.setMaxIdle(30);
////        最大连接数
//        poolConfig.setMaxTotal(50);
////        最大等待毫秒数
//        poolConfig.setMaxWaitMillis(2000);
////        创建Jedis连接工厂
//        JedisConnectionFactory connectionFactory =new JedisConnectionFactory(poolConfig);
//        Redis
//    }
//
//
//
//}
