/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class profil extends javax.swing.JFrame {

    /**
     * Creates new form profil
     */
    public profil() {
        initComponents();
        userTF.setEditable(false);
        userTF.setText(login2.user1);
        passwordTF.setText(login2.pass1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kembaliLB = new javax.swing.JLabel();
        ubahBT = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        passwordTF = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        LB = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 90, -1));
        jPanel3.add(userTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 209, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Detail profil");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 371, -1, 16));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Profil");
        jLabel3.setToolTipText("");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        kembaliLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2leftarrow.png"))); // NOI18N
        kembaliLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembaliLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliLBMouseClicked(evt);
            }
        });
        jPanel3.add(kembaliLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        ubahBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save-16x16.png"))); // NOI18N
        ubahBT.setText("Update");
        ubahBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ubahBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahBTActionPerformed(evt);
            }
        });
        jPanel3.add(ubahBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 90, -1));
        jPanel3.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 210, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gembok.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 120, -1));

        LB.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 209, 16));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Berdikari-Book");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Version 1.0");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliLBMouseClicked
        // TODO add your handling code here:
        home hm=new home();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliLBMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int reply=JOptionPane.showConfirmDialog(
                null,"Keluar dari sistem?","Logout",JOptionPane.YES_NO_OPTION
        );
        if(reply==JOptionPane.YES_OPTION){
            login lg=new login();
            lg.setVisible(true);
            dispose();
        }else{
            home p=new home();
            p.setEnabled(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ubahBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahBTActionPerformed
        // TODO add your handling code here:
        String user=userTF.getText();
        String password=passwordTF.getText();
        int reply=JOptionPane.showConfirmDialog(
                null,"Yakin ingin mengubah data profil?"+password,"Data Profil",JOptionPane.YES_NO_OPTION
        );
        if(reply==JOptionPane.YES_OPTION){
            try {
                Connection koneksikan=koneksi.getkoneksikan();
                Statement s=koneksikan.createStatement();
                System.out.println("Database ditemukan");                   
                        String input="update user set password='"+password+"'where username='"+user+"'";
                        s.executeUpdate(input); 
                        String pesan="Berhasil mengubah password";
                        JOptionPane.showMessageDialog(null, pesan,"Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                LB.setText("Data profil berhasil diubah");
            } catch (Exception e) {
                String pesan="Maaf terjadi kesalahan";
                JOptionPane.showMessageDialog(rootPane, pesan);
            }   
        }else{
           profil p=new profil();
           p.setEnabled(true);
        }
    }//GEN-LAST:event_ubahBTActionPerformed

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
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel kembaliLB;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JButton ubahBT;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
