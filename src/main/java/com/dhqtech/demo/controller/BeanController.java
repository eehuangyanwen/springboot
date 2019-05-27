package com.dhqtech.demo.controller;

import com.dhqtech.demo.BeanFactory.GetBean;
import com.dhqtech.demo.BeanFactory.NoteBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eehuangyanwen@163.com
 * @date 2019/5/27 10:07
 */

@RestController
@RequestMapping("/user")
public class BeanController {
//    @Autowired
//    private ApplicationContext applicationContext;
    private ApplicationContext ctx = new AnnotationConfigApplicationContext(GetBean.class);
    @RequestMapping("/getBean")
    public Object getBean(){
        return ctx.getBean(NoteBean.class);
    }
}