
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Quanly_GV extends javax.swing.JPanel {

    public static DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {
            return true;
        }

    };

    public Quanly_GV() {
        initComponents();
        while (model.getColumnCount() == 0) {
            model.addColumn("MSGV");
            model.addColumn("Tên giảng viên");
            model.addColumn("Lớp hiện tại");
            model.addColumn("Ghi chú");
        }
        jTable1.getTableHeader().setFont(new Font("UTM Amerika Sans", Font.BOLD, 16)); // cài đặt kiểu chữ title column
        jTable1.getTableHeader().setBackground(Color.orange); // cài đặt màu title column
        // set căn lề center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.setDefaultRenderer(String.class, centerRenderer);

        while (jTable1.getRowCount() != 0) {
            model.removeRow(0);
        }
        jTable1.setRowHeight(40);
        addRow(main.MAKHOA);
    }

    private void addRow(String MAKHOA) {
        ResultSet resultGV;
        try {
            resultGV = main.st.executeQuery("  select MAGV, HOTEN from GIAOVIEN where MAKHOA = '" + MAKHOA + "'");
      
            while (resultGV.next()) {
                String MAGV = resultGV.getString("MAGV").trim();
                String sum = "";
                int i = 0;
                while (Giaovien.getDsLop(MAGV)[i]!=null) {
                    sum =   Giaovien.getDsLop(MAGV)[i] + ", " +sum;
                    i++;
                }
                model.addRow(new Object[]{resultGV.getString("MAGV").trim(), resultGV.getString("HOTEN").trim(), sum});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Quanly_GV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(model);

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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
