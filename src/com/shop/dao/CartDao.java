package com.shop.dao;

import com.shop.pojo.Cart;
import com.shop.pojo.Goods;
import com.shop.pojo.User;
import com.shop.service.GoodsService;
import com.shop.service.UserService;
import com.shop.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDao {
    //添加商品
    public void addGoodsToCart(String id,User user) throws SQLException {
        String sql = "INSERT INTO shopping_cart(goods_id,goods_name,unitPrice,quantity,user_id)VALUES (?,?,?,?,?)";
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        GoodsService goodsService = new GoodsService();
        Goods goods=goodsService.getGoodsById(id);
        preparedStatement.setString(1, goods.getGoods_id());
        preparedStatement.setString(2, goods.getGoods_name());
        preparedStatement.setFloat(3, goods.getUnitPrice());
        preparedStatement.setInt(4,1);
        preparedStatement.setString(5,user.getUser_id());
        preparedStatement.execute();
    }
    public List<Cart> getCartByUserId(String id) throws SQLException {
        String sql = "SELECT s.goods_id,s.goods_name,g.photo,s.unitPrice,s.quantity,s.user_id FROM shopping_cart s,goods g WHERE s.goods_id=g.goods_id AND s.user_id = ? ";
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = preparedStatement = connection.prepareStatement(sql);;
        preparedStatement.setString(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Cart> list =new ArrayList<>();
        while (resultSet.next()){
            Cart cart=new Cart();
            cart.setGoods_id(resultSet.getString("goods_id"));
            cart.setGoods_name(resultSet.getString("goods_name"));
            cart.setPhoto(resultSet.getString("photo"));
            cart.setUnitPrice(resultSet.getFloat("unitPrice"));
            cart.setQuantity(resultSet.getInt("quantity"));
            cart.setUser_id(resultSet.getString("user_id"));
            list.add(cart);
        }
        return list;
    }
    public void updateNum(int num,String id,User user) throws SQLException {
        String sql = "UPDATE shopping_cart SET quantity=? WHERE goods_id=? AND user_id=?";
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,num);
        preparedStatement.setInt(2,num);
        preparedStatement.setString(3,user.getUser_id());
        preparedStatement.execute();
    }
}
