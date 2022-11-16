package com.entity;

import java.util.Date;

public class HoaDon {
    private int maHD;
    private String maKH;
    private String maNV;
    private String trangThai;
    private Date ngayTao;
    private String pttt;

    public int getMaHD() {
        return this.maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return this.maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return this.maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayTao() {
        return this.ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getPttt() {
        return this.pttt;
    }

    public void setPttt(String pttt) {
        this.pttt = pttt;
    }

}
