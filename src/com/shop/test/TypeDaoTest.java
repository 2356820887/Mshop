package com.shop.test;

import com.shop.dao.TypeDao;
import com.shop.pojo.Type;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class TypeDaoTest {

    @Test
    void getTypeAll() throws SQLException {
        TypeDao dao = new TypeDao();
        for (Type t : dao.getTypeAll()) {
            System.out.println(t);
        }
    }
}