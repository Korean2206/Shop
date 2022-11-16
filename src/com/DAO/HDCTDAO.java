package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.HDCT;
import com.utils.Jdbc;

public class HDCTDAO extends ShopFrameDAO<HDCT,Integer> {

    private final String sqlInsert = "INSERT INTO HDCT values(?,?,?,?,?,?,?);";
    private final String sqlUpdate = "UPDATE HDCT set MaHD=?,MaKH=?,MaSP=?,DonGia=?,SoLuong=?,MoTa=? where MaHDCT =?";
    private final String sqlDelete = "DELETE FROM HDCT where MaHDCT =?";
    private final String sqlSelectAll = "SELECT * FROM HDCT ";
    private final String sqlSelectByID = "SELECT * FROM HDCT where MaHDCT =?";
    @Override
    public void insert(HDCT entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlInsert,entity.getMaHDCT(),entity.getMaKH(),entity.getMaSP(),entity.getDonGia(),entity.getSoLuong(),entity.getMoTa(),entity.getMoTa());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public void update(HDCT entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlUpdate,entity.getMaKH(),entity.getMaSP(),entity.getDonGia(),entity.getSoLuong(),entity.getMoTa(),entity.getMoTa(),entity.getMaHDCT());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public void delete(HDCT entity, Integer key) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlDelete, key);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public List<HDCT> selectAll() {
        // TODO Auto-generated method stub
        List<HDCT> list = new ArrayList<HDCT>();
        list = selectBySQL(sqlSelectAll);
        return list;
    }

    @Override
    public HDCT selectByID(Integer key) {
        // TODO Auto-generated method stub
        List<HDCT> list = new ArrayList<HDCT>();
        list = selectBySQL(sqlSelectByID,key);
        return list.get(0);
    }

    @Override
    public List<HDCT> selectBySQL(String sql, Object... args) {
        // TODO Auto-generated method stub
        try {
            List<HDCT> list = new ArrayList<HDCT>();
           ResultSet rs = Jdbc.query(sql, args);
           while (rs.next()) {
            HDCT entity = new HDCT();
            entity.setMaHDCT(rs.getInt("MaHDCT"));
            entity.setMaHD(rs.getInt("MaHDCT"));
            entity.setMaKH(rs.getString("MaKH"));
            entity.setMaSP(rs.getString("MaSP"));
            entity.setDonGia(rs.getDouble("DonGia"));
            entity.setSoLuong(rs.getInt("SoLuong"));
            entity.setMoTa(rs.getString("MoTa"));
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
