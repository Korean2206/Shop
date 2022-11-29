package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.SanPham;
import com.utils.Jdbc;

public class SanPhamDAO extends ShopFrameDAO<SanPham,String> {

    private final String sqlInsert = "INSERT INTO SanPham values(?,?,?,?,?,?,?,?,?,?);";
    private final String sqlUpdate = "UPDATE SanPham set TenSP=?,MaLoai=?,Size=?,TrangThai=?,GiaSP=?,SoLuong=?,HinhAnh=?,MoTa=?,MaNV=? where MaSP =?";
    private final String sqlDelete = "DELETE FROM SanPham where MaSP =?";
    private final String sqlSelectAll = "SELECT * FROM SanPham ";
    private final String sqlSelectByID = "SELECT * FROM SanPham where MaSP =?";

    @Override
    public void insert(SanPham entity) {
        // TODO Auto-generated method stub  
        try {
            Jdbc.update(sqlInsert,entity.getMaSP(),entity.getTenSP(),entity.getMaLoai(),entity.getSize(),entity.getTrangThai(),entity.getGiaSP(),entity.getSoLuong(),entity.getHinhAnh(),entity.getMoTa(),entity.getMaNV());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public void update(SanPham entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlUpdate,entity.getTenSP(),entity.getMaLoai(),entity.getSize(),entity.getTrangThai(),entity.getGiaSP(),entity.getSoLuong(),entity.getHinhAnh(),entity.getMoTa(),entity.getMaNV(),entity.getMaSP());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
    }

    @Override
    public void delete( String key) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlDelete,key);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public List<SanPham> selectAll() {
        // TODO Auto-generated method stub
        List<SanPham> list = new ArrayList<SanPham>();
        list = selectBySQL(sqlSelectAll);
        return list;
    }

    @Override
    public SanPham selectByID(String key) {
        // TODO Auto-generated method stub
        List<SanPham> list = new ArrayList<SanPham>();
        list = selectBySQL(sqlSelectByID, key);
        return list.get(0);
    }
    
    @Override
    public List<SanPham> selectBySQL(String sql, Object... args) {
        // TODO Auto-generated method stub
        try {
            List<SanPham> list = new ArrayList<SanPham>();
            ResultSet rs = Jdbc.query(sql, args);
            while (rs.next()) {
            SanPham entity = new SanPham();
            entity.setMaSP(rs.getString("MaSP"));
            entity.setTenSP(rs.getString("TenSP"));
            entity.setMaLoai(rs.getString("MaLoai"));
            entity.setSize(rs.getString("Size"));
            entity.setTrangThai(rs.getString("TrangThai"));
            entity.setGiaSP(rs.getDouble("GiaSP"));
            entity.setSoLuong(rs.getInt("SoLuong"));
            entity.setHinhAnh(rs.getString("HinhAnh"));
            entity.setMoTa(rs.getString("MoTa"));
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
