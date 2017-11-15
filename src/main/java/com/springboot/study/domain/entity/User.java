package com.springboot.study.domain.entity;

import java.io.Serializable;

public class User implements Serializable {


    private String username;
    private String desc;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
