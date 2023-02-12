package com.shop.test;

import com.shop.dao.UserDao;
import com.shop.pojo.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    UserDao dao = new UserDao();
    User user = new User();

    @Test
    void login() throws SQLException {
        user.setUser_id("230925");
        user.setPassword("123456");
        User Login = dao.Login(user);
        System.out.println(Login);
    }

    @Test
    void register() throws ParseException, SQLException {
        Date date = new Date();
        String d = "2002-12-21";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        date = sdf.parse(d);
        user.setUsername("wangwu");
        user.setPassword("123456");
        user.setBirth(date);
        user.setAddress("ncvt");
        user.setPhone("15555555555");
        user.setEmail("q1q1@mail.com");
        int Register = dao.Register(user);
        System.out.println(user);
    }

    @Test
    void getAllId() throws SQLException {
        String s = "14875";
        for (User u : dao.getAllId()) {
            System.out.println(u.getUser_id());
            if (s.equals(u.getUser_id())){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}