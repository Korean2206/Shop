package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Loai;
import com.utils.Jdbc;

public class LoaiDAO extends ShopFrameDAO<Loai,String> {
    private final String sqlInsert = "INSERT INTO Loai values(?,?,?);";
    private final String sqlUpdate = "UPDATE Loai set TenLoai=?,DanhCho=? where MaLoai =?";
    private final String sqlDelete = "DELETE FROM Loai where MaLoai =?";
    private final String sqlSelectAll = "SELECT * FROM Loai ";
    private final String sqlSelectByID = "SELECT * FROM Loai where MaLoai =?";

    @Override
    public void insert(Loai entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlUpdate,entity.getMaLoai(),entity.getTenLoai(),entity.getDanhCho());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void update(Loai entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlUpdate,entity.getTenLoai(),entity.getDanhCho(),entity.getMaLoai());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void delete( String key) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlDelete, key);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public List<Loai> selectAll() {
        // TODO Auto-generated method stub
        List<Loai> list = new ArrayList<Loai>();
        list = selectBySQL(sqlSelectAll);
        return list;
    }

    @Override
    public Loai selectByID(String key) {
        // TODO Auto-generated method stub
        List<Loai> list = new ArrayList<Loai>();
        list = selectBySQL(sqlSelectByID, key);
        return list.get(0);
    }

    @Override
    public List<Loai> selectBySQL(String sql, Object... args) {
        // TODO Auto-generated method stub
        try {
            List<Loai> list = new ArrayList<Loai>();
            ResultSet rs = Jdbc.query(sql, args);
            while (rs.next()) {
            Loai entity = new Loai();
            entity.setMaLoai(rs.getString("MaLoai"));
            entity.setTenLoai(rs.getString("TenLoai"));
            entity.setDanhCho(rs.getBoolean("DanhCho"));
            list.add(entity);
           }
           rs.getStatement().getConnection().close();
           return list;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;

        }
    }
    
}
