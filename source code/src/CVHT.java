
import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class CVHT extends javax.swing.JFrame {

    public static Dimension size;

    public static float[] trungbinhL(String MALOPSH) throws SQLException { // Tính trung bình chuẩn L của lớp đó
        float[] KQ = new float[14];
        float countSV = 0;
        ResultSet resultSV = main.st.executeQuery("select MSSV from SINHVIEN, LOPSH where SINHVIEN.MALOPSH = LOPSH.MALOPSH and SINHVIEN.MALOPSH='" + MALOPSH + "'");
        while (resultSV.next()) {
            chuanL_Sinhvien a = new chuanL_Sinhvien(resultSV.getString("MSSV").trim());
            for (int i = 0; i <= 12; i++) {
                KQ[i] = KQ[i] + a.L[i];
            }
            countSV++;
        }
        for (int i = 0; i <= 12; i++) {
            KQ[i] = KQ[i] / countSV;
        }
        return KQ;
        
    }

    ;
    public CVHT() {
        initComponents();
        this.setTitle("PMĐGCĐR || CVHT - Giảng viên || "+main.Name);
        this.setIconImage(new ImageIcon("/images/logo.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btTaiKhoan = new java.awt.Label();
        btXemDiem = new java.awt.Label();
        lblLogin1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btMonhoc = new java.awt.Label();
        btXemDiem2 = new java.awt.Label();
        btXoadiem = new java.awt.Label();
        btXemDiem1 = new java.awt.Label();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        btTaiKhoan.setAlignment(java.awt.Label.CENTER);
        btTaiKhoan.setBackground(new java.awt.Color(255, 153, 0));
        btTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btTaiKhoan.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        btTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        btTaiKhoan.setText("Thông tin tài khoản");
        btTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTaiKhoanMouseClicked(evt);
            }
        });

        btXemDiem.setAlignment(java.awt.Label.CENTER);
        btXemDiem.setBackground(new java.awt.Color(255, 153, 0));
        btXemDiem.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        btXemDiem.setForeground(new java.awt.Color(255, 255, 255));
        btXemDiem.setText("Xem điểm");
        btXemDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXemDiemMouseClicked(evt);
            }
        });

        lblLogin1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogin1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Trung Kien\\Documents\\NetBeansProjects\\DO_AN_MON\\picture\\logo2.png")); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("UTM Amerika Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Trường Đại học Công nghệ Thông tin, ĐHQG-HCM");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("UTM Amerika Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("PHẦN MỀM ĐÁNH GIÁ CHUẨN ĐẦU RA SINH VIÊN");

        btMonhoc.setAlignment(java.awt.Label.CENTER);
        btMonhoc.setBackground(new java.awt.Color(255, 153, 0));
        btMonhoc.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        btMonhoc.setForeground(new java.awt.Color(255, 255, 255));
        btMonhoc.setText("Nhập điểm");
        btMonhoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMonhocMouseClicked(evt);
            }
        });

        btXemDiem2.setAlignment(java.awt.Label.CENTER);
        btXemDiem2.setBackground(new java.awt.Color(255, 153, 0));
        btXemDiem2.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        btXemDiem2.setForeground(new java.awt.Color(255, 255, 255));
        btXemDiem2.setText("Chuẩn đầu ra");
        btXemDiem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXemDiem2MouseClicked(evt);
            }
        });

        btXoadiem.setAlignment(java.awt.Label.CENTER);
        btXoadiem.setBackground(new java.awt.Color(255, 153, 0));
        btXoadiem.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        btXoadiem.setForeground(new java.awt.Color(255, 255, 255));
        btXoadiem.setText("Tìm kiếm SV");
        btXoadiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXoadiemMouseClicked(evt);
            }
        });

        btXemDiem1.setAlignment(java.awt.Label.CENTER);
        btXemDiem1.setBackground(new java.awt.Color(255, 153, 0));
        btXemDiem1.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        btXemDiem1.setForeground(new java.awt.Color(255, 255, 255));
        btXemDiem1.setText("CVHT");
        btXemDiem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXemDiem1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblLogin1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE))
                        .addGap(327, 327, 327))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btXemDiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btXemDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btXoadiem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btXemDiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btXemDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btXemDiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btXoadiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btXemDiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblLogin1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btXoadiem.getAccessibleContext().setAccessibleName("Tìm kiếm SV");

        jDesktopPane1.setBackground(new java.awt.Color(0, 51, 51));
        jDesktopPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jDesktopPane1.setEnabled(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTaiKhoanMouseClicked
        jDesktopPane1.removeAll();
        TaiKhoan pnTaiKhoan = new TaiKhoan();
        pnTaiKhoan.setVisible(true);
        pnTaiKhoan.setSize(jDesktopPane1.getSize());
        jDesktopPane1.add(pnTaiKhoan);
        
        btTaiKhoan.setForeground(Color.BLACK);
        btMonhoc.setForeground(Color.WHITE);
        btXemDiem.setForeground(Color.WHITE);
        btXemDiem1.setForeground(Color.WHITE);
        btXemDiem2.setForeground(Color.WHITE);
        btXoadiem.setForeground(Color.WHITE);
    }//GEN-LAST:event_btTaiKhoanMouseClicked

    private void btXemDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXemDiemMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        size = jDesktopPane1.getSize();
        Giaovien_Xemdiem a = null;

        try {
            a = new Giaovien_Xemdiem();
        } catch (SQLException ex) {
            Logger.getLogger(CVHT.class.getName()).log(Level.SEVERE, null, ex);
        }

        a.setSize(size);
        jDesktopPane1.add(a);
        
        btXemDiem.setForeground(Color.BLACK);
        btMonhoc.setForeground(Color.WHITE);
        btTaiKhoan.setForeground(Color.WHITE);
        btXemDiem1.setForeground(Color.WHITE);
        btXemDiem2.setForeground(Color.WHITE);
        btXoadiem.setForeground(Color.WHITE);
    }//GEN-LAST:event_btXemDiemMouseClicked

    private void btMonhocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMonhocMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        size = jDesktopPane1.getSize();
        Giaovien_nhapdiem a = null;
        a = new Giaovien_nhapdiem();
        a.setSize(size);
        jDesktopPane1.add(a);
        
        btMonhoc.setForeground(Color.BLACK);
        btTaiKhoan.setForeground(Color.WHITE);
        btXemDiem.setForeground(Color.WHITE);
        btXemDiem1.setForeground(Color.WHITE);
        btXemDiem2.setForeground(Color.WHITE);
        btXoadiem.setForeground(Color.WHITE);
    }//GEN-LAST:event_btMonhocMouseClicked

    private void btXemDiem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXemDiem2MouseClicked
        try {
            // TODO add your handling code here:
            jDesktopPane1.removeAll();
            size = jDesktopPane1.getSize();
            Giaovien_xemChuan a = null;
            a = new Giaovien_xemChuan();
            a.setSize(size);
            jDesktopPane1.add(a);
        } catch (SQLException ex) {
            Logger.getLogger(Giaovien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        btXemDiem2.setForeground(Color.BLACK);
        btMonhoc.setForeground(Color.WHITE);
        btXemDiem.setForeground(Color.WHITE);
        btXemDiem1.setForeground(Color.WHITE);
        btTaiKhoan.setForeground(Color.WHITE);
        btXoadiem.setForeground(Color.WHITE);
    }//GEN-LAST:event_btXemDiem2MouseClicked

    private void btXoadiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoadiemMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        size = jDesktopPane1.getSize();
        Giaovien_Xoa_Sua a = null;
        try {
            a = new Giaovien_Xoa_Sua();
        } catch (SQLException ex) {
            Logger.getLogger(Giaovien.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setSize(size);
        jDesktopPane1.add(a);
        
        btXoadiem.setForeground(Color.BLACK);
        btMonhoc.setForeground(Color.WHITE);
        btXemDiem.setForeground(Color.WHITE);
        btXemDiem1.setForeground(Color.WHITE);
        btXemDiem2.setForeground(Color.WHITE);
        btTaiKhoan.setForeground(Color.WHITE);
    }//GEN-LAST:event_btXoadiemMouseClicked

    private void btXemDiem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXemDiem1MouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        size = jDesktopPane1.getSize();
        CVHT_Xem a;
        try {
            a = new CVHT_Xem(main.Maso);
            a.setSize(size);
            jDesktopPane1.add(a);
        } catch (SQLException ex) {
            Logger.getLogger(CVHT.class.getName()).log(Level.SEVERE, null, ex);
        }

        btXemDiem1.setForeground(Color.BLACK);
        btMonhoc.setForeground(Color.WHITE);
        btXemDiem.setForeground(Color.WHITE);
        btTaiKhoan.setForeground(Color.WHITE);
        btXemDiem2.setForeground(Color.WHITE);
        btXoadiem.setForeground(Color.WHITE);
    }//GEN-LAST:event_btXemDiem1MouseClicked

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
            java.util.logging.Logger.getLogger(CVHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CVHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CVHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CVHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CVHT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label btMonhoc;
    private java.awt.Label btTaiKhoan;
    private java.awt.Label btXemDiem;
    private java.awt.Label btXemDiem1;
    private java.awt.Label btXemDiem2;
    private java.awt.Label btXoadiem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin1;
    // End of variables declaration//GEN-END:variables
}
