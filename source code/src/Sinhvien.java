
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;


public class Sinhvien extends javax.swing.JFrame {

    public static Dimension size;
    
    public static String[] getDsLop(String MSSV) throws SQLException {
        main.st = main.connection.createStatement();
        ResultSet result;
        result = main.st.executeQuery("select DISTINCT d.MAMH, d.TENMH from DETHI a, DIEM b, LOPHOC c, MONHOC d, SINHVIEN f where	d.MAMH=c.MAMH and c.MALOPHOC=a.MALOPHOC and a.MADETHI=b.MADETHI and b.MSSV='" + MSSV + "'  and f.MSSV=b.MSSV");
        int i = -1;
        String[] a = new String[50];
        while (result.next()) {
            i++;
            a[i] = result.getString("MAMH").trim();
        }
        return a;
    };
    
    public Sinhvien() {
        initComponents();
        ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo.png")));
        Image img1 = img.getImage();
        Image img2 = img1.getScaledInstance(jLabelLogo.getWidth(), jLabelLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logo = new ImageIcon(img2);
            jLabelLogo.setIcon(logo);
        Sinhvien_Xemdiem.jTable1 = new JTable(Sinhvien_Xemdiem.model);
        Sinhvien_Xemdiem.model.addColumn("Mã môn học");
        Sinhvien_Xemdiem.model.addColumn("Tên môn học");
        Sinhvien_Xemdiem.model.addColumn("Điểm QT");
        Sinhvien_Xemdiem.model.addColumn("Điểm GK");
        Sinhvien_Xemdiem.model.addColumn("Điểm CK");
        Sinhvien_Xemdiem.model.addColumn("Điểm HP");
        Sinhvien_Xemdiem.model.addColumn("Ghi chú");
        this.setTitle("PMĐGCĐR || Sinh viên || "+main.Name);
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
        jLabelLogo = new javax.swing.JLabel();
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
        btMonhoc.setText("Môn học");
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
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(btXemDiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        btXemDiem2.setForeground(Color.WHITE);
    }//GEN-LAST:event_btTaiKhoanMouseClicked

    private void btXemDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXemDiemMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        size = jDesktopPane1.getSize();
        try {
            jDesktopPane1.add(new Sinhvien_Xemdiem());
        } catch (SQLException ex) {
            Logger.getLogger(Sinhvien.class.getName()).log(Level.SEVERE, null, ex);
        }
        btXemDiem.setForeground(Color.BLACK);
        btMonhoc.setForeground(Color.WHITE);
        btTaiKhoan.setForeground(Color.WHITE);
        btXemDiem2.setForeground(Color.WHITE);
    }//GEN-LAST:event_btXemDiemMouseClicked

    private void btMonhocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMonhocMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        size = jDesktopPane1.getSize();
        Sinhvien_Mon a ;
        try {
            a = new Sinhvien_Mon(main.Maso);
            a.setSize(size);
        jDesktopPane1.add(a);
        } catch (SQLException ex) {
            Logger.getLogger(Sinhvien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        btMonhoc.setForeground(Color.BLACK);
        btTaiKhoan.setForeground(Color.WHITE);
        btXemDiem.setForeground(Color.WHITE);
        btXemDiem2.setForeground(Color.WHITE);
    }//GEN-LAST:event_btMonhocMouseClicked

    private void btXemDiem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXemDiem2MouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        size = jDesktopPane1.getSize();
        Sinhvien_chuanL a;
        try {
            a = new Sinhvien_chuanL();
            a.setSize(size);
        jDesktopPane1.add(a);
        } catch (SQLException ex) {
            Logger.getLogger(Sinhvien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        btXemDiem2.setForeground(Color.BLACK);
        btMonhoc.setForeground(Color.WHITE);
        btXemDiem.setForeground(Color.WHITE);
        btTaiKhoan.setForeground(Color.WHITE);
    }//GEN-LAST:event_btXemDiem2MouseClicked


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
            java.util.logging.Logger.getLogger(Sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sinhvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label btMonhoc;
    private java.awt.Label btTaiKhoan;
    private java.awt.Label btXemDiem;
    private java.awt.Label btXemDiem2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin1;
    // End of variables declaration//GEN-END:variables
}
