package com.entity;

import java.util.Date;

public class HoaDon {
    private int maHD;
    private int maKH = -1;
    private String maNV;
    private String trangThai = "Đã thanh toán";
    private Date ngayTao;
    private String pttt;
    private Double tongTien;
    private Double tienKhachDua;
    private Double tienThua;
    private String moTa;

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Double getTongTien() {
        return this.tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public Double getTienKhachDua() {
        return this.tienKhachDua;
    }

    public void setTienKhachDua(Double tienKhachDua) {
        this.tienKhachDua = tienKhachDua;
    }

    public Double getTienThua() {
        return this.tienThua;
    }

    public void setTienThua(Double tienThua) {
        this.tienThua = tienThua;
    }

    public int getMaHD() {
        return this.maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMaKH() {
        return this.maKH;
    }

    public void setMaKH(int maKH) {
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
