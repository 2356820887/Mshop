package com.shop.service;

import com.shop.dao.TypeDao;
import com.shop.pojo.Type;

import java.sql.SQLException;
import java.util.List;

public class TypeService {
    private TypeDao dao = new TypeDao();

    public List<Type> getTypeAll() throws SQLException {
        return dao.getTypeAll();
    }
}
