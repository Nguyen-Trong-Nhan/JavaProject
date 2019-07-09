
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class CVHT_Xem_Info extends javax.swing.JPanel {

    public static DefaultTableModel model_tb = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return true;
        }
    };
   
    public CVHT_Xem_Info(String MALOPSH) throws SQLException {
        initComponents();
        if (jTable1.getColumnCount() == 0) {
            model_tb.addColumn("MSSV");
            model_tb.addColumn("Họ tên");
            model_tb.addColumn("Ngày sinh");
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
        addRow(MALOPSH);
        
    }

    private void addRow(String MALOPHOC) throws SQLException {

        ResultSet resultSV = main.st.executeQuery("select MSSV, HOTEN, NGAYSINH from SINHVIEN, LOPSH where SINHVIEN.MALOPSH = LOPSH.MALOPSH and SINHVIEN.MALOPSH='"+MALOPHOC+"'");
        while (resultSV.next()) {
            model_tb.addRow(new Object[]{resultSV.getString("MSSV").trim(), resultSV.getString("HOTEN").trim(),resultSV.getString("NGAYSINH")});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(model_tb);

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
