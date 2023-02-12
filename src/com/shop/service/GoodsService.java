package com.shop.service;

import com.shop.dao.GoodsDao;
import com.shop.pojo.Goods;

import java.sql.SQLException;
import java.util.List;

public class GoodsService {
    private GoodsDao dao = new GoodsDao();
    public List<Goods> getGoodsListByGoods_id(int goods_id) throws SQLException {
        return dao.getGoodsList(goods_id);
    }

    public Goods getGoodsById(String id) throws SQLException{
        return dao.getGoodsById(id);
    }
}
