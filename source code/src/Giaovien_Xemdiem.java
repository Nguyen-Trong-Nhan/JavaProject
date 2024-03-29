
import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Giaovien_Xemdiem extends javax.swing.JPanel {

    public static Dimension size;
    DefaultListModel model = new DefaultListModel();
    JList list = new JList(model);

    public Giaovien_Xemdiem() throws SQLException {
        initComponents();
        size = jDesktopMon.getSize();
        
        //Thêm danh sách lớp học
        String[] a = Giaovien.getDsLop(main.Maso.toString());
        for (int i = 0; i < a.length; i++) {
            model.add(i, a[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopMon = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMon = new javax.swing.JList(model);
        TENMH = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));

        jDesktopMon.setBackground(new java.awt.Color(0, 51, 51));
        jDesktopMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jDesktopMon.setEnabled(false);

        javax.swing.GroupLayout jDesktopMonLayout = new javax.swing.GroupLayout(jDesktopMon);
        jDesktopMon.setLayout(jDesktopMonLayout);
        jDesktopMonLayout.setHorizontalGroup(
            jDesktopMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jDesktopMonLayout.setVerticalGroup(
            jDesktopMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TENMH, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopMon)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopMon))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(TENMH, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listMonValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMonValueChanged
        listMon.setSelectionBackground(new java.awt.Color(255, 153, 0));
        listMon.setSelectionForeground(Color.WHITE);
        jDesktopMon.removeAll();
        size = jDesktopMon.getSize();
        Giaovien_Xemdiem_list a = null;
        String b = listMon.getSelectedValue().toString();
        try {
            a = new Giaovien_Xemdiem_list(b);
        } catch (SQLException ex) {
            Logger.getLogger(Giaovien_Xemdiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setSize(size);
        jDesktopMon.add(a);
        a.setVisible(true);
                
        try {
            ResultSet timMH = main.st.executeQuery("select DISTINCT TENMH from LOPHOC , MONHOC where LOPHOC.MAMH = MONHOC.MAMH and MALOPHOC = '"+b+"'");
            if(timMH.next())
                TENMH.setText(timMH.getString("TENMH"));
        } catch (SQLException ex) {
            Logger.getLogger(Giaovien_Xemdiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listMonValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TENMH;
    private javax.swing.JDesktopPane jDesktopMon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listMon;
    // End of variables declaration//GEN-END:variables
}
