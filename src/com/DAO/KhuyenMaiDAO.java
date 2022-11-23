package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.KhuyenMai;
import com.utils.Jdbc;

public class KhuyenMaiDAO extends ShopFrameDAO<KhuyenMai,String>{

    private final String sqlInsert = "INSERT INTO KhuyenMai values(?,?,?,?,?,?,?);";
    private final String sqlUpdate = "UPDATE KhuyenMai set TenKM=?,MaLoaiKM=?,NgayBatDau=?,NgayKetThuc=?,PhanTramKM=?,MaNV=? where MaKM =?";
    private final String sqlDelete = "DELETE FROM KhuyenMai where MaKM =?";
    private final String sqlSelectAll = "SELECT * FROM KhuyenMai ";
    private final String sqlSelectByID = "SELECT * FROM KhuyenMai where MaKM =?";
    @Override
    public void insert(KhuyenMai entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlInsert,entity.getMaKM(),entity.getTenKM(),entity.getMaLoaiKM(),entity.getNgayBatDau(),entity.getNgayKetThuc(),entity.getPhanTram(),entity.getMaNV());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public void update(KhuyenMai entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlUpdate,entity.getTenKM(),entity.getMaLoaiKM(),entity.getNgayBatDau(),entity.getNgayKetThuc(),entity.getPhanTram(),entity.getMaNV(),entity.getMaKM());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public void delete(String key) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlDelete,key);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public List<KhuyenMai> selectAll() {
        // TODO Auto-generated method stub
        List<KhuyenMai> list = new ArrayList<KhuyenMai>();
        list = selectBySQL(sqlSelectAll);
        return list;
    }

    @Override
    public KhuyenMai selectByID(String key) {
        // TODO Auto-generated method stub
        List<KhuyenMai> list = new ArrayList<KhuyenMai>();
        list = selectBySQL(sqlSelectByID, key);
        return list.get(0);
    }

    public List<KhuyenMai> selectByName(String key) {
        // TODO Auto-generated method stub
        String sql = "select * from khuyenMai where tenKM like ?";
        List<KhuyenMai> list = new ArrayList<KhuyenMai>();
        list = selectBySQL(sql, key);
        return list;
    }

    @Override
    public List<KhuyenMai> selectBySQL(String sql, Object... args) {
        // TODO Auto-generated method stub
        try {
            List<KhuyenMai> list = new ArrayList<KhuyenMai>();
            ResultSet rs = Jdbc.query(sql, args);
            while (rs.next()) {
            KhuyenMai entity = new KhuyenMai();
            entity.setMaKM(rs.getString("MaKM"));
            entity.setTenKM(rs.getString("TenKM"));
            entity.setMaLoaiKM(rs.getString("MaLoaiKM"));
            entity.setNgayBatDau(rs.getDate("NgayBatDau"));
            entity.setNgayKetThuc(rs.getDate("NgayKetThuc"));
            entity.setPhanTram(rs.getDouble("PhanTramKM"));
            entity.setMaNV(rs.getString("MaNV"));
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
