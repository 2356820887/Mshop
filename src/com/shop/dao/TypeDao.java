package com.shop.dao;

import com.shop.pojo.Type;
import com.shop.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeDao {
    public List<Type> getTypeAll() throws SQLException {
        List<Type> list = new ArrayList<>();
        String sql = "select * from type";
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Type type = new Type();
            type.setId(resultSet.getInt("id"));
            type.setName(resultSet.getString("name"));
            list.add(type);
        }
        return list;
    }
}
