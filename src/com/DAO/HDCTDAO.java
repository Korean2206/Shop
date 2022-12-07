package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.HDCT;
import com.utils.Jdbc;

public class HDCTDAO extends ShopFrameDAO<HDCT,Integer> {

    private final String sqlInsert = "INSERT INTO HDCT(MaHD,MaSP,DonGia,SoLuong) values(?,?,?,?);";
    private final String sqlUpdate = "UPDATE HDCT set MaHD=?,MaSP=?,DonGia=?,SoLuong=? where MaHDCT =?";
    private final String sqlDelete = "DELETE FROM HDCT where MaHDCT =?";
    private final String sqlSelectAll = "SELECT * FROM HDCT ";
    private final String sqlSelectByID = "SELECT * FROM HDCT where MaHDCT =?";
    @Override
    public void insert(HDCT entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlInsert,entity.getMaHD(),entity.getMaSP(),entity.getDonGia(),entity.getSoLuong());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    public void insertList(List<HDCT> list) {
        try {
            for(HDCT entity : list){
                Jdbc.update(sqlInsert,entity.getMaHD(),entity.getMaSP(),entity.getDonGia(),entity.getSoLuong());
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void update(HDCT entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlUpdate,entity.getMaHD(),entity.getMaSP(),entity.getDonGia(),entity.getSoLuong(),entity.getMaHDCT());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public void delete(Integer key) {
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

    public List<Object[]> getTTHD(int maHD) {
        String sql = "{CALL sp_showTTHD(?)}";
        String[] columns = {"maSP","TenSP","soLuong","DonGia"};
        return this.getListofArrayList(sql, columns,maHD);
    }
    private List<Object[]> getListofArrayList(String sql, String[] columns, Object... args) {
        try {
                List<Object[]> list = new ArrayList<Object[]>();
                ResultSet rs = Jdbc.query(sql, args);
                while (rs.next()) {
                    Object[] vals = new Object[columns.length];
                    for(int i = 0; i < vals.length; i++){
                        vals[i] = rs.getObject(columns[i]);
                    }
                    list.add(vals);
                }
                return list;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }
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
            entity.setMaHD(rs.getInt("MaHD"));
            entity.setMaSP(rs.getString("MaSP"));
            entity.setDonGia(rs.getDouble("DonGia"));
            entity.setSoLuong(rs.getInt("SoLuong"));
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
