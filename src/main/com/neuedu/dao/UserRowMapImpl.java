package com.neuedu.dao;

import com.neuedu.myTools.util.RowMap;
import com.neuedu.pojo.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapImpl implements RowMap<User> {
    @Override
    public User RowMapping(ResultSet rs) {
        User user = new User();
        try {
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setTele(rs.getString("tele"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
