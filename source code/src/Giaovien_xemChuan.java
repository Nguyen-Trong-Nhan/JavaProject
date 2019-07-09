
import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;


public class Giaovien_xemChuan extends javax.swing.JPanel {

    public static Dimension size;
    public static String MALOPHOC = null;
    DefaultListModel model_list = new DefaultListModel();
    JList list = new JList(model_list);

    
    
    public Giaovien_xemChuan() throws SQLException {
        initComponents();
        String[] a = Giaovien.getDsLop(main.Maso);
        for (int i = 0; null != a[i]; i++) {
            model_list.add(i, a[i]);
        }      

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        TENMH = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMon = new javax.swing.JList(model_list);
        jDesktopMon = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("UTM Amerika Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Danh sách mã môn học:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        TENMH.setFont(new java.awt.Font("UTM Amerika Sans", 1, 24)); // NOI18N
        TENMH.setForeground(new java.awt.Color(255, 255, 51));
        TENMH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TENMH.setText("Chọn mã môn học...");
        TENMH.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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

        jDesktopMon.setBackground(new java.awt.Color(0, 51, 51));
        jDesktopMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jDesktopMon.setEnabled(false);

        javax.swing.GroupLayout jDesktopMonLayout = new javax.swing.GroupLayout(jDesktopMon);
        jDesktopMon.setLayout(jDesktopMonLayout);
        jDesktopMonLayout.setHorizontalGroup(
            jDesktopMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopMonLayout.setVerticalGroup(
            jDesktopMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TENMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 742, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 703, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(703, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jDesktopMon))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(TENMH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopMon)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listMonValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMonValueChanged
        listMon.setSelectionBackground(Color.getHSBColor((float) 0.0882353, 1, 1));
        listMon.setSelectionForeground(Color.darkGray);
        jDesktopMon.removeAll();
        MALOPHOC = listMon.getSelectedValue().toString().trim();
        Giaovien_xemChuan_list a = new Giaovien_xemChuan_list(MALOPHOC);
        a.setSize(jDesktopMon.getSize());
        jDesktopMon.add(a);
        a.setVisible(true);
        
        ResultSet timMH;
        try {
            timMH = main.st.executeQuery("select DISTINCT TENMH from LOPHOC , MONHOC where LOPHOC.MAMH = MONHOC.MAMH and MALOPHOC = '" + MALOPHOC + "'");
            if (timMH.next()) {
                TENMH.setText(timMH.getString("TENMH"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Giaovien_xemChuan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_listMonValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TENMH;
    private javax.swing.JDesktopPane jDesktopMon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList listMon;
    // End of variables declaration//GEN-END:variables
}
