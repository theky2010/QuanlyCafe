/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import BUS.CTHDBUS;
import BUS.ChiTietNhapBUS;
import BUS.HoaDonBUS;
import BUS.MenuBUS;
import BUS.NhanVienBUS;
import DTO.CTHDDTO;
import DTO.ChiTietNhapDTO;
import DTO.HoaDonDTO;
import DTO.MenuDTO;
import DTO.NhanVienDTO;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu_Form extends javax.swing.JFrame {
    private ArrayList<MenuDTO> list;
    DefaultTableModel model;
    /** Creates new form Menu_Form */
    public Menu_Form() {
        initComponents();
        this.setResizable(false); 
        ImageIcon img = new ImageIcon("src//Image//hoadon.png");
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        tbMenu.setShowGrid(true);
        list = new MenuBUS().getListMenu();
        model = (DefaultTableModel) tbMenu.getModel();
        model.setColumnIdentifiers(new Object[]{
            "STT", "MaMon", "TenMon", "DonGia", "SoLuongTon"
        });
        tbMenu.getColumnModel().getColumn(0).setPreferredWidth(40);
        clearTable();
        showTable();
    }
    public void showTable() {
        int i=1;
        for (MenuDTO s : list) {
            model.addRow(new Object[]{
                i++, s.getMaMon(), s.getTenMon(), s.getDonGia(), s.getSoLuongTon()
            });
        }
    }
    public void clearTable() {
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
    }
   }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMenu = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        txtMaMon = new javax.swing.JTextField();
        txtTenMon = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtSoLuongTon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Món");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hoadon.png"))); // NOI18N
        jLabel1.setText("Quản Lý Món");

        tbMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        tbMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMenu);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/key2.png"))); // NOI18N
        jLabel2.setText("Mã Món");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/name.png"))); // NOI18N
        jLabel3.setText("Tên Món");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gianhap.png"))); // NOI18N
        jLabel4.setText("Đơn Giá");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/amount.png"))); // NOI18N
        jLabel5.setText("Số Lượng Tồn");

        bt1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Thêm.png"))); // NOI18N
        bt1.setText("Thêm");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/update.png"))); // NOI18N
        bt2.setText("Sửa");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-bin-24.png"))); // NOI18N
        bt3.setText("Xóa");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search_more_48px.png"))); // NOI18N
        jLabel6.setText("  Tìm kiếm");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search_48px.png"))); // NOI18N
        jButton1.setText("Tìm kiếm");
        jButton1.setAlignmentX(0.5F);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/restart_16px.png"))); // NOI18N
        jButton2.setText("Refesh");
        jButton2.setAlignmentX(0.5F);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt3))
                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(txtDonGia)
                    .addComponent(txtTenMon)
                    .addComponent(txtMaMon)
                    .addComponent(jTextFieldSearch))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void showDB1(){
        int selectrow=tbMenu.getSelectedRow();
        txtMaMon.setText(tbMenu.getValueAt(selectrow,1).toString());
        txtTenMon.setText(tbMenu.getValueAt(selectrow,2).toString());
        txtDonGia.setText(tbMenu.getValueAt(selectrow,3).toString());
        txtSoLuongTon.setText(tbMenu.getValueAt(selectrow,4).toString());
        //thêm hình
        if (selectrow==0)
        {
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("src//Image//coffee-da.jpg").getImage().getScaledInstance(300, 190, Image.SCALE_DEFAULT));
            jLabel7.setIcon(imageIcon);
        }
        else if (selectrow==1)
        {
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("src//Image//bacxiu.jpg").getImage().getScaledInstance(300, 190, Image.SCALE_DEFAULT));
            jLabel7.setIcon(imageIcon);
        }
        else if (selectrow==2)
        {
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("src//Image//coffee.jpg").getImage().getScaledInstance(300, 190, Image.SCALE_DEFAULT));
            jLabel7.setIcon(imageIcon);
        }
        else if (selectrow==3)
        {
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("src//Image//cacao.jpg").getImage().getScaledInstance(300, 190, Image.SCALE_DEFAULT));
            jLabel7.setIcon(imageIcon);
        }
        else if (selectrow==4)
        {
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("src//Image//cacaonong.jpg").getImage().getScaledInstance(300, 190, Image.SCALE_DEFAULT));
            jLabel7.setIcon(imageIcon);
        }
        else if (selectrow==5)
        {
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("src//Image//camep.jpg").getImage().getScaledInstance(300, 190, Image.SCALE_DEFAULT));
            jLabel7.setIcon(imageIcon);
        }
        else if (selectrow==6)
        {
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("src//Image//carrot.jpg").getImage().getScaledInstance(300, 190, Image.SCALE_DEFAULT));
            jLabel7.setIcon(imageIcon);
        }
        else if (selectrow==7)
        {
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("src//Image//nuocngot.jpg").getImage().getScaledInstance(300, 190, Image.SCALE_DEFAULT));
            jLabel7.setIcon(imageIcon);
        }
        else
        {
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("src//Image//nuocsuoi.jpg").getImage().getScaledInstance(300, 190, Image.SCALE_DEFAULT));
            jLabel7.setIcon(imageIcon);
        }
    }
    private void tbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMenuMouseClicked
        // TODO add your handling code here:
        showDB1();
    }//GEN-LAST:event_tbMenuMouseClicked
