
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Giaovien_Xemdiem_list extends javax.swing.JPanel {
    
    public static DefaultTableModel model = new DefaultTableModel() {
        
        @Override
        public boolean isCellEditable(int row, int column) {
            return true;
        }
        
    };
    
    public Giaovien_Xemdiem_list(String MALOPHOC) throws SQLException {
//        this.setVisible(true);
//        this.setSize(Giaovien_Xemdiem.size);
        initComponents();
        while (Giaovien_Xemdiem_list.model.getColumnCount() == 0) {
            Giaovien_Xemdiem_list.model.addColumn("MSSV");
            Giaovien_Xemdiem_list.model.addColumn("Tên sinh viên");
            Giaovien_Xemdiem_list.model.addColumn("Điểm QT");
            Giaovien_Xemdiem_list.model.addColumn("Điểm GK");
            Giaovien_Xemdiem_list.model.addColumn("Điểm CK");
            Giaovien_Xemdiem_list.model.addColumn("Điểm HP");
            Giaovien_Xemdiem_list.model.addColumn("Ghi chú");
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
        //set kích thước của cột và hàng
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.setRowHeight(40);
        addRow(MALOPHOC);
    }

    private void addRow(String MALOPHOC) throws SQLException {
        ResultSet resultGV = main.st.executeQuery(" select DISTINCT MSSV, MAMH from DIEM, DETHI, LOPHOC where DETHI.MALOPHOC = '"+MALOPHOC+"' and DETHI.MALOPHOC = LOPHOC.MALOPHOC and DETHI.MADETHI = DIEM.MADETHI ");
        while (resultGV.next()) {
            diemSinhvien a = new diemSinhvien(resultGV.getString("MSSV").trim(), resultGV.getString("MAMH").trim());
            model.addRow(new Object[]{a.MSSV, a.HOTEN, a.QT, a.GK, a.CK, a.HP, ""});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(model);

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
