package com.dhqtech.demo.controller;

import com.dhqtech.demo.BeanFactory.GetBean;
import com.dhqtech.demo.dao.UserDao;
import com.dhqtech.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/**
 * @author eehuangyanwen@163.com
 * @date 2019/5/9 19:19
 */
@RestController
@RequestMapping("/user")
public class DbTest {
//    @Autowired
////    private UserDao userDao =null;
//    private User yanwen;
    private ApplicationContext applicationContext;
    @RequestMapping("/getUser")
    public Object getUser(){
//        return userDao.getUser(id);
          return GetBean.getBean("yanwen");
    }
}
