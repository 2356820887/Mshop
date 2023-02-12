package com.shop.service;

import com.shop.dao.UserDao;
import com.shop.pojo.User;

import java.sql.SQLException;

public class UserService {
    private final UserDao dao = new UserDao();

    public User Login(User user) throws SQLException {
        return dao.Login(user);
    }

    public int Register(User user) throws SQLException {
        return dao.Register(user);
    }
}
