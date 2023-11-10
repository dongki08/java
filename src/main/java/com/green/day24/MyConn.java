package com.green.day24;

import java.sql.*;

public class MyConn {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn() {
        Connection conn = null; //인터페이스 추상메소드로 이루어진 것
        // 인터페이스를 받을때 인플리먼츠
        // 클래스는 익스텐즈
        // 인터페이스를 인터페이스에 받을때 익스텐즈
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            System.out.println("에러발생!!!");
            e.printStackTrace();
        }
        System.out.println("접속 성공!!!");
        return conn;
    }
    public static void close(Connection conn, PreparedStatement ps) {
        if(ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        if(rs != null) {
            try {
                rs.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn, ps);
    }
}
