package com.shop.test;

import com.shop.dao.CartDao;
import com.shop.dao.GoodsDao;
import com.shop.dao.UserDao;
import com.shop.pojo.Cart;
import com.shop.pojo.Goods;
import com.shop.pojo.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartDaoTest {
    @Test
    void addGoodsToCart() throws SQLException {
        User user=new User();
        UserDao userDao=new UserDao();
        user=userDao.getUserById("230925");
        CartDao cartDao=new CartDao();
        cartDao.addGoodsToCart("102",user);
    }
    @Test
    void getCartList() throws SQLException{
        CartDao dao=new CartDao();
        List<Cart> list;
        list=dao.getCartByUserId("230925");
        System.out.println(list);
    }
    @Test
    void updateNum() throws SQLException{
        CartDao dao=new CartDao();
        User user=new User();
        UserDao userDao=new UserDao();
        String id = "102";
        user=userDao.getUserById("230925");
        List<Cart> list=dao.getCartByUserId(user.getUser_id());
        for (Cart cart : list){
            if (cart.getGoods_id().equals(id)){
                int num = cart.getQuantity();
                dao.updateNum(num+1,id,user);
            }
            if (!cart.getGoods_id().equals(id)){
                dao.addGoodsToCart(id,user);
                System.out.println("bbbb");
            }
        }
    }
}