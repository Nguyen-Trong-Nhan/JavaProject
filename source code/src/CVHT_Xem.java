
import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class CVHT_Xem extends javax.swing.JPanel {

    public static Dimension size;
    public static String MALOPSH = null;
    DefaultListModel model_list = new DefaultListModel();

    public CVHT_Xem(String MAGV) throws SQLException {
        initComponents();
        add_list(MAGV);
    }

    private void add_list(String MAGV) throws SQLException {
        ResultSet rs = main.st.executeQuery("select * from LOPSH where MAGV = '" + MAGV + "'");
        int i = 0;
        while (rs.next()) {
            model_list.add(i, rs.getString("MALOPSH"));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TENLOP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList(model_list);
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jDes = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(0, 51, 51));

        TENLOP.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        TENLOP.setForeground(new java.awt.Color(255, 255, 51));
        TENLOP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TENLOP.setText("Chọn lớp sinh hoạt.....");
        TENLOP.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Danh sách mã lớp sinh hoạt:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jList.setBackground(new java.awt.Color(0, 51, 51));
        jList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        jList.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        jList.setForeground(new java.awt.Color(255, 255, 51));
        jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList.setValueIsAdjusting(true);
        jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList);

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
        jLabel1.setText("Thông tin Sinh viên");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel3.setText("Xem điểm Sinh viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TENLOP, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDes)
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TENLOP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 295, Short.MAX_VALUE))
                    .addComponent(jDes))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListValueChanged
        jList.setSelectionBackground(Color.ORANGE);
        jList.setSelectionForeground(Color.WHITE);
        jDes.removeAll();
        size = jDes.getSize();
        CVHT_Xem_Info a = null;
        MALOPSH = jList.getSelectedValue().toString();
        try {
            a = new CVHT_Xem_Info(MALOPSH);
            a.setSize(size);
            jDes.add(a);
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CVHT_Xem.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet timLOP;
        try {
            timLOP = main.st.executeQuery("select TENLOP from LOPSH where MALOPSH = '" + MALOPSH + "'");
            if (timLOP.next()) {
                TENLOP.setText(timLOP.getString("TENLOP").trim());
            }
        } catch (SQLException ex) {
            Logger.getLogger(CVHT_Xem.class.getName()).log(Level.SEVERE, null, ex);
        }

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setForeground(Color.WHITE);
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));


    }//GEN-LAST:event_jListValueChanged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jDes.removeAll();
        size = jDes.getSize();
        CVHT_Xem_Info a = null;
        String b = jList.getSelectedValue().toString();
        try {
            a = new CVHT_Xem_Info(b);
            a.setSize(size);
            jDes.add(a);
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CVHT_Xem.class.getName()).log(Level.SEVERE, null, ex);
        }

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setForeground(Color.WHITE);
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        jDes.removeAll();
        size = jDes.getSize();
        CVHT_Xem_DiemChuan a = null;
        String b = jList.getSelectedValue().toString();
        try {
            a = new CVHT_Xem_DiemChuan(MALOPSH);
            a.setSize(size);
            jDes.add(a);
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CVHT_Xem.class.getName()).log(Level.SEVERE, null, ex);
        }
        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setForeground(Color.WHITE);
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
    }//GEN-LAST:event_jPanel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TENLOP;
    private javax.swing.JDesktopPane jDes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
