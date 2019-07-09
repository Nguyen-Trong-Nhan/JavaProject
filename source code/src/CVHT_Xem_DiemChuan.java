
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class CVHT_Xem_DiemChuan extends javax.swing.JPanel {

    public static DefaultTableModel model_diem = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return true;
        }
    };
    String MALOPSH;

    public CVHT_Xem_DiemChuan(String MALOPSH) throws SQLException {
        initComponents();
        this.MALOPSH = MALOPSH;
        if (jTable_diem.getColumnCount() == 0) {
            model_diem.addColumn("MSSV");
            model_diem.addColumn("Họ tên");
            model_diem.addColumn("Điểm trung bình");
        }

        jTable_diem.getTableHeader().setFont(new Font("UTM Amerika Sans", Font.BOLD, 16)); // cài đặt kiểu chữ title column
        jTable_diem.getTableHeader().setBackground(Color.orange); // cài đặt màu title column
        // set căn lề center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable_diem.setDefaultRenderer(String.class, centerRenderer);
        //set kích thước của cột và hàng
        jTable_diem.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable_diem.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable_diem.setRowHeight(40);
        while (jTable_diem.getRowCount() != 0) {
            model_diem.removeRow(0);
        }
        addRow(MALOPSH);
    }

    private void addRow(String MALOPHOC) throws SQLException {

        NumberFormat numf = NumberFormat.getNumberInstance();
    numf.setMaximumFractionDigits(2);
        String a;
        ResultSet resultSV = main.st.executeQuery("select MSSV, HOTEN from SINHVIEN, LOPSH where SINHVIEN.MALOPSH = LOPSH.MALOPSH and SINHVIEN.MALOPSH='" + MALOPHOC + "'");
        while (resultSV.next()) {
            String b = resultSV.getString("MSSV").trim();
            a =  numf.format((main.tb_HP(b)));
            model_diem.addRow(new Object[]{resultSV.getString("MSSV").trim(), resultSV.getString("HOTEN").trim(), a});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_diem = new javax.swing.JTable(model_diem);
        jButton1 = new javax.swing.JButton();
        jDes = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));

        jTable_diem.setBackground(new java.awt.Color(255,255,255));
        jTable_diem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable_diem.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16));
        /*
        jTable_diem.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_diem.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable_diem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_diemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_diem);

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Chuẩn đầu ra trung bình");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDes.setBackground(new java.awt.Color(0, 51, 51));
        jDes.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jDes.setEnabled(false);

        javax.swing.GroupLayout jDesLayout = new javax.swing.GroupLayout(jDes);
        jDes.setLayout(jDesLayout);
        jDesLayout.setHorizontalGroup(
            jDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jDesLayout.setVerticalGroup(
            jDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("SV - Môn học");
        jButton2.setToolTipText("");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDes))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jDes)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDes.removeAll();
        Dimension size = jDes.getSize();
        float[] listG;
        try {
            listG = CVHT.trungbinhL(MALOPSH);
            Sinhvien_chuanL_2 aa = new Sinhvien_chuanL_2(listG);
            aa.setSize(size);
            jDes.add(aa);
            aa.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CVHT_Xem_DiemChuan.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton1.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable_diemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_diemMouseClicked
        // TODO add your handling code here:
        int row[] = jTable_diem.getSelectedRows();

        try {
            chuanL_Sinhvien a = new chuanL_Sinhvien(model_diem.getValueAt(row[0], 0).toString());
            Sinhvien_chuanL_2 b = new Sinhvien_chuanL_2(a.L);
            b.setSize(jDes.getSize());
            jDes.add(b);
            b.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CVHT_Xem_DiemChuan.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jTable_diemMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row[] = jTable_diem.getSelectedRows();
            new CVHT_Xem_G(model_diem.getValueAt(row[0], 0).toString(), model_diem.getValueAt(row[0], 1).toString()).setVisible(true);
            
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDes;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_diem;
    // End of variables declaration//GEN-END:variables
}
