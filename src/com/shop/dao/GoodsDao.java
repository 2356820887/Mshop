package com.shop.dao;

import com.shop.pojo.Goods;
import com.shop.pojo.Type;
import com.shop.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsDao {
    public List<Goods> getGoodsList(int type_id) throws SQLException {
        String sql = "SELECT g.goods_id,g.goods_name,g.type_id,t.`name`,g.unitPrice,g.stock,g.factory,g.photo,g.details,g.add_time,g.change_time,g.goods_state FROM goods g,type t WHERE g.type_id = ? AND g.type_id = t.id";
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = null;
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, type_id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Goods goods = null;
        List<Goods> list = new ArrayList<>();
        while (resultSet.next()) {
            goods = new Goods();
            goods.setGoods_id(resultSet.getString("goods_id"));
            goods.setGoods_name(resultSet.getString("goods_name"));
            goods.setType_id(resultSet.getInt("type_id"));
            goods.setUnitPrice(resultSet.getFloat("unitPrice"));
            goods.setStock(resultSet.getInt("stock"));
            goods.setFactory(resultSet.getString("factory"));
            goods.setPhoto(resultSet.getString("photo"));
            goods.setDetails(resultSet.getString("details"));
            goods.setAdd_time(resultSet.getInt("add_time"));
            goods.setChange_time(resultSet.getInt("change_time"));
            goods.setGoods_state(resultSet.getInt("goods_state"));
            Type type = new Type(resultSet.getString("name"));
            goods.setType(type);
            list.add(goods);
        }
        return list;
    }

    public Goods getGoodsById(String id) throws SQLException {
        String sql = "SELECT * FROM goods WHERE goods_id = ? ";
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = null;
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Goods goods = null;
        while (resultSet.next()) {
            goods = new Goods();
            goods.setGoods_id(resultSet.getString("goods_id"));
            goods.setGoods_name(resultSet.getString("goods_name"));
            goods.setType_id(resultSet.getInt("type_id"));
            goods.setUnitPrice(resultSet.getFloat("unitPrice"));
            goods.setStock(resultSet.getInt("stock"));
            goods.setFactory(resultSet.getString("factory"));
            goods.setPhoto(resultSet.getString("photo"));
            goods.setDetails(resultSet.getString("details"));
            goods.setAdd_time(resultSet.getInt("add_time"));
            goods.setChange_time(resultSet.getInt("change_time"));
            goods.setGoods_state(resultSet.getInt("goods_state"));
        }
        return goods;
    }
}
