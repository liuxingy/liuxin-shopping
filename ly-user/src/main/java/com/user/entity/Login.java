package com.user.entity;

import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author liuxy
 * @version 1.0
 * @description:
 * @date 2020/3/1 9:56
 */
@Table(name = "login")
public class Login {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
