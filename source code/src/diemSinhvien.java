
import java.sql.ResultSet;
import java.sql.SQLException;

public class diemSinhvien {

    public String MSSV;
    public String HOTEN;
    public String MAMH;
    public String TENMH;
    public float QT;
    public float TYLE_GK = 10;
    public float GK;
    public int SOCAU_GK; //Số câu trong đề GK môn đó
    public float TYLE_CK = 10;
    public float CK;
    public int SOCAU_CK; //Số câu trong đề CK môn đó
    public float HP;
    public float[] G_GK = new float[5];
    public float[] G_CK = new float[5];
    public float[] G_HP = new float[5];
    private float G1 = 0, G2 = 0, G3 = 0, G4 = 0, G5 = 0;

    public diemSinhvien(String MSSV, String MAMH) throws SQLException {

        this.MSSV = MSSV;
        main.st = main.connection.createStatement();
        //đếm số câu trong đề GK và CK, tìm tỷ lệ GK CK
        ResultSet result_dem;
        result_dem = main.st.executeQuery("select   a.SOCAU , a.LOAIDE , a.TYLE from DETHI a, DIEM b, LOPHOC c, MONHOC d where	c.MALOPHOC=a.MALOPHOC and a.MADETHI=b.MADETHI  and b.MSSV='" + MSSV + "' and  d.MAMH='" + MAMH + "'");
        while (result_dem.next()) {
            if (result_dem.getString("LOAIDE").trim().equals("GK")) {
                SOCAU_GK = Integer.parseInt(result_dem.getString("SOCAU"));
                TYLE_GK = Float.parseFloat(result_dem.getString("TYLE"));
            }
            if (result_dem.getString("LOAIDE").trim().equals("CK")) {
                SOCAU_CK = Integer.parseInt(result_dem.getString("SOCAU"));
                TYLE_CK = Float.parseFloat(result_dem.getString("TYLE"));
            }
        }

        // kết quả GK SV với môn đó
        for (int i = 1; i <= SOCAU_GK; i++) {
            ResultSet result_GK;
            result_GK = main.st.executeQuery("select  d.MAMH, d.TENMH, b.DIEMTHUC, b.DIEMQT, b.MSSV, f.HOTEN, d.TENMH from DETHI a, DIEM b, LOPHOC c, MONHOC d, SINHVIEN f where	d.MAMH=c.MAMH and c.MALOPHOC=a.MALOPHOC and a.MADETHI=b.MADETHI and b.MSSV='" + MSSV + "' and b.MACAU='" + i + "' and a.LOAIDE='GK' and d.MAMH='" + MAMH + "' and f.MSSV=b.MSSV");
            if (result_GK.next()) {
                GK = GK + Float.parseFloat(result_GK.getString("DIEMTHUC"));
                QT = Float.parseFloat(result_GK.getString("DIEMQT"));
                this.MAMH = result_GK.getString("MAMH");
                TENMH = result_GK.getString("TENMH");
                HOTEN = result_GK.getString("HOTEN");
            }
        }

        // kết quả CK SV với môn đó
        ResultSet result_CK;
        for (int i = 1; i <= SOCAU_CK; i++) {
            result_CK = main.st.executeQuery("select  d.MAMH, d.TENMH, b.DIEMTHUC, b.DIEMQT, b.MSSV, f.HOTEN, d.TENMH from DETHI a, DIEM b, LOPHOC c, MONHOC d, SINHVIEN f where	d.MAMH=c.MAMH and c.MALOPHOC=a.MALOPHOC and a.MADETHI=b.MADETHI and b.MSSV='" + MSSV + "' and b.MACAU='" + i + "' and a.LOAIDE='CK' and d.MAMH='" + MAMH + "' and f.MSSV=b.MSSV");
            if (result_CK.next()) {
                CK = CK + Float.parseFloat(result_CK.getString("DIEMTHUC"));
            }
        }
        // điểm học phần làm tròn đến 2 số thập phân
        HP = (float) Math.ceil((((GK * TYLE_GK) / 100) + ((CK * TYLE_CK) / 100) + ((QT * (100 - TYLE_CK - TYLE_GK)) / 100)) * 100) / 100;

        //Tính G
        G_GK[0] = -1; G_GK[1] = -1; G_GK[2] = -1; G_GK[3] = -1; G_GK[4] = -1;
        G_CK[0] = -1; G_CK[1] = -1; G_CK[2] = -1; G_CK[3] = -1; G_CK[4] = -1;
        G_HP[0] = -1; G_HP[1] = -1; G_HP[2] = -1; G_HP[3] = -1; G_HP[4] = -1;

        //Tính chuẩn G điểm GK
        for (int i = 1; i <= SOCAU_GK; i++) {
            //Đếm số chuẩn G trong mỗi câu
            ResultSet reDem;
            reDem = main.st.executeQuery("select  b.MACHUANG, b.DIEM, d.MAMH, d.TENMH, b.DIEMTHUC, b.DIEMQT, b.MSSV, f.HOTEN, d.TENMH from DETHI a, DIEM b, LOPHOC c, MONHOC d, SINHVIEN f where	d.MAMH=c.MAMH and c.MALOPHOC=a.MALOPHOC and a.MADETHI=b.MADETHI and b.MSSV='" + MSSV + "' and b.MACAU='" + i + "' and a.LOAIDE='GK' and d.MAMH='" + MAMH + "' and f.MSSV=b.MSSV");
            float countRow = 0;
            while (reDem.next()) {
                countRow = reDem.getRow();
            }

            ResultSet result_G_GK;
            result_G_GK = main.st.executeQuery("select  b.MACHUANG, b.DIEM, d.MAMH, d.TENMH, b.DIEMTHUC, b.DIEMQT, b.MSSV, f.HOTEN, d.TENMH from DETHI a, DIEM b, LOPHOC c, MONHOC d, SINHVIEN f where	d.MAMH=c.MAMH and c.MALOPHOC=a.MALOPHOC and a.MADETHI=b.MADETHI and b.MSSV='" + MSSV + "' and b.MACAU='" + i + "' and a.LOAIDE='GK' and d.MAMH='" + MAMH + "' and f.MSSV=b.MSSV");
            while (result_G_GK.next()) {
                float a = Float.parseFloat(result_G_GK.getString("DIEMTHUC"));
                float b = Float.parseFloat(result_G_GK.getString("DIEM"));

                switch (result_G_GK.getString("MACHUANG").trim()) {
                    case "G1":
                        if (G_GK[0] == -1) //Kiểm tra chuẩn G* có null ko
                        {
                            G_GK[0] = 0;
                        }
                        G_GK[0] = a / countRow + G_GK[0];    //Tính chuẩn G*
                        G1 = G1 + b / countRow;
                        break;
                    case "G2":
                        if (G_GK[1] == -1) //Kiểm tra chuẩn G* có null ko
                        {
                            G_GK[1] = 0;
                        }
                        G_GK[1] = a / countRow + G_GK[1];    //Tính chuẩn G*
                        G2 = G2 + b / countRow;
                        break;
                    case "G3":
                        if (G_GK[2] == -1) //Kiểm tra chuẩn G* có null ko
                        {
                            G_GK[2] = 0;
                        }
                        G_GK[2] = a / countRow + G_GK[2];    //Tính chuẩn G*
                        G3 = G3 + b / countRow;
                        break;
                    case "G4":
                        if (G_GK[3] == -1) //Kiểm tra chuẩn G* có null ko
                        {
                            G_GK[3] = 0;
                        }
                        G_GK[3] = a / countRow + G_GK[3];    //Tính chuẩn G*
                        G4 = G4 + b / countRow;
                        break;
                    case "G5":
                        if (G_GK[4] == -1) //Kiểm tra chuẩn G* có null ko
                        {
                            G_GK[4] = 0;
                        }
                        G_GK[4] = a / countRow + G_GK[4];    //Tính chuẩn G*
                        G5 = G5 + b / countRow;
                        break;
                }
            }
        }
        if (G_GK[0] != -1) {
            G_GK[0] = (G_GK[0] / G1) * 100;
        }
        if (G_GK[1] != -1) {
            G_GK[1] = (G_GK[1] / G2) * 100;
        }
        if (G_GK[2] != -1) {
            G_GK[2] = (G_GK[2] / G3) * 100;
        }
        if (G_GK[3] != -1) {
            G_GK[3] = (G_GK[3] / G4) * 100;
        }
        if (G_GK[4] != -1) {
            G_GK[4] = (G_GK[4] / G5) * 100;
        }
        
        G1 = 0; G2 = 0; G3 = 0; G4 = 0; G5 = 0;
        //Tính chuẩn G điểm CK
        for (int i = 1; i <= SOCAU_CK; i++) {
            //Đếm số chuẩn G trong mỗi câu
            ResultSet reDem;
            reDem = main.st.executeQuery("select  b.MACHUANG, b.DIEM, d.MAMH, d.TENMH, b.DIEMTHUC, b.DIEMQT, b.MSSV, f.HOTEN, d.TENMH from DETHI a, DIEM b, LOPHOC c, MONHOC d, SINHVIEN f where	d.MAMH=c.MAMH and c.MALOPHOC=a.MALOPHOC and a.MADETHI=b.MADETHI and b.MSSV='" + MSSV + "' and b.MACAU='" + i + "' and a.LOAIDE='CK' and d.MAMH='" + MAMH + "' and f.MSSV=b.MSSV");
            float countRow = 0;
            while (reDem.next()) {
                countRow = reDem.getRow();
            }

            ResultSet result_G_CK;
            result_G_CK = main.st.executeQuery("select  b.MACHUANG, b.DIEM, d.MAMH, d.TENMH, b.DIEMTHUC, b.DIEMQT, b.MSSV, f.HOTEN, d.TENMH from DETHI a, DIEM b, LOPHOC c, MONHOC d, SINHVIEN f where	d.MAMH=c.MAMH and c.MALOPHOC=a.MALOPHOC and a.MADETHI=b.MADETHI and b.MSSV='" + MSSV + "' and b.MACAU='" + i + "' and a.LOAIDE='CK' and d.MAMH='" + MAMH + "' and f.MSSV=b.MSSV");
            while (result_G_CK.next()) {
                float a = Float.parseFloat(result_G_CK.getString("DIEMTHUC"));
                float b = Float.parseFloat(result_G_CK.getString("DIEM"));

                switch (result_G_CK.getString("MACHUANG").trim()) {
                    case "G1":
                        if (G_CK[0] == -1) //Kiểm tra chuẩn G* có null ko
                        {
                            G_CK[0] = 0;
                        }
                        G_CK[0] = a / countRow + G_CK[0];    //Tính chuẩn G*
                        G1 = G1 + b / countRow;
                        break;
                    case "G2":
                        if (G_CK[1] == -1) //Kiểm tra chuẩn G* có null ko
                        {
                            G_CK[1] = 0;
                        }
                        G_CK[1] = a / countRow + G_CK[1];    //Tính chuẩn G*
                        G2 = G2 + b / countRow;
                        break;
                    case "G3":
                        if (G_CK[2] == -1) //Kiểm tra chuẩn G* có null ko
                        {
                            G_CK[2] = 0;
                        }
                        G_CK[2] = a / countRow + G_CK[2];    //Tính chuẩn G*
                        G3 = G3 + b / countRow;
                        break;
                    case "G4":
                        if (G_CK[3] == -1) //Kiểm tra chuẩn G* có null ko
                        {
                            G_CK[3] = 0;
                        }
                        G_CK[3] = a / countRow + G_CK[3];    //Tính chuẩn G*
                        G4 = G4 + b / countRow;
                        break;
                    case "G5":
                        if (G_CK[4] == -1) //Kiểm tra chuẩn G* có null ko
                        {
                            G_CK[4] = 0;
                        }
                        G_CK[4] = a / countRow + G_CK[4];    //Tính chuẩn G*
                        G5 = G5 + b / countRow;
                        break;
                }
            }
        }
        //Tính kết quả cuối cùng
        if (G_CK[0] != -1) {
            G_CK[0] = (float) Math.ceil((G_CK[0] / G1) * 100);
            G_HP[0] = (float) Math.ceil((G_GK[0] * TYLE_GK + G_CK[0] * TYLE_CK)/(TYLE_CK+TYLE_GK));
        }
        if (G_CK[1] != -1) {
            G_CK[1] = (float) Math.ceil((G_CK[1] / G2) * 100);
            G_HP[1] = (float) Math.ceil((G_GK[1] * TYLE_GK + G_CK[1] * TYLE_CK)/(TYLE_CK+TYLE_GK)) ;
        }
        if (G_CK[2] != -1) {
            G_CK[2] = (float) Math.ceil((G_CK[2] / G3) * 100);
            G_HP[2] = (float) Math.ceil((G_GK[2] * TYLE_GK + G_CK[2] * TYLE_CK)/(TYLE_CK+TYLE_GK));
        }
        if (G_CK[3] != -1) {
            G_CK[3] = (float) Math.ceil((G_CK[3] / G4) * 100);
            G_HP[3] = (float) Math.ceil((G_GK[3] * TYLE_GK + G_CK[3] * TYLE_CK)/(TYLE_CK+TYLE_GK));
        }
        if (G_CK[4] != -1) {
            G_CK[4] = (float) Math.ceil((G_CK[4] / G5) * 100);
            G_HP[4] = (float) Math.ceil((G_GK[4] * TYLE_GK + G_CK[4] * TYLE_CK)/(TYLE_CK+TYLE_GK));
        }
    }

}
