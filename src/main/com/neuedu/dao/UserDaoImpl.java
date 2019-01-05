package com.neuedu.dao;

import com.neuedu.myTools.util.JdbcUtil;
import com.neuedu.myTools.util.RowMap;
import com.neuedu.pojo.User;

import java.sql.ResultSet;
import java.util.List;

public class UserDaoImpl implements IUserDao {
    @Override
    public List<User> getLists() {
        return JdbcUtil.executeQuery("select * from user", new UserRowMapImpl());
    }

    @Override
    public User getOne(Integer id) {
        return JdbcUtil.getOne("select * from user where id=?", new UserRowMapImpl(), id);
    }

    @Override
    public int insert(User user) {
        return JdbcUtil.executeUpdate("insert into user(username,password,tele) values(?,?,?)",user.getName(),user.getPassword(),user.getTele());
    }

    @Override
    public int delete(Integer id) {
        return JdbcUtil.executeUpdate("delete from user where id=?",id);
    }

    @Override
    public int delete(String name) {
        return JdbcUtil.executeUpdate("delete from user where username=?",name);
    }

    @Override
    public int update(User user) {
        return JdbcUtil.executeUpdate("update user set username=?,password=?,tele=? where id=?",user.getName(),user.getPassword(),user.getTele(),user.getId());
    }
}
