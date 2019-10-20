package com.vvblog.JDBC;

import java.sql.*;

/**
 * @program: lqx-login
 * @description: JDBC封装工具类
 * @author: Li Qixuan
 * @create: 2019-08-05 21:39
 */
public class DbUtil {
    //初始化连接信息
    private static Connection conn = null;
    private static String url = "jdbc:mysql://115.159.94.102:3306/vvblog";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, "root", "lqx8246...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static public ResultSet query(String sql, Object[] params){
        ResultSet rs = null;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            if (params != null){
                for(int i = 0; i < params.length; i++){
                    pst.setObject(i+1, params[i]);
                }
            }
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    static public int update(String sql, Object[] params){
        int rs = 0;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            if (params != null){
                for(int i = 0; i < params.length; i++){
                    pst.setObject(i+1, params[i]);
                }
            }
            rs = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}