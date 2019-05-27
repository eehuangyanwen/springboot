package com.dhqtech.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * @author eehuangyanwen@163.com
 * @date 2019/5/21 13:54
 */
@Configuration
public class RedisConfig {
    @Autowired
    private RedisTemplate redisTemplate;
    public void initRedisConfig(RedisTemplate redisTemplate){
        RedisSerializer stringRedisSerializer = redisTemplate.getStringSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        this.redisTemplate = redisTemplate;
    }
}
