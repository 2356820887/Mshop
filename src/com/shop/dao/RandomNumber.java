package com.shop.dao;

import com.shop.pojo.User;
import java.sql.SQLException;
import java.util.Random;

public class RandomNumber {
    public static String randomNumber() throws SQLException {
        Random random = new Random();
        UserDao userDao = new UserDao();
        String number;
        number = String.valueOf(random.nextInt(1000000));
        for (User user : userDao.getAllId()) {
            while (number.equals(user.getUser_id())){
                number = String.valueOf(random.nextInt(1000000));
            }
        }
        return number;
    }
}
