package com.shop.util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static Connection getConnection() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/shop?characterEncoding=utf-8&serverTimeZone=Asia/Shanghai";
        String username = "root";
        String password = "2003227wlj";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("���ݿ����ӳɹ�");

        } catch (ClassNotFoundException e) {
            System.out.println("������ȡʧ��");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("���ݿ�����ʧ��");
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            conn.close();
            System.out.println("���ݿ����ӹرճɹ�");
        } catch (SQLException e) {
            System.out.println("���ݿ����ӹر�ʧ��");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection conn = getConnection();
        closeConnection(conn);
    }
}
