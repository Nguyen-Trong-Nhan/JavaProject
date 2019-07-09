
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


public class Quanly_Lophoc extends javax.swing.JPanel {

    DefaultListModel model = new DefaultListModel();
    public Quanly_Lophoc(String MAKHOA) throws SQLException {
        initComponents();
        int i=0;
        ResultSet rs = main.st.executeQuery("select * from LOPHOC, MONHOC where LOPHOC.MAMH = MONHOC.MAMH and MAKHOA = '"+main.MAKHOA+"'");
        while(rs.next()){
            model.add(i, rs.getString("MALOPHOC").trim());
            i++;
        }
    }   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TENMH = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMon = new javax.swing.JList(model);
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDes = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(0, 51, 51));

        TENMH.setFont(new java.awt.Font("UTM Amerika Sans", 1, 24)); // NOI18N
        TENMH.setForeground(new java.awt.Color(255, 255, 51));
        TENMH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TENMH.setText("Chọn lớp học.....");
        TENMH.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Danh sách mã lớp học:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        listMon.setBackground(new java.awt.Color(0, 51, 51));
        listMon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        listMon.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        listMon.setForeground(new java.awt.Color(255, 255, 51));
        listMon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listMon.setValueIsAdjusting(true);
        listMon.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listMonValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listMon);

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Điểm chi tiết");
        jButton2.setToolTipText("");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Chuẩn đầu ra môn học");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setEnabled(false);
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
            .addGap(0, 501, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TENMH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TENMH, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDes)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listMonValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMonValueChanged
        listMon.setSelectionBackground(new java.awt.Color(255, 153, 0));
        listMon.setSelectionForeground(Color.WHITE);
        try{
            ResultSet timMH = main.st.executeQuery("select DISTINCT TENMH from LOPHOC , MONHOC where LOPHOC.MAMH = MONHOC.MAMH and MALOPHOC = '"+listMon.getSelectedValue().toString()+"'");
            if(timMH.next())
            TENMH.setText(timMH.getString("TENMH"));
        } catch (SQLException ex) {
            Logger.getLogger(Giaovien_Xemdiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
    }//GEN-LAST:event_listMonValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jDes.removeAll();
        Giaovien_Xemdiem_list a ;
        String b = listMon.getSelectedValue().toString();
        try {
            a = new Giaovien_Xemdiem_list(b);
            a.setSize(jDes.getSize());
            jDes.add(a);
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Quanly_Lophoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDes.removeAll();
        Giaovien_xemChuan_list a = new Giaovien_xemChuan_list(listMon.getSelectedValue().toString().trim());
        a.setSize(jDes.getSize());
        jDes.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TENMH;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listMon;
    // End of variables declaration//GEN-END:variables
}
