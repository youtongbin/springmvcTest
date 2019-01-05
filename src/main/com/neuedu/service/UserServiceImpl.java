package com.neuedu.service;

import com.neuedu.dao.IUserDao;
import com.neuedu.dao.UserDaoImpl;
import com.neuedu.pojo.User;

import java.util.List;

public class UserServiceImpl implements IUserService {
    IUserDao userDao = new UserDaoImpl();

    @Override
    public List<User> getLists() {
        return userDao.getLists();
    }

    @Override
    public User getOne(Integer id) {
        return userDao.getOne(id);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public int delete(String name) {
        return userDao.delete(name);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }
}
