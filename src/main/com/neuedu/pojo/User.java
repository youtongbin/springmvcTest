package com.neuedu.pojo;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private String tele;

    public User() {
    }

    public User(String name, String password, String tele) {
        this.name = name;
        this.password = password;
        this.tele = tele;
    }

    public User(Integer id, String name, String password, String tele) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.tele = tele;
    }
}
