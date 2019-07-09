
import java.sql.SQLException;


public class Sinhvien_chuanL_2 extends javax.swing.JPanel {


    public Sinhvien_chuanL_2(float[] L) throws SQLException {
        initComponents();
        chuanL_Sinhvien a =new chuanL_Sinhvien(main.Maso);
        slL1.setValue((int)((float) Math.ceil(L[0])));
        soL1.setText( Float.toString((float) Math.ceil(L[0])) +"%");
        
        slL2.setValue((int)((float) Math.ceil(L[1])));
        soL2.setText( Float.toString((float) Math.ceil(L[1])) +"%");
        
        slL3.setValue((int)((float) Math.ceil(L[2])));
        soL3.setText( Float.toString((float) Math.ceil(L[2])) +"%");
        
        slL4.setValue((int)((float) Math.ceil(L[3])));
        soL4.setText( Float.toString((float) Math.ceil(L[3])) +"%");
        
        slL5.setValue((int)((float) Math.ceil(L[4])));
        soL5.setText( Float.toString((float) Math.ceil(L[4])) +"%");
        
        slL6.setValue((int)((float) Math.ceil(L[5])));
        soL6.setText( Float.toString((float) Math.ceil(L[5])) +"%");
        
        slL7.setValue((int)((float) Math.ceil(L[6])));
        soL7.setText( Float.toString((float) Math.ceil(L[6])) +"%");
        
        slL8.setValue((int)((float) Math.ceil(L[7])));
        soL8.setText( Float.toString((float) Math.ceil(L[7])) +"%");
        
        slL9.setValue((int)((float) Math.ceil(L[8])));
        soL9.setText( Float.toString((float) Math.ceil(L[8])) +"%");
        
        slL10.setValue((int)((float) Math.ceil(L[9])));
        soL10.setText( Float.toString((float) Math.ceil(L[9])) +"%");
        
        slL11.setValue((int)((float) Math.ceil(L[10])));
        soL11.setText( Float.toString((float) Math.ceil(L[10])) +"%");
        
        slL12.setValue((int)((float) Math.ceil(L[11])));
        soL12.setText( Float.toString((float) Math.ceil(L[11])) +"%");
        
        slL13.setValue((int)((float) Math.ceil(L[12])));
        soL13.setText( Float.toString((float) Math.ceil(L[12])) +"%");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnG1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        slL1 = new javax.swing.JSlider();
        soL1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        pnG2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        slL2 = new javax.swing.JSlider();
        soL2 = new javax.swing.JLabel();
        pnG3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        slL3 = new javax.swing.JSlider();
        soL3 = new javax.swing.JLabel();
        pnG4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        slL4 = new javax.swing.JSlider();
        soL4 = new javax.swing.JLabel();
        pnG5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        slL5 = new javax.swing.JSlider();
        soL5 = new javax.swing.JLabel();
        pnG6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        slL6 = new javax.swing.JSlider();
        soL6 = new javax.swing.JLabel();
        pnG7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        slL7 = new javax.swing.JSlider();
        soL7 = new javax.swing.JLabel();
        pnG8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        slL8 = new javax.swing.JSlider();
        soL8 = new javax.swing.JLabel();
        pnG9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        slL9 = new javax.swing.JSlider();
        soL9 = new javax.swing.JLabel();
        pnG10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        slL10 = new javax.swing.JSlider();
        soL10 = new javax.swing.JLabel();
        pnG11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        slL11 = new javax.swing.JSlider();
        soL11 = new javax.swing.JLabel();
        pnG12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        slL12 = new javax.swing.JSlider();
        soL12 = new javax.swing.JLabel();
        pnG13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        slL13 = new javax.swing.JSlider();
        soL13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));

        pnG1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Chuẩn LO1");

        slL1.setBackground(new java.awt.Color(0, 51, 51));
        slL1.setForeground(new java.awt.Color(255, 51, 51));
        slL1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL1.setEnabled(false);

        soL1.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL1.setForeground(new java.awt.Color(255, 255, 0));
        soL1.setText("50%");

        javax.swing.GroupLayout pnG1Layout = new javax.swing.GroupLayout(pnG1);
        pnG1.setLayout(pnG1Layout);
        pnG1Layout.setHorizontalGroup(
            pnG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG1Layout.setVerticalGroup(
            pnG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG1Layout.createSequentialGroup()
                .addGroup(pnG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        title.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 0));
        title.setText("Chuẩn đầu ra tốt nghiệp hiện tại của sinh viên ");

        pnG2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Chuẩn LO2");

        slL2.setBackground(new java.awt.Color(0, 51, 51));
        slL2.setForeground(new java.awt.Color(255, 51, 51));
        slL2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL2.setEnabled(false);

        soL2.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL2.setForeground(new java.awt.Color(255, 255, 0));
        soL2.setText("50%");

        javax.swing.GroupLayout pnG2Layout = new javax.swing.GroupLayout(pnG2);
        pnG2.setLayout(pnG2Layout);
        pnG2Layout.setHorizontalGroup(
            pnG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG2Layout.setVerticalGroup(
            pnG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG2Layout.createSequentialGroup()
                .addGroup(pnG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel3.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Chuẩn LO3");

        slL3.setBackground(new java.awt.Color(0, 51, 51));
        slL3.setForeground(new java.awt.Color(255, 51, 51));
        slL3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL3.setEnabled(false);

        soL3.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL3.setForeground(new java.awt.Color(255, 255, 0));
        soL3.setText("50%");

        javax.swing.GroupLayout pnG3Layout = new javax.swing.GroupLayout(pnG3);
        pnG3.setLayout(pnG3Layout);
        pnG3Layout.setHorizontalGroup(
            pnG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG3Layout.setVerticalGroup(
            pnG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG3Layout.createSequentialGroup()
                .addGroup(pnG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG4.setBackground(new java.awt.Color(0, 51, 51));

        jLabel4.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Chuẩn LO4");

        slL4.setBackground(new java.awt.Color(0, 51, 51));
        slL4.setForeground(new java.awt.Color(255, 51, 51));
        slL4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL4.setEnabled(false);

        soL4.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL4.setForeground(new java.awt.Color(255, 255, 0));
        soL4.setText("50%");

        javax.swing.GroupLayout pnG4Layout = new javax.swing.GroupLayout(pnG4);
        pnG4.setLayout(pnG4Layout);
        pnG4Layout.setHorizontalGroup(
            pnG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG4Layout.setVerticalGroup(
            pnG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG4Layout.createSequentialGroup()
                .addGroup(pnG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG5.setBackground(new java.awt.Color(0, 51, 51));

        jLabel5.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Chuẩn LO5");

        slL5.setBackground(new java.awt.Color(0, 51, 51));
        slL5.setForeground(new java.awt.Color(255, 51, 51));
        slL5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL5.setEnabled(false);

        soL5.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL5.setForeground(new java.awt.Color(255, 255, 0));
        soL5.setText("50%");

        javax.swing.GroupLayout pnG5Layout = new javax.swing.GroupLayout(pnG5);
        pnG5.setLayout(pnG5Layout);
        pnG5Layout.setHorizontalGroup(
            pnG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG5Layout.setVerticalGroup(
            pnG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG5Layout.createSequentialGroup()
                .addGroup(pnG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG6.setBackground(new java.awt.Color(0, 51, 51));

        jLabel6.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Chuẩn LO6");

        slL6.setBackground(new java.awt.Color(0, 51, 51));
        slL6.setForeground(new java.awt.Color(255, 51, 51));
        slL6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL6.setEnabled(false);

        soL6.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL6.setForeground(new java.awt.Color(255, 255, 0));
        soL6.setText("50%");

        javax.swing.GroupLayout pnG6Layout = new javax.swing.GroupLayout(pnG6);
        pnG6.setLayout(pnG6Layout);
        pnG6Layout.setHorizontalGroup(
            pnG6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG6Layout.setVerticalGroup(
            pnG6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG6Layout.createSequentialGroup()
                .addGroup(pnG6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG7.setBackground(new java.awt.Color(0, 51, 51));

        jLabel7.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Chuẩn LO7");

        slL7.setBackground(new java.awt.Color(0, 51, 51));
        slL7.setForeground(new java.awt.Color(255, 51, 51));
        slL7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL7.setEnabled(false);

        soL7.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL7.setForeground(new java.awt.Color(255, 255, 0));
        soL7.setText("50%");

        javax.swing.GroupLayout pnG7Layout = new javax.swing.GroupLayout(pnG7);
        pnG7.setLayout(pnG7Layout);
        pnG7Layout.setHorizontalGroup(
            pnG7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG7Layout.setVerticalGroup(
            pnG7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG7Layout.createSequentialGroup()
                .addGroup(pnG7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG8.setBackground(new java.awt.Color(0, 51, 51));

        jLabel8.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Chuẩn LO8");

        slL8.setBackground(new java.awt.Color(0, 51, 51));
        slL8.setForeground(new java.awt.Color(255, 51, 51));
        slL8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL8.setEnabled(false);

        soL8.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL8.setForeground(new java.awt.Color(255, 255, 0));
        soL8.setText("50%");

        javax.swing.GroupLayout pnG8Layout = new javax.swing.GroupLayout(pnG8);
        pnG8.setLayout(pnG8Layout);
        pnG8Layout.setHorizontalGroup(
            pnG8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG8Layout.setVerticalGroup(
            pnG8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG8Layout.createSequentialGroup()
                .addGroup(pnG8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG9.setBackground(new java.awt.Color(0, 51, 51));

        jLabel9.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Chuẩn LO9");

        slL9.setBackground(new java.awt.Color(0, 51, 51));
        slL9.setForeground(new java.awt.Color(255, 51, 51));
        slL9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL9.setEnabled(false);

        soL9.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL9.setForeground(new java.awt.Color(255, 255, 0));
        soL9.setText("50%");

        javax.swing.GroupLayout pnG9Layout = new javax.swing.GroupLayout(pnG9);
        pnG9.setLayout(pnG9Layout);
        pnG9Layout.setHorizontalGroup(
            pnG9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG9Layout.setVerticalGroup(
            pnG9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG9Layout.createSequentialGroup()
                .addGroup(pnG9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG10.setBackground(new java.awt.Color(0, 51, 51));

        jLabel10.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Chuẩn LO10");

        slL10.setBackground(new java.awt.Color(0, 51, 51));
        slL10.setForeground(new java.awt.Color(255, 51, 51));
        slL10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL10.setEnabled(false);

        soL10.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL10.setForeground(new java.awt.Color(255, 255, 0));
        soL10.setText("50%");

        javax.swing.GroupLayout pnG10Layout = new javax.swing.GroupLayout(pnG10);
        pnG10.setLayout(pnG10Layout);
        pnG10Layout.setHorizontalGroup(
            pnG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG10Layout.setVerticalGroup(
            pnG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG10Layout.createSequentialGroup()
                .addGroup(pnG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG11.setBackground(new java.awt.Color(0, 51, 51));

        jLabel11.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Chuẩn LO11");

        slL11.setBackground(new java.awt.Color(0, 51, 51));
        slL11.setForeground(new java.awt.Color(255, 51, 51));
        slL11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL11.setEnabled(false);

        soL11.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL11.setForeground(new java.awt.Color(255, 255, 0));
        soL11.setText("50%");

        javax.swing.GroupLayout pnG11Layout = new javax.swing.GroupLayout(pnG11);
        pnG11.setLayout(pnG11Layout);
        pnG11Layout.setHorizontalGroup(
            pnG11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(slL11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG11Layout.setVerticalGroup(
            pnG11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG11Layout.createSequentialGroup()
                .addGroup(pnG11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG12.setBackground(new java.awt.Color(0, 51, 51));

        jLabel12.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Chuẩn LO12");

        slL12.setBackground(new java.awt.Color(0, 51, 51));
        slL12.setForeground(new java.awt.Color(255, 51, 51));
        slL12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL12.setEnabled(false);

        soL12.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL12.setForeground(new java.awt.Color(255, 255, 0));
        soL12.setText("50%");

        javax.swing.GroupLayout pnG12Layout = new javax.swing.GroupLayout(pnG12);
        pnG12.setLayout(pnG12Layout);
        pnG12Layout.setHorizontalGroup(
            pnG12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG12Layout.setVerticalGroup(
            pnG12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG12Layout.createSequentialGroup()
                .addGroup(pnG12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnG13.setBackground(new java.awt.Color(0, 51, 51));

        jLabel13.setFont(new java.awt.Font("UTM Amerika Sans", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("Chuẩn LO13");

        slL13.setBackground(new java.awt.Color(0, 51, 51));
        slL13.setForeground(new java.awt.Color(255, 51, 51));
        slL13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        slL13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slL13.setEnabled(false);

        soL13.setFont(new java.awt.Font("UTM Amerika Sans", 1, 20)); // NOI18N
        soL13.setForeground(new java.awt.Color(255, 255, 0));
        soL13.setText("50%");

        javax.swing.GroupLayout pnG13Layout = new javax.swing.GroupLayout(pnG13);
        pnG13.setLayout(pnG13Layout);
        pnG13Layout.setHorizontalGroup(
            pnG13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(slL13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(soL13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnG13Layout.setVerticalGroup(
            pnG13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnG13Layout.createSequentialGroup()
                .addGroup(pnG13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slL13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soL13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnG13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title)
                .addGap(27, 27, 27)
                .addComponent(pnG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnG13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnG1;
    private javax.swing.JPanel pnG10;
    private javax.swing.JPanel pnG11;
    private javax.swing.JPanel pnG12;
    private javax.swing.JPanel pnG13;
    private javax.swing.JPanel pnG2;
    private javax.swing.JPanel pnG3;
    private javax.swing.JPanel pnG4;
    private javax.swing.JPanel pnG5;
    private javax.swing.JPanel pnG6;
    private javax.swing.JPanel pnG7;
    private javax.swing.JPanel pnG8;
    private javax.swing.JPanel pnG9;
    private javax.swing.JSlider slL1;
    private javax.swing.JSlider slL10;
    private javax.swing.JSlider slL11;
    private javax.swing.JSlider slL12;
    private javax.swing.JSlider slL13;
    private javax.swing.JSlider slL2;
    private javax.swing.JSlider slL3;
    private javax.swing.JSlider slL4;
    private javax.swing.JSlider slL5;
    private javax.swing.JSlider slL6;
    private javax.swing.JSlider slL7;
    private javax.swing.JSlider slL8;
    private javax.swing.JSlider slL9;
    private javax.swing.JLabel soL1;
    private javax.swing.JLabel soL10;
    private javax.swing.JLabel soL11;
    private javax.swing.JLabel soL12;
    private javax.swing.JLabel soL13;
    private javax.swing.JLabel soL2;
    private javax.swing.JLabel soL3;
    private javax.swing.JLabel soL4;
    private javax.swing.JLabel soL5;
    private javax.swing.JLabel soL6;
    private javax.swing.JLabel soL7;
    private javax.swing.JLabel soL8;
    private javax.swing.JLabel soL9;
    public static javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
