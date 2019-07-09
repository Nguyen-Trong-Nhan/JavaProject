
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Giaovien extends javax.swing.JFrame {

    public static String[] getDsLop(String MAGV) throws SQLException {
        main.st = main.connection.createStatement();
        ResultSet result;
        result = main.st.executeQuery("select MALOPHOC from LOPHOC where MAGV = '" + MAGV + "'");
        int i = -1;
        String[] a = new String[50];
        while (result.next()) {
            i++;
            a[i] = result.getString("MALOPHOC").trim();
        }
        return a;
    }
    ;
    
    public static float[] trungbinhG(String MALOPHOC, int check) throws SQLException { // Tính trung bình chuẩn G của lớp đó
        float[] KQ = new float[5];
        float countSV = 0;
        diemSinhvien b;
        String MAMH = null;
        ResultSet convMAMH = main.st.executeQuery("select DISTINCT LOPHOC.MAMH from LOPHOC , MONHOC where LOPHOC.MAMH = MONHOC.MAMH and MALOPHOC = '" + MALOPHOC + "'");
        if (convMAMH.next()) {
            MAMH = convMAMH.getString("MAMH").trim();
        }
        ResultSet MSSV = main.st.executeQuery("select DISTINCT SINHVIEN.MSSV from DIEM, DETHI, LOPHOC, SINHVIEN where DETHI.MALOPHOC = '" + MALOPHOC + "' and DETHI.MALOPHOC = LOPHOC.MALOPHOC and DETHI.MADETHI = DIEM.MADETHI and SINHVIEN.MSSV = DIEM.MSSV");
        while (MSSV.next()) {
            b = new diemSinhvien(MSSV.getString("MSSV").trim(), MAMH);
            if(check==3){
            KQ[0] = KQ[0] + b.G_HP[0];
            KQ[1] = KQ[1] + b.G_HP[1];
            KQ[2] = KQ[2] + b.G_HP[2];
            KQ[3] = KQ[3] + b.G_HP[3];
            KQ[4] = KQ[4] + b.G_HP[4];
            }
            if(check==1){
            KQ[0] = KQ[0] + b.G_GK[0];
            KQ[1] = KQ[1] + b.G_GK[1];
            KQ[2] = KQ[2] + b.G_GK[2];
            KQ[3] = KQ[3] + b.G_GK[3];
            KQ[4] = KQ[4] + b.G_GK[4];
            }
            if(check==2){
            KQ[0] = KQ[0] + b.G_CK[0];
            KQ[1] = KQ[1] + b.G_CK[1];
            KQ[2] = KQ[2] + b.G_CK[2];
            KQ[3] = KQ[3] + b.G_CK[3];
            KQ[4] = KQ[4] + b.G_CK[4];
            }
            countSV++;
        }
        KQ[0] = KQ[0] / countSV;
        KQ[1] = KQ[1] / countSV;
        KQ[2] = KQ[2] / countSV;
        KQ[3] = KQ[3] / countSV;
        KQ[4] = KQ[4] / countSV;
        return KQ;
    }
    ;
    
    public static String getLOPSH(String MSSV) throws SQLException {

        ResultSet result;
        result = main.st.executeQuery("  select MALOPSH from SINHVIEN where MSSV ='" + MSSV + "'");
        if (result.next()) {
            return result.getString("MALOPSH");
        }
        return null;
    }
    ;
    public static Dimension size;

    public Giaovien() {
        initComponents();
        this.setTitle("PMĐGCĐR || Giảng viên || "+main.Name);
        ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo.png")));
        Image img1 = img.getImage();
        Image img2 = img1.getScaledInstance(jLabelLogo.getWidth(), jLabelLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logo = new ImageIcon(img2);
            jLabelLogo.setIcon(logo);
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
        jLabelLogo = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btXoadiemMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblLogin1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(327, 327, 327))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(btXoadiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblLogin1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

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
            .addGap(0, 450, Short.MAX_VALUE)
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
        btXemDiem2.setForeground(Color.WHITE);
        btXoadiem.setForeground(Color.WHITE);
    }//GEN-LAST:event_btTaiKhoanMouseClicked

    private void btXemDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXemDiemMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        
        Giaovien_Xemdiem a ;
        
        try {
            a = new Giaovien_Xemdiem();
            a.setSize(jDesktopPane1.getSize());
            jDesktopPane1.add(a);
        } catch (SQLException ex) {
            Logger.getLogger(Sinhvien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        btXemDiem.setForeground(Color.BLACK);
        btMonhoc.setForeground(Color.WHITE);
        btTaiKhoan.setForeground(Color.WHITE);
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
        btXemDiem2.setForeground(Color.WHITE);
        btTaiKhoan.setForeground(Color.WHITE);
    }//GEN-LAST:event_btXoadiemMouseClicked

    private void btXoadiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoadiemMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btXoadiemMouseEntered

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
            java.util.logging.Logger.getLogger(Giaovien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giaovien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giaovien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giaovien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giaovien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label btMonhoc;
    private java.awt.Label btTaiKhoan;
    private java.awt.Label btXemDiem;
    private java.awt.Label btXemDiem2;
    private java.awt.Label btXoadiem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin1;
    // End of variables declaration//GEN-END:variables
}
