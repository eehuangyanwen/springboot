package com.dhqtech.demo.po;

import org.apache.ibatis.type.Alias;

/**
 * @author eehuangyanwen@163.com
 * @date 2019/5/9 19:54
 */

@Alias(value="user")
public class User {
    private Long id = null;
    private String user_name = null;
    private String note =null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
