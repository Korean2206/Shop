package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {
    private static final String user = "sa";
    private static final String password = "Password.1";
    private static final String url ="jdbc:sqlserver://localhost:1433;databaseName=SecondHandShop";
    private static final String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static Connection conn;
    static {
        try {
            Class.forName(driver);
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        conn = DriverManager.getConnection(url,user,password);
        PreparedStatement stmt;
        if(sql.trim().startsWith("{")){
            stmt = conn.prepareCall(sql); //proc 
        }
        else {
            stmt = conn.prepareStatement(sql); //sql
        }
        for(int i =0;i<args.length;i++){
            stmt.setObject(i+1, args[i]);
        }
        return stmt;
    }
    public static ResultSet query(String sql, Object... args) throws SQLException{
        PreparedStatement stmt = Jdbc.getStmt(sql, args);
        return stmt.executeQuery();
    }
    public static void update(String sql, Object... args) throws SQLException{
        PreparedStatement stmt = Jdbc.getStmt(sql,args);
        try{
            try{
                stmt.executeUpdate();
            }finally{
                stmt.getConnection().close();
            }
        }catch (SQLException e) {
        // TODO: handle exception
        throw new RuntimeException(e);
    }
    }
}
