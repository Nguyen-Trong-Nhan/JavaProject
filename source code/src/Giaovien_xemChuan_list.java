
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Giaovien_xemChuan_list extends javax.swing.JPanel {

    public static DefaultTableModel model_tb = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return true;
        }
    };
    public int check = 1;
    public int tb_check = 0; //nếu bấm nút tính trung bình, thì tb_check sẽ bằng 1
    String MALOPHOC = null;

    private void hideG() {
        if (tb_check == 1) {
            jDes.removeAll();
            Dimension size = jDes.getSize();
            float[] listG;
            try {
                listG = Giaovien.trungbinhG(MALOPHOC, check);
                Sv_Monhoc_Xem aa = new Sv_Monhoc_Xem(listG, check);
                aa.setSize(size);
                jDes.add(aa);
                aa.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(Giaovien_xemChuan_list.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
        int row[] = Giaovien_xemChuan_list.jTable1.getSelectedRows();
        jDes.removeAll();
        Dimension size = jDes.getSize();
        diemSinhvien b = null;
        ResultSet timMAMH;
        try {
            timMAMH = main.st.executeQuery("select DISTINCT TENMH from LOPHOC , MONHOC where LOPHOC.MAMH = MONHOC.MAMH and MALOPHOC = '" + MALOPHOC + "'");
            if (timMAMH.next()) {
                System.out.println(model_tb.getValueAt(row[0], 0).toString());
            }
            System.out.println(timMAMH.getString("TENMH"));
            b = new diemSinhvien(model_tb.getValueAt(row[0], 0).toString(), main.converse_tenMon(timMAMH.getString("TENMH")));

        } catch (SQLException ex) {
            Logger.getLogger(Giaovien_xemChuan_list.class.getName()).log(Level.SEVERE, null, ex);
        }
        Sv_Monhoc_Xem a = null;
        if (check == 1) {
            a = new Sv_Monhoc_Xem(b.G_GK, check);
        }
        if (check == 2) {
            a = new Sv_Monhoc_Xem(b.G_CK, check);
        }
        if (check == 3) {
            a = new Sv_Monhoc_Xem(b.G_HP, check);
        }

        a.setSize(size);
        jDes.add(a);
        a.setVisible(true);
    }}

    public Giaovien_xemChuan_list(String MALOPHOC) {

        this.MALOPHOC = MALOPHOC;
        setBackground(new java.awt.Color(0, 51, 51));
        initComponents();
        if (jTable1.getColumnCount() == 0) {
            model_tb.addColumn("MSSV");
            model_tb.addColumn("Họ tên");
        }
        jTable1.getTableHeader().setFont(new Font("UTM Amerika Sans", Font.BOLD, 16)); // cài đặt kiểu chữ title column
        jTable1.getTableHeader().setBackground(Color.orange); // cài đặt màu title column
        // set căn lề center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.setDefaultRenderer(String.class, centerRenderer);
        jTable1.setRowHeight(40);
        while (jTable1.getRowCount() != 0) {
            model_tb.removeRow(0);
        }
        try {
            addRow(MALOPHOC);
        } catch (SQLException ex) {
            System.out.println("a");
        }

    }

    ;
//    diemSinhvien a = new diemSinhvien(resultGV.getString("MSSV").trim(), resultGV.getString("MAMH").trim());

    private void addRow(String MALOPHOC) throws SQLException {

        ResultSet resultSV = main.st.executeQuery("select DISTINCT SINHVIEN.MSSV, HOTEN from DIEM, DETHI, LOPHOC, SINHVIEN where DETHI.MALOPHOC = '" + MALOPHOC + "' and DETHI.MALOPHOC = LOPHOC.MALOPHOC and DETHI.MADETHI = DIEM.MADETHI and SINHVIEN.MSSV = DIEM.MSSV");
        while (resultSV.next()) {
            model_tb.addRow(new Object[]{resultSV.getString("MSSV").trim(), resultSV.getString("HOTEN").trim()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(model_tb);
        jDes = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));

        jTable1.setBackground(new java.awt.Color(255,255,255));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16));
        /*
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        */
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jDes.setBackground(new java.awt.Color(0, 51, 51));
        jDes.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jDes.setEnabled(false);

        javax.swing.GroupLayout jDesLayout = new javax.swing.GroupLayout(jDes);
        jDes.setLayout(jDesLayout);
        jDesLayout.setHorizontalGroup(
            jDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesLayout.setVerticalGroup(
            jDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Giữa kỳ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cuối kỳ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel4.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kết quả");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Chuẩn trung bình");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jDes))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jDes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        tb_check = 0;
        hideG();
        jButton1.setBackground(new java.awt.Color(255, 153, 51));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        check = 1;
        hideG();
        jPanel1.setBackground(new java.awt.Color(255,153,0));
        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setForeground(Color.WHITE);
        jLabel3.setForeground(new java.awt.Color(255,153,0));
        jLabel4.setForeground(new java.awt.Color(255,153,0)); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        check = 2;
        hideG();
        jPanel2.setBackground(new java.awt.Color(255,153,0));
        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setForeground(Color.WHITE);
        jLabel1.setForeground(new java.awt.Color(255,153,0));
        jLabel4.setForeground(new java.awt.Color(255,153,0)); 
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        check = 3;
        hideG();
        jPanel3.setBackground(new java.awt.Color(255,153,0));
        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel4.setForeground(Color.WHITE);
        jLabel3.setForeground(new java.awt.Color(255,153,0));
        jLabel1.setForeground(new java.awt.Color(255,153,0)); 
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Xuất chuẩn G trung bình
        tb_check = 1;
        hideG();
        jButton1.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
