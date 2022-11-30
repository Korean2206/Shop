package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.utils.Jdbc;

public class ThongKeDAO {

    private List<Object[]> getListofArrayList(String sql, String[] columns, Object... args) {
        try {
            List<Object[]> list = new ArrayList<Object[]>();
            ResultSet rs = Jdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[columns.length];
                for (int i = 0; i < vals.length; i++) {
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


    public Object[] getDoanhThuTheoTG(Date from, Date to) {
        try {
            String sql = "{CALL sp_doanhThuTheoTG(?,?)}";
            String[] columns = { "daBan", "doanhThu" };
            ResultSet rs = Jdbc.query(sql, from, to);
            while (rs.next()) {
                Object[] vals = new Object[columns.length];
                for (int i = 0; i < vals.length; i++) {
                    vals[i] = rs.getObject(columns[i]);
                }
                return vals;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }

    public List<Object[]> getDoanhThuTheoMaLoai(String maLoai) {
        String sql = "{CALL sp_doanhThuTheoMaLoai(?)}";
        String[] columns = { "MaLoai", "TenLoai", "SanPhamDaBan", "DoanhThu" };
        return this.getListofArrayList(sql, columns, maLoai);
    }

    public List<Object[]> getSoLuongSanPhamDaBan(String maLoai, String trangThai) {
        String sql = "{CALL sp_getSoLuongSanPham(?,?)}";
        String[] columns = { "maLoai", "maSP", "tenSP", "conLai", "daBan", "trangThai" };
        return this.getListofArrayList(sql, columns, maLoai, trangThai);
    }

    public List<Object[]> getListHDTG(Date from, Date to, String trangThai, String pttt, String maKH) {
        String sql = "{CALL sp_getListHDTG(?,?,?,?,?)}";
        String[] columns = { "MaNV", "MaHD", "MaKH", "NgayTao", "PhuongThucTT", "TrangThai", "tongTien" };
        return this.getListofArrayList(sql, columns, from, to, trangThai, pttt, maKH);
    }

    public List<Object[]> getListHD(String trangThai, String pttt, String maKH) {
        String sql = "{CALL sp_getListHD(?,?,?)}";
        String[] columns = { "MaNV", "MaHD", "MaKH", "NgayTao", "PhuongThucTT", "TrangThai", "tongTien" };
        return this.getListofArrayList(sql, columns, trangThai, pttt, maKH);
    }
}
