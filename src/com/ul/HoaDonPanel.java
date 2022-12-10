package com.ul;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import com.DAO.HDCTDAO;
import com.DAO.HoaDonDAO;
import com.DAO.KhachHangDAO;
import com.DAO.KhuyenMaiDAO;
import com.entity.HDCT;
import com.entity.HoaDon;
import com.entity.KhachHang;
import com.entity.SanPham;
import com.utils.Auth;
import com.utils.XMessage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author korea
 */
public class HoaDonPanel extends javax.swing.JPanel {

    /**
     * Creates new form HoaDon
     */
    public HoaDonPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSoLuongSP = new javax.swing.JTable();
        txtGhiChu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiCHu = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboPttt = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtTienKhachTra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTienThua = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        btnQuetQR = new javax.swing.JButton();

        jLabel2.setText("SĐT:");

        jLabel3.setText("Họ Tên :");

        jLabel4.setText("Điểm tích lũy :");

        tblSoLuongSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSoLuongSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSoLuongSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSoLuongSP);

        txtGhiChu.setText("Ghi chú :");

        txtGhiCHu.setColumns(20);
        txtGhiCHu.setRows(5);
        jScrollPane2.setViewportView(txtGhiCHu);

        jLabel6.setText("Tổng tiền hóa đơn");

        txtTongTien.setEnabled(false);

        jLabel7.setText("Hình thức thanh toán :");

        cboPttt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Tiền khách trả :");

        txtTienKhachTra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTienKhachTraKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienKhachTraKeyReleased(evt);
            }
        });

        jLabel9.setText("Tiền thừa :");

        txtTienThua.setEnabled(false);

        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnQuetQR.setText("Quét QR");
        btnQuetQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuetQRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuetQR)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiem, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(txtGhiChu)
                                .addComponent(jLabel2))
                            .addGap(109, 109, 109)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(txtTongTien)
                                    .addComponent(jLabel7)
                                    .addComponent(cboPttt, 0, 170, Short.MAX_VALUE)
                                    .addComponent(txtTienKhachTra)
                                    .addComponent(txtTienThua))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnThanhToan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnHuy))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnQuetQR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPttt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienKhachTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGhiChu)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThanhToan)
                            .addComponent(btnHuy))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        insert();
        DoanhThuPanel.tienHN();
        DoanhThuPanel.tienTuan();
        DoanhThuPanel.tienThang();
        DoanhThuPanel.fillTable();
        TKSanPhamPanel.fillTable();
        TKHoaDonPanel.fillTableHD();
        
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void tblSoLuongSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSoLuongSPMouseClicked
        // TODO add your handling code here:
        txtTongTien.setText("" + getTongTien());
    }//GEN-LAST:event_tblSoLuongSPMouseClicked

    private void txtTienKhachTraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachTraKeyPressed
        // TODO add your handling code here:
        checkTien();

    }//GEN-LAST:event_txtTienKhachTraKeyPressed

    private void txtTienKhachTraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachTraKeyReleased
        // TODO add your handling code here:
        checkTien();

    }//GEN-LAST:event_txtTienKhachTraKeyReleased

    private void btnQuetQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuetQRActionPerformed
        // TODO add your handling code here:
        new ReadQRCode(null,true).setVisible(true);;
    }//GEN-LAST:event_btnQuetQRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnQuetQR;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JComboBox<String> cboPttt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tblSoLuongSP;
    private static javax.swing.JTextField txtDiem;
    private javax.swing.JTextArea txtGhiCHu;
    private javax.swing.JLabel txtGhiChu;
    private static javax.swing.JTextField txtSDT;
    private static javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTienKhachTra;
    private javax.swing.JTextField txtTienThua;
    protected static javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
    private void init() {
        fillCBOHTTT();
        fillTableSL(BanHangPanel.listSP);
    }
    private HoaDonDAO daoHD = new HoaDonDAO();
    private HDCTDAO daoHDCT = new HDCTDAO();
    private KhachHangDAO daoKH = new KhachHangDAO();
    private static KhuyenMaiDAO daoKM = new KhuyenMaiDAO();	
    private void checkTien() {
        double tienThua = getTienThua();
        Color errorColor,defaultColor;
        errorColor = new Color(255,51,51);
        defaultColor = new Color(0,0,0);
        if(tienThua < 0){
            txtTienThua.setForeground(errorColor);
            txtTienThua.setText("Tiền khách trả không đủ");
        }
        else {
            txtTienThua.setForeground(defaultColor);
            txtTienThua.setText("" + tienThua);
        }
    }
    private Double getTienThua() {
        try {
            Double tongTien = Double.parseDouble(txtTongTien.getText().trim());
            Double tienKhachDua = Double.parseDouble(txtTienKhachTra.getText().trim());
        return (tienKhachDua - tongTien);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }

    }
    static void fillTableSL(List<SanPham> list) {
        Date now = new Date();
        String []header = {"Mã SP","Tên SP","Size","Đơn Giá","Giảm giá ","Số Lượng","Tổng tiền"};
        DefaultTableModel model = new DefaultTableModel(header,0);
        tblSoLuongSP.setModel(model);
        for (SanPham sp : list) {
            int soLuong = 1;
            Double ptkm = daoKM.getPhanTramKhuyenMai(sp.getMaSP(), now);
            if(ptkm == null) ptkm = 0.;
            Double tt = soLuong * sp.getGiaSP();
            Object[] row = { sp.getMaSP(), sp.getTenSP(), sp.getSize(), sp.getGiaSP(),ptkm, soLuong, tt };
            model.addRow(row);
        }
    }
    private void fillCBOHTTT() {
        String []list = {"Tiền mặt","Chuyển khoản"};
        cboPttt.removeAllItems();
        for(int i=0; i<list.length;i++){
            cboPttt.addItem(list[i]);
        }
    }
    
    private void setFromHD(HoaDon hd){
        if(hd.getTongTien() == null){
            txtTongTien.setText("");
            txtGhiCHu.setText("");
            txtTienKhachTra.setText("");
            txtTienThua.setText("");
            cboPttt.setSelectedItem(cboPttt.getSelectedItem());

        }else {
            txtGhiCHu.setText(hd.getMoTa());
            txtTongTien.setText(String.valueOf(hd.getTongTien()));
            cboPttt.setSelectedItem(cboPttt.getSelectedItem());
            txtTienKhachTra.setText(String.valueOf(hd.getTienKhachDua()));
            txtTienThua.setText(String.valueOf(hd.getTienThua()));
        }
    }
    public static void setFormKhachHang(KhachHang kh) {
        txtSDT.setText(kh.getSdt());
        txtTen.setText(kh.getTenKH());
        txtDiem.setText(String.valueOf(kh.getDiem()));
    }
    public static Double getTongTien() {
        int rowCount = tblSoLuongSP.getRowCount();
        Double tongTien = 0.;
        for(int i = 0; i < rowCount; i++) {
            Double tien = (Double) tblSoLuongSP.getValueAt(i, 6);
            tongTien += tien;
        }
        return tongTien;
    }
    
    private HoaDon getFormHD() {
        HoaDon hd = new HoaDon();
        hd.setMaNV(Auth.user.getMaNV());
        hd.setNgayTao(new Date());
        hd.setTongTien(Double.parseDouble(txtTongTien.getText()));
        hd.setTienKhachDua(Double.parseDouble(txtTienKhachTra.getText()));
        hd.setTienThua(Double.parseDouble(txtTienThua.getText()));
        hd.setPttt(cboPttt.getSelectedItem().toString());
        hd.setMaKH(BanHangPanel.getMaKH());
        hd.setMoTa(txtGhiCHu.getText());
        return hd;
    }

    private List<HDCT> getFormHDCT(int id) {
        
        int rowCount = tblSoLuongSP.getRowCount();
        List <HDCT> list = new ArrayList<HDCT>();
        for(int i = 0; i < rowCount; i++) {
            HDCT hdct = new HDCT();
            hdct.setMaHD(id);
            hdct.setMaSP(tblSoLuongSP.getValueAt(i, 0).toString());
            hdct.setDonGia((Double)tblSoLuongSP.getValueAt(i, 3));
            hdct.setSoLuong((int)tblSoLuongSP.getValueAt(i, 5));
            list.add(hdct);
        }
        return list;
    }
    private KhachHang getFormKH() {
        KhachHang kh = new KhachHang();
        kh.setTenKH(txtTen.getText());
        kh.setSdt(txtSDT.getText());
        kh.setDiem(Double.parseDouble(txtDiem.getText()));
        return kh;
    }

    private void clearForm(){
        HoaDon hd = new HoaDon();
        KhachHang kh = new KhachHang();
        setFormKhachHang(kh);
        setFromHD(hd);
        BanHangPanel.listSP.clear();
        BanHangPanel.rowKH = -1;
        fillTableSL(BanHangPanel.listSP);
    }
    
    private void insert() {
        HoaDon hd = getFormHD();
        KhachHang kh = getFormKH();
        int idKH = -1;
        try{
            if(hd.getMaKH() == -1){
               idKH = daoKH.insertGetID(kh);
            }
            else {
                idKH = BanHangPanel.getMaKH();
                kh.setMaKH(idKH);
                daoKH.update(kh);
            }
            hd.setMaKH(idKH);
            int idHD = daoHD.insertGetID(hd);
            List<HDCT> hdctList = getFormHDCT(idHD);
            daoHDCT.insertList(hdctList);
            BanHangPanel.fillTableKH();
            BanHangPanel.fillTableSP();
            clearForm();
            XMessage.alert(this, "Đã thanh toán");
        }catch (Exception e) {
            e.printStackTrace();
            XMessage.alert(this, "Thanh toán thất bại");
        }

    }
    

    
}
