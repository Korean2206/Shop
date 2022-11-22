package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.HoaDon;
import com.utils.Jdbc;

public class HoaDonDAO extends ShopFrameDAO<HoaDon,Integer> {

    private final String sqlInsert = "INSERT INTO HoaDon(MaKH,MaNV,TrangThai,NgayTao,PhuongThucTT,TongTien) values(?,?,?,?,?);";
    private final String sqlUpdate = "UPDATE HoaDon set MaKH=?,MaNV=?,TrangThai=?,NgayTao=?,PhuongThucTT=? where MaHD =?";
    private final String sqlDelete = "DELETE FROM HoaDon where MaHD =?";
    private final String sqlSelectAll = "SELECT * FROM HoaDon ";
    private final String sqlSelectByID = "SELECT * FROM HoaDon where MaHD =?";
    @Override
    public void insert(HoaDon entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlInsert,entity.getMaKH(),entity.getMaNV(),entity.getTrangThai(),entity.getNgayTao(),entity.getPttt());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void update(HoaDon entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlUpdate,entity.getMaKH(),entity.getMaNV(),entity.getTrangThai(),entity.getNgayTao(),entity.getPttt(),entity.getMaHD());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public void delete(Integer key) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlDelete,key);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public List<HoaDon> selectAll() {
        // TODO Auto-generated method stub
        List<HoaDon> list = new ArrayList<HoaDon>();
        list = selectBySQL(sqlSelectByID);
        return list;
    }

    @Override
    public HoaDon selectByID(Integer key) {
        // TODO Auto-generated method stub
        List<HoaDon> list = new ArrayList<HoaDon>();
        list = selectBySQL(sqlSelectByID, key);
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectBySQL(String sql, Object... args) {
        // TODO Auto-generated method stub
        try {
            List<HoaDon> list = new ArrayList<HoaDon>();
            ResultSet rs = Jdbc.query(sql, args);
            while (rs.next()) {
            HoaDon entity = new HoaDon();
            entity.setMaHD(rs.getInt("MaHDCT"));
            entity.setMaKH(rs.getString("MaKH"));
            entity.setMaNV(rs.getString("MaNV"));
            entity.setTrangThai(rs.getString("TrangThai"));
            entity.setNgayTao(rs.getDate("NgayTao"));
            entity.setPttt(rs.getString("PhuongThucTT"));
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
