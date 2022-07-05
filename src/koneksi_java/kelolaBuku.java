/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi_java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class kelolaBuku extends javax.swing.JFrame {
private DefaultTableModel model;
    /**
     * Creates new form kelolaBuku
     */
    public kelolaBuku() {
        initComponents();
        Tanggal_sekarang();
        Jam_digital();
        model=new DefaultTableModel();
        bukuTB.setModel(model);
        model.addColumn("Id_Buku");
        model.addColumn("Nama_Buku");
        model.addColumn("Nama_Pengarang");
        model.addColumn("Nama_Penerbit");
        model.addColumn("Jumlah_Halaman");
        model.addColumn("Tahun_Penerbit");
        model.addColumn("Jumlah_Stok");
        model.addColumn("Harga");
        getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void getData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Connection koneksikan=koneksi.getkoneksikan();
            Statement s=koneksikan.createStatement();
            String sql="SELECT *from data_buku";
                ResultSet r=s.executeQuery(sql);
                while(r.next()){
                    Object[] obj = new Object[8];
                    obj[0]=r.getString("id_buku");
                    obj[1]=r.getString("nama_buku");
                    obj[2]=r.getString("nama_pengarang");
                    obj[3]=r.getString("nama_penerbit");
                    obj[4]=r.getString("jml_halaman");
                    obj[5]=r.getString("tahun_terbit");
                    obj[6]=r.getString("jumlah_stok");
                    obj[7]=r.getString("harga");
                    model.addRow(obj);
                }
                r.close();
                s.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Tanggal_sekarang(){
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat ("dd-MM-yyyy") ;
        tanggalLB.setText(kal.format(sekarang));
    }
    
    //penrintah menampilkan jam
    public void Jam_digital(){
        new Thread(){
            @Override
            public void run(){
                int waktu_mulai = 0;
                while (waktu_mulai == 0){
                Calendar kalender = new GregorianCalendar();
                int jam = kalender.get(Calendar.HOUR);
                int menit = kalender.get(Calendar.MINUTE);
                int detik = kalender.get(Calendar.SECOND);
                int AM_PM = kalender.get(Calendar.AM_PM);
                String siang_malam = "";
                if (AM_PM == 1){
                    siang_malam = "PM";
                }
                else {
                    siang_malam = "AM";
                }
                String time = jam+" : "+menit+" : "+detik+" "+siang_malam;
                jamLB.setText(time);
                }
            }
        }.start();
    }
    public void hapus(){
        idTF.setText("");
        namaTF.setText("");
        namapengarangTF.setText("");
        namapenerbitTF.setText("");
        tahunTF.setText("");
        hargaTF.setText("");
        jumlahhalamanTF.setText("");
        jumlahstokTF.setText("");
        idTF.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jamLB = new javax.swing.JLabel();
        tanggalLB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bukuTB = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        namapengarangTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        namapenerbitTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jumlahhalamanTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tahunTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jumlahstokTF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        hargaTF = new javax.swing.JTextField();
        tambahBT = new javax.swing.JButton();
        hapusBT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(null);

        jamLB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jamLB.setForeground(new java.awt.Color(255, 255, 255));
        jamLB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jamLB.setText("JAM");
        jPanel3.add(jamLB);
        jamLB.setBounds(540, 20, 150, 40);

        tanggalLB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tanggalLB.setForeground(new java.awt.Color(255, 255, 255));
        tanggalLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tanggalLB.setText("TANGGAL");
        jPanel3.add(tanggalLB);
        tanggalLB.setBounds(10, 20, 230, 40);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kelola Data Buku");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        bukuTB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bukuTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Buku", "Nama Buku", "Nama Pengarang", "Nama Penerbit", "Jumlah Halaman", "Tahun Terbit", "Jumlah Stok", "Harga"
            }
        ));
        bukuTB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bukuTB.setGridColor(new java.awt.Color(255, 153, 102));
        bukuTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bukuTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bukuTB);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 690, 190));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id buku:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 20));

        idTF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(idTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama buku:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 20));
        jPanel2.add(namaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama pengarang:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 20));
        jPanel2.add(namapengarangTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, -1));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nama penerbit:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 20));
        jPanel2.add(namapenerbitTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Jumlah halaman:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 130, 20));
        jPanel2.add(jumlahhalamanTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 190, -1));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tahun terbit:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 130, 20));
        jPanel2.add(tahunTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 190, -1));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Jumlah stok:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 130, 20));
        jPanel2.add(jumlahstokTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 190, -1));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Harga:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 130, 20));
        jPanel2.add(hargaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 190, -1));

        tambahBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        tambahBT.setText("Tambah");
        tambahBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tambahBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBTActionPerformed(evt);
            }
        });
        jPanel2.add(tambahBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, 30));

        hapusBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cancel-2-16x16.png"))); // NOI18N
        hapusBT.setText("Hapus");
        hapusBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapusBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTActionPerformed(evt);
            }
        });
        jPanel2.add(hapusBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 90, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh kecil.png"))); // NOI18N
        jButton3.setText("Refresh");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 270, 110, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save-16x16.png"))); // NOI18N
        jButton4.setText("Simpan");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bukuTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bukuTBMouseClicked
        // TODO add your handling code here:
        idTF.setText(bukuTB.getValueAt(bukuTB.getSelectedRow(),0).toString());
        namaTF.setText(bukuTB.getValueAt(bukuTB.getSelectedRow(),1).toString());
        namapengarangTF.setText(bukuTB.getValueAt(bukuTB.getSelectedRow(),2).toString());
        namapenerbitTF.setText(bukuTB.getValueAt(bukuTB.getSelectedRow(),3).toString());
        jumlahhalamanTF.setText(bukuTB.getValueAt(bukuTB.getSelectedRow(),4).toString());
        tahunTF.setText(bukuTB.getValueAt(bukuTB.getSelectedRow(),5).toString());
        jumlahstokTF.setText(bukuTB.getValueAt(bukuTB.getSelectedRow(),6).toString());
        hargaTF.setText(bukuTB.getValueAt(bukuTB.getSelectedRow(),7).toString());
    }//GEN-LAST:event_bukuTBMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        homeAdmin hm=new homeAdmin();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void hapusBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTActionPerformed
        // TODO add your handling code here:
         String id=idTF.getText();
         String nama=namaTF.getText();
         String pengarang=namapengarangTF.getText();
         String penerbit=namapenerbitTF.getText();
         String tahun=tahunTF.getText();
         String harga=hargaTF.getText();
         String halaman=jumlahhalamanTF.getText();
         String stok=jumlahstokTF.getText();
         Connection koneksikan=koneksi.getkoneksikan();
         String cek=null;
        int reply=JOptionPane.showConfirmDialog(
                null,"Anda akan menghapus data ini","Hapus",JOptionPane.YES_NO_OPTION);
        try {
            Statement s=koneksikan.createStatement();
            String sql="SELECT * FROM data_buku WHERE id_buku= '"+id+"'";
                ResultSet r=s.executeQuery(sql);
                while(r.next()){
                    cek=r.getString("id_buku");;
                }
                r.close();
                s.close();
        } catch (Exception e) {
            System.out.println("Maaf terjadi kesalahan");
        }
        if(reply==JOptionPane.YES_OPTION){
           if(cek==null) {
                String daf="Id buku yang anda masukkan tidak terdaftar";
                JOptionPane.showMessageDialog(null, daf,"Pesan kesalahan",JOptionPane.INFORMATION_MESSAGE);
            }
           else{
               try {
                   Statement s=koneksikan.createStatement();
                        System.out.println("Database ditemukan");                   
                        String input="delete from data_buku where id_buku= '"+id+"'";
                        s.executeUpdate(input); 
                        String pesan="Berhasil menghapus buku";
                        JOptionPane.showMessageDialog(null, pesan,"Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                        hapus();
               } catch (SQLException ex) {
                   System.err.println("SQLException: "+ex.getMessage());
               }
           }
        }else{
            kelolaBuku kl=new kelolaBuku();
            kl.setVisible(true);
            hapus();
        }
    }//GEN-LAST:event_hapusBTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        getData();
        hapus();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tambahBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBTActionPerformed
        // TODO add your handling code here:
        String id=idTF.getText();
        String nama=namaTF.getText();
        String pengarang=namapengarangTF.getText();
        String penerbit=namapenerbitTF.getText();
        String tahun=tahunTF.getText();
        String harga=hargaTF.getText();
        String halaman=jumlahhalamanTF.getText();
        String stok=jumlahstokTF.getText();
        Connection koneksikan=koneksi.getkoneksikan();
        String cek=null;
        int reply=JOptionPane.showConfirmDialog(
                null,"Anda akan menambah data ini","Tambah",JOptionPane.YES_NO_OPTION);
        try {
            Statement s=koneksikan.createStatement();
            String sql="SELECT * FROM data_buku WHERE id_buku= '"+id+"'";
                ResultSet r=s.executeQuery(sql);
                while(r.next()){
                    cek=r.getString("id_buku");;
                }
                r.close();
                s.close();
        } catch (Exception e) {
            System.out.println("Maaf terjadi kesalahan");
        }
        if(reply==JOptionPane.YES_OPTION){
        if(cek!=null) {
                String daf="Id buku yang anda masukkan sudah terdaftar";
                JOptionPane.showMessageDialog(null, daf,"Pesan kesalahan",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            try {
                if (idTF.getText().equals("")){
                        JOptionPane.showMessageDialog(rootPane, "Id buku tidak boleh kosong");
                        idTF.requestFocus();
                    }
                    else if (namaTF.getText().equals("")){
                        JOptionPane.showMessageDialog(rootPane, "Nama buku tidak boleh kosong");
                        namaTF.requestFocus();
                     }
                    else if (namapengarangTF.getText().equals("")){
                        JOptionPane.showMessageDialog(rootPane, "Nama pengarang tidak boleh kosong");
                        namapengarangTF.requestFocus();
                     }
                    else if (namapenerbitTF.getText().equals("")){
                            JOptionPane.showMessageDialog(rootPane, "Nama penerbit tidak boleh kosong");
                            namapenerbitTF.requestFocus();
                         }
                    else if (jumlahhalamanTF.getText().equals("")){
                            JOptionPane.showMessageDialog(rootPane, "Jumlah halaman tidak boleh kosong");
                            jumlahhalamanTF.requestFocus();
                         }
                    else if (tahunTF.getText().equals("")){
                            JOptionPane.showMessageDialog(rootPane, "Tahun terbit tidak boleh kosong");
                            tahunTF.requestFocus();
                         }
                    else if (jumlahstokTF.getText().equals("")){
                            JOptionPane.showMessageDialog(rootPane, "Jumlah stok tidak boleh kosong");
                            jumlahstokTF.requestFocus();
                         }
                    else if (hargaTF.getText().equals("")){
                            JOptionPane.showMessageDialog(rootPane, "Harga tidak boleh kosong");
                            hargaTF.requestFocus();
                         }
                    else{
                        Statement s=koneksikan.createStatement();
                        System.out.println("Database ditemukan");                   
                        String input="insert into data_buku values('"+id+"',"+"'"+nama+"',"+"'"+pengarang+"',"+"'"+penerbit+"',"+"'"+halaman+"',"+"'"+tahun+"',"+"'"+stok+"',"+"'"+harga+"')";
                        s.executeUpdate(input); 
                        String pesan="Berhasil menambahkan buku";
                        JOptionPane.showMessageDialog(null, pesan,"Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                        hapus();
                    }
            } catch (SQLException ex) {
                System.err.println("SQLException: "+ex.getMessage());
            }
        }}
        else{
            kelolaBuku kl=new kelolaBuku();
            kl.setVisible(true);
            hapus();
        }
    }//GEN-LAST:event_tambahBTActionPerformed

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
            java.util.logging.Logger.getLogger(kelolaBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kelolaBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kelolaBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kelolaBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kelolaBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bukuTB;
    private javax.swing.JButton hapusBT;
    private javax.swing.JTextField hargaTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jamLB;
    private javax.swing.JTextField jumlahhalamanTF;
    private javax.swing.JTextField jumlahstokTF;
    private javax.swing.JTextField namaTF;
    private javax.swing.JTextField namapenerbitTF;
    private javax.swing.JTextField namapengarangTF;
    private javax.swing.JTextField tahunTF;
    private javax.swing.JButton tambahBT;
    private javax.swing.JLabel tanggalLB;
    // End of variables declaration//GEN-END:variables
}
