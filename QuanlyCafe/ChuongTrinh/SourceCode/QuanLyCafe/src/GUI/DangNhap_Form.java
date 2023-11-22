/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.TaiKhoanBUS;
import DTO.TaiKhoanDTO;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DangNhap_Form extends javax.swing.JFrame {

    ArrayList<TaiKhoanDTO> list;
    public static String username;
   // DefaultTableModel model;
    public DangNhap_Form() {
        initComponents();       
        this.setResizable(false); 
        ImageIcon img = new ImageIcon("src//Image//login.png");
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        list=new TaiKhoanBUS().getListTaiKhoan();
        username=txtUser.getText();
        //username="1212";
    }
    public String getUser(){
        return username;
    }
    public void OK(){
        while(true){
            if(txtUser.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Tên tài khoản không được để trống.");
                txtUser.grabFocus();
                return;
            } else{
                break;
            }
        }
        while(true){
            if(txtPass.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Mật khẩu không được để trống.");
                txtPass.grabFocus();
                return;
            } else{
                break;
            }
        }
        String user=txtUser.getText();
        String pass=txtPass.getText();
        boolean k=false;
        int n=list.size();
        int i=0;
        while (i!=n){
                
               if (list.get(i).getUsename().equals(user)&&list.get(i).getPassword().equals(pass)){
                   k=true;
                   break;     
               }
               i++;
        }
        if (user.equals("admin")&&pass.equals("admin")){
            JOptionPane.showMessageDialog(null, "Đăng nhập quản trị thành công.");
            new Admin_Form().setVisible(true); 
            this.setVisible(false);
        }
        else
        {
            if (k==true){
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công.");
                    new TrangChu_Form(user).setVisible(true);
                    this.setVisible(false);
                    
               }
               else {
                        JOptionPane.showMessageDialog(null, "Lỗi:: Sai tên tài khoản hoặc mật khẩu.");
                    }  
        } 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/demo.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login.png"))); // NOI18N
        jLabel3.setText("Đăng Nhập");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(120, 80, 260, 80);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        jLabel4.setText("Tài Khoản");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 210, 150, 70);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pass.png"))); // NOI18N
        jLabel5.setText("Mật Khẩu");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 290, 150, 50);

        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        jPanel2.add(txtUser);
        txtUser.setBounds(190, 230, 170, 30);

        txtPass.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel2.add(txtPass);
        txtPass.setBounds(190, 300, 170, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/demo.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, -10, 780, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // TODO add your handling code here:
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           OK();
      }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           OK();
      }
    }//GEN-LAST:event_txtPassKeyPressed

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
            java.util.logging.Logger.getLogger(DangNhap_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}