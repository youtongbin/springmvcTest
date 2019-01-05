package com.neuedu.dao;

import com.neuedu.pojo.User;

import java.util.List;

public interface IUserDao {
    List<User> getLists();
    User getOne(Integer id);
    int insert(User user);
    int delete(Integer id);
    int delete(String name);
    int update(User user);
}
