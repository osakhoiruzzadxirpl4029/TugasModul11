/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import pack.controller.controllerToko;
import pack.model.m_toko;

/**
 *
 * @author SUPER USER
 */
public class home extends javax.swing.JFrame {

    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    
    public home() {
        initComponents();
        ctoko = new controllerToko (this);
        ctoko.isiTable();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        harga = new javax.swing.JTextField();
        barang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bungkus = new javax.swing.JComboBox<>();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cari = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bcari = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(harga);
        harga.setBounds(200, 350, 268, 34);

        barang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Barang" }));
        getContentPane().add(barang);
        barang.setBounds(200, 240, 268, 30);

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Jenis Barang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 250, 100, 14);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Jenis Pembungkusan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 300, 140, 14);

        bungkus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Zip", "Carton" }));
        getContentPane().add(bungkus);
        bungkus.setBounds(200, 290, 268, 30);

        simpan.setBackground(new java.awt.Color(255, 255, 255));
        simpan.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan);
        simpan.setBounds(540, 170, 120, 30);

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(540, 210, 120, 30);

        hapus.setBackground(new java.awt.Color(255, 255, 255));
        hapus.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        hapus.setText("Delete");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus);
        hapus.setBounds(540, 250, 120, 30);

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(540, 290, 120, 30);

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(540, 330, 120, 30);

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nama Barang");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 200, 100, 14);
        getContentPane().add(nama);
        nama.setBounds(200, 190, 268, 33);

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Kode Barang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 150, 120, 14);
        getContentPane().add(kode);
        kode.setBounds(200, 140, 268, 34);

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cari");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 570, 29, 14);

        cari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan ", "Minuman", "Barang" }));
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari);
        cari.setBounds(140, 560, 270, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "kode", "nama", "jenis", "bungkus", "harga"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 400, 540, 150);

        bcari.setBackground(new java.awt.Color(255, 255, 255));
        bcari.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        bcari.setText("CARI");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });
        getContentPane().add(bcari);
        bcari.setBounds(450, 560, 110, 30);

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Harga");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(39, 360, 70, 14);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fuck3.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-6, 74, 740, 580);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sasasaq.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 193, 120);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Deux Store");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Find your things, get your pleasure");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(190, 0, 540, 120);

        setSize(new java.awt.Dimension(730, 634));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        ctoko.CariKategori();
        ctoko.isiTable();
    }//GEN-LAST:event_bcariActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        ctoko.Reset();
    }//GEN-LAST:event_clearActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        ctoko.Hapus();
        ctoko.isiTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_editActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }
    public JTextField getTxtKode(){
        return kode;
    }
    public JTextField getTxtNama(){
        return nama;
    }
    public JTextField getTxtHarga(){
        return harga;
    }
    public JComboBox getCbKategori(){
        return barang;
    }
    public JComboBox getCbJenis(){
        return bungkus;
    }
    public JComboBox getCbCariKategori(){
        return cari;
    }
    public JButton getButtonHapus(){
        return hapus;
    }
    
    public JButton getButtonBersih(){
        return clear;
    }
    public JButton getButtonSimpan(){
        return simpan;
    }
    public JButton getButtonUbah(){
        return edit;
    }
    public JButton getButtonKeluar(){
        return exit;
    }
    public JTable getTableData(){
        return table;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> barang;
    private javax.swing.JButton bcari;
    private javax.swing.JComboBox<String> bungkus;
    private javax.swing.JComboBox<String> cari;
    private javax.swing.JButton clear;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nama;
    private javax.swing.JButton simpan;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
