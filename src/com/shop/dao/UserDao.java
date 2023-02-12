package com.shop.dao;

import com.shop.pojo.User;
import com.shop.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserDao {
    public User Login(User user) throws SQLException {
        String sql = "SELECT * FROM `user`WHERE user_id = ? and `password` = ?";
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getUser_id());
        preparedStatement.setString(2, user.getPassword());
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            user = new User();
            user.setUser_id(resultSet.getString("user_id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setBirth(resultSet.getDate("birth"));
            user.setAddress(resultSet.getString("address"));
            user.setPhone(resultSet.getString("phone"));
            user.setEmail(resultSet.getString("email"));
            user.setCreationTime(resultSet.getDate("creationTime"));
            user.setPower(resultSet.getInt("power"));
        }
        return user;
    }

    public int Register(User user) throws SQLException {
        String sql = "INSERT INTO `user` ( user_id, username, `password`, birth, address, phone, email, creationTime, power ) VALUES (?,?,?,?,?,?,?,?,?)";
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        String number = RandomNumber.randomNumber();
        user.setUser_id(number);
        preparedStatement.setString(1, number);
        preparedStatement.setString(2, user.getUsername());
        preparedStatement.setString(3, user.getPassword());
        preparedStatement.setDate(4, new java.sql.Date(user.getBirth().getTime()));
        preparedStatement.setString(5, user.getAddress());
        preparedStatement.setString(6, user.getPhone());
        preparedStatement.setString(7, user.getEmail());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        String format = simpleDateFormat.format(date);
        preparedStatement.setString(8, format);
        preparedStatement.setInt(9, 0);

        return preparedStatement.executeUpdate();
    }

    public List<User> getAllId() throws SQLException {
        List<User> list = new ArrayList<>();
        String sql = "SELECT user_id FROM `user`";
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            User user = new User();
            user.setUser_id(resultSet.getString("user_id"));
            list.add(user);
        }
        return list;
    }

    public User getUserById(String id) throws SQLException {
        String sql = "SELECT * from `user` WHERE user_id = "+id;
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        User user=new User();
        while (resultSet.next()){
            user.setUser_id(resultSet.getString("user_id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setBirth(resultSet.getDate("birth"));
            user.setAddress(resultSet.getString("address"));
            user.setPhone(resultSet.getString("phone"));
            user.setEmail(resultSet.getString("email"));
            user.setCreationTime(resultSet.getDate("creationTime"));
            user.setPower(resultSet.getInt("power"));
        }
        return user;
    }
}
