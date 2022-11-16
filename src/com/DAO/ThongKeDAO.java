package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.utils.Jdbc;

public class ThongKeDAO {
    
    private List<Object[]> getListofArrayList(String sql,String[] columns,Object...args){
        try {
            List<Object[]> list = new ArrayList<Object[]>();
            ResultSet rs = Jdbc.query(sql, args);
            while(rs.next()) {
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
    public List<Object[]> getDoanhThuTheoTG(Date from, Date to) {
        String sql = "{CALL sp_doanhThuTheoTG(?)}";
        String[] columns = {"tongTien","daBan"};
        return this.getListofArrayList(sql, columns, from,to);
    }
    public List<Object[]> getDoanhThuTheoMaLoai(String maLoai){
        String sql = "{CALL sp_doanhThuTheoMaLoai}";
        String[] columns = {"MaLoai","TenLoai","SanPhamDaBan","DoanhThu"};
        return this.getListofArrayList(sql,columns,maLoai);
    }

    
}
