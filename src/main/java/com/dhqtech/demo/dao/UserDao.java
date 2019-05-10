package com.dhqtech.demo.dao;
import com.dhqtech.demo.po.*;
import org.springframework.stereotype.Repository;

/**
 * @author eehuangyanwen@163.com
 * @date 2019/5/9 20:03
 */
@Repository
public interface UserDao {
    public User getUser(Long id);
}
