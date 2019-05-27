package com.dhqtech.demo.controller;

import com.dhqtech.demo.config.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eehuangyanwen@163.com
 * @date 2019/5/21 10:52
 */
@RestController
@RequestMapping("/redis")
public class RedisTest {
    //    @Autowired
////    private UserDao userDao =null;
//    private User yanwen;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisConfig redisConfig;
    @Autowired
    private ApplicationContext applicationContext;
    @RequestMapping("/setRedis")
    public Object setRedis(){
        redisConfig.initRedisConfig(redisTemplate);
        redisTemplate.opsForValue().set("test","yanwen");
        redisTemplate.opsForValue().set("huangyanwen","wodema");
        stringRedisTemplate.opsForValue().set("new","one");
        return redisTemplate.opsForValue().get("test");
    }
}