//thêm
    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        MenuDTO s= new MenuDTO();
        s.setMaMon(txtMaMon.getText());
        s.setTenMon(txtTenMon.getText());
        s.setDonGia(Integer.parseInt(txtDonGia.getText()));
        s.setSoLuongTon(Integer.parseInt(txtSoLuongTon.getText()));
        if (new MenuBUS().addMenu(s)){
            JOptionPane.showMessageDialog(null, "Thêm Thành Công.");
            list.add(s);
        } else {
            JOptionPane.showMessageDialog(null, "Thêm Thất Bại.");
        }
        clearTable();
        list = new MenuBUS().getListMenu();
        showTable();
    }//GEN-LAST:event_bt1ActionPerformed
//sửa
    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        MenuDTO s= new MenuDTO();
        s.setMaMon(txtMaMon.getText());
        s.setTenMon(txtTenMon.getText());
        s.setDonGia(Integer.parseInt(txtDonGia.getText()));
        s.setSoLuongTon(Integer.parseInt(txtSoLuongTon.getText()));
         if (new MenuBUS().updateMenu(s)) {
            JOptionPane.showMessageDialog(null, "Sửa Thành Công.");
        } else {
            JOptionPane.showMessageDialog(null, "Sửa Thất Bại.");
        }
        clearTable();
        list = new MenuBUS().getListMenu();
        showTable();
    }//GEN-LAST:event_bt2ActionPerformed
//xóa
    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        MenuDTO s= new MenuDTO();
        s.setMaMon(txtMaMon.getText());
         if (new MenuBUS().deleteMenu(s)) {
            JOptionPane.showMessageDialog(null, "Xóa Thành Công.");
        } else {
            JOptionPane.showMessageDialog(null, "Xóa Thất Bại.");
        }
        clearTable();
        list = new MenuBUS().getListMenu();
        showTable();
    }//GEN-LAST:event_bt3ActionPerformed
//tìm kiếm
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String keyString=jTextFieldSearch.getText();
        if(keyString.equals("")){
            JOptionPane.showMessageDialog(null, "Hãy nhập mã món cần tìm");
            jTextFieldSearch.requestFocus(true);
        }else {
            tbMenu.removeAll();
            tbMenu.revalidate();
            tbMenu.repaint();
            DefaultTableModel defaultTableModel=new DefaultTableModel();
            tbMenu.setModel(defaultTableModel);           
//setting lại table menu
            MenuBUS menuBus=new MenuBUS();
            try {
                ArrayList<MenuDTO> menu=menuBus.searchMenu(keyString);
                defaultTableModel.addColumn("STT");
                defaultTableModel.addColumn("MaMon");
                defaultTableModel.addColumn("TenMon");
                defaultTableModel.addColumn("DonGia");
                defaultTableModel.addColumn("SoLuongTon");
                int i=1;
                for (MenuDTO menu1: menu){
                    defaultTableModel.addRow(new Object[]{
                        i++, menu1.getMaMon(), menu1.getTenMon(), menu1.getDonGia(), menu1.getSoLuongTon()
                    });
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//refesh
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel defaultTableModel=new DefaultTableModel();
        tbMenu.setModel(defaultTableModel);       
        MenuBUS menuBus=new MenuBUS();
        try {
                ArrayList<MenuDTO> menu=menuBus.getListMenu();
                defaultTableModel.addColumn("STT");
                defaultTableModel.addColumn("MaMon");
                defaultTableModel.addColumn("TenMon");
                defaultTableModel.addColumn("DonGia");
                defaultTableModel.addColumn("SoLuongTon");
                int i=1;
                for (MenuDTO menu1: menu){
                    defaultTableModel.addRow(new Object[]{
                        i++, menu1.getMaMon(), menu1.getTenMon(), menu1.getDonGia(), menu1.getSoLuongTon()
                    });
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Không kết nối CSDL");
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTable tbMenu;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtSoLuongTon;
    private javax.swing.JTextField txtTenMon;
    // End of variables declaration//GEN-END:variables

}