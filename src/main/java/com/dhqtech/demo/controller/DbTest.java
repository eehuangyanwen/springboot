package com.dhqtech.demo.controller;

import com.dhqtech.demo.dao.UserDao;
import com.dhqtech.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author eehuangyanwen@163.com
 * @date 2019/5/9 19:19
 */
@RestController
@RequestMapping("/user")
public class DbTest {
    @Autowired
    private UserDao userDao =null;
    @RequestMapping("/getUser")
    public User getUser(Long id){
        return userDao.getUser(id);
    }
}
