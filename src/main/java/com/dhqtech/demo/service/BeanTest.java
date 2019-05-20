package com.dhqtech.demo.service;

import com.dhqtech.demo.po.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author eehuangyanwen@163.com
 * @date 2019/5/20 16:15
 */
@Component
public class BeanTest {
    @Bean(name = "yanwen")
    public User GetUser(){
        User user= new User();
        user.setId(100L);
        user.setNote("helloworld");
        user.setUser_name("yanwen");
        return user;
    }
}
