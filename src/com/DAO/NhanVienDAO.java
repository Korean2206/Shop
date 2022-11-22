package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.NhanVien;
import com.toedter.calendar.JDayChooser;
import com.utils.Jdbc;

public class NhanVienDAO extends ShopFrameDAO<NhanVien,String> {
    private final String sqlInsert = "INSERT INTO NhanVien values(?,?,?,?,?,?,?,?,?);";
    private final String sqlUpdate = "UPDATE NhanVien set Password=?,Ten=?,GioiTinh=?,NgaySinh=?,VaiTro=?,DiaChi=?,SDT=?,Email=? where MaNV =?";
    private final String sqlDelete = "DELETE FROM NhanVien where MaNV =?";
    private final String sqlSelectAll = "SELECT * FROM NhanVien ";
    private final String sqlSelectByID = "SELECT * FROM NhanVien where MaNV =?";

    @Override
    public void insert(NhanVien entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlInsert,entity.getMaNV(),entity.getPassword(),entity.getTen(),entity.getGioiTinh(),entity.getNgaySinh(),entity.getVaiTro(),entity.getDiaChi(),entity.getSdt(),entity.getEmail());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void update(NhanVien entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlUpdate,entity.getPassword(),entity.getTen(),entity.getGioiTinh(),entity.getNgaySinh(),entity.getVaiTro(),entity.getDiaChi(),entity.getSdt(),entity.getEmail(),entity.getMaNV());
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
    public List<NhanVien> selectAll() {
        // TODO Auto-generated method stub
        List<NhanVien> list = new ArrayList<NhanVien>();
        list = selectBySQL(sqlSelectAll);
        return list;
    }

    @Override
    public NhanVien selectByID(String key) {
        // TODO Auto-generated method stub
        List<NhanVien> list = new ArrayList<NhanVien>();
        list = selectBySQL(sqlSelectByID, key);
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySQL(String sql, Object... args) {
        // TODO Auto-generated method stub
        try {
            List<NhanVien> list = new ArrayList<NhanVien>();
            ResultSet rs = Jdbc.query(sql, args);
            while (rs.next()) {
            NhanVien entity = new NhanVien();
            entity.setMaNV(rs.getString("MaNV"));
            entity.setPassword(rs.getString("Password"));
            entity.setTen(rs.getString("Ten"));
            entity.setGioiTinh(rs.getBoolean("GioiTinh"));
            entity.setNgaySinh(rs.getDate("NgaySinh"));
            entity.setVaiTro(rs.getBoolean("VaiTro"));
            entity.setDiaChi(rs.getString("DiaChi"));
            entity.setSdt(rs.getString("SDT"));
            entity.setEmail(rs.getString("Email"));
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
