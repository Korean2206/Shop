package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.KhachHang;
import com.utils.Jdbc;

public class KhachHangDAO extends ShopFrameDAO<KhachHang,Integer>{

    private final String sqlInsert = "INSERT INTO KhachHang(tenKH,SDT,diem) values(?,?,?)";
    private final String sqlUpdate = "UPDATE KhachHang set TenKH=?,SDT=?,Diem=? where MaKH =?";
    private final String sqlDelete = "DELETE FROM KhachHang where MaKH =?";
    private final String sqlSelectAll = "SELECT * FROM KhachHang ";
    private final String sqlSelectByID = "SELECT * FROM KhachHang where MaKH =?";
    @Override
    public void insert(KhachHang entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlInsert,entity.getTenKH(),entity.getSdt(),entity.getDiem());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    public int insertGetID(KhachHang entity) {
        // TODO Auto-generated method stub
        try {
            return  Jdbc.getIdKhachHang(sqlInsert,entity.getTenKH(),entity.getSdt(),entity.getDiem());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return -1;
        }
        
    }

    @Override
    public void update(KhachHang entity) {
        // TODO Auto-generated method stub
        try {
            Jdbc.update(sqlUpdate,entity.getTenKH(),entity.getSdt(),entity.getDiem(),entity.getMaKH());
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
    public List<KhachHang> selectAll() {
        // TODO Auto-generated method stub
        List<KhachHang> list = new ArrayList<KhachHang>();
        list = selectBySQL(sqlSelectAll);
        return list;
    }


    @Override
    public KhachHang selectByID(Integer key) {
        // TODO Auto-generated method stub
        List<KhachHang> list = new ArrayList<KhachHang>();
        list = selectBySQL(sqlSelectByID, key);
        return list.get(0);
    }
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
    public List<Object[]> selectByTimKiem(String key) {
        String sql = "{CALL sp_timKiemKH(?)}";
        String columns[] = {"maKH","tenKH","sdt","diem"};
        return this.getListofArrayList(sql, columns, key);
    }

    @Override
    public List<KhachHang> selectBySQL(String sql, Object... args) {
        // TODO Auto-generated method stub
        try {
            List<KhachHang> list = new ArrayList<KhachHang>();
            ResultSet rs = Jdbc.query(sql, args);
            while (rs.next()) {
            KhachHang entity = new KhachHang();
            entity.setMaKH(rs.getInt("MaKH"));
            entity.setTenKH(rs.getString("TenKH"));
            entity.setSdt(rs.getString("SDT"));
            entity.setDiem(rs.getInt("Diem"));
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
