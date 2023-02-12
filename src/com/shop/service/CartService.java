package com.shop.service;

import com.shop.dao.CartDao;
import com.shop.pojo.Cart;
import com.shop.pojo.User;

import java.sql.SQLException;
import java.util.List;

public class CartService {
    private CartDao dao = new CartDao();
    public void addGoodsToCart(String id, User user) throws SQLException {
        dao.addGoodsToCart(id,user);
    }
    public List<Cart> getCartByUserId(String id) throws SQLException {
        return dao.getCartByUserId(id);
    }
    public void updateNum(int num,String id,User user) throws SQLException {
        dao.updateNum(num,id,user);
    }
}
