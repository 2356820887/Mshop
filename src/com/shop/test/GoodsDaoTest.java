package com.shop.test;

import com.shop.dao.GoodsDao;
import com.shop.pojo.Goods;
import com.shop.pojo.Type;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GoodsDaoTest {
    @Test
    void getGoodsById() throws SQLException {
        GoodsDao goodsDao = new GoodsDao();
        Goods goods = new Goods();
        goods = goodsDao.getGoodsById("101");
        System.out.println(goods);
    }

    @Test
    void getGoodsList() throws SQLException {
        GoodsDao dao = new GoodsDao();
        List<Goods> list;
        list = dao.getGoodsList(1);
        System.out.println(list);
    }
}