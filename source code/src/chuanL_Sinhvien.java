
import java.sql.ResultSet;
import java.sql.SQLException;

public class chuanL_Sinhvien {

    public float[] L = new float[13];

    public static int getG(String a) {
        if ("G1".equals(a)) {
            return 0;
        }
        if ("G2".equals(a)) {
            return 1;
        }
        if ("G3".equals(a)) {
            return 2;
        }
        if ("G4".equals(a)) {
            return 3;
        }
        if ("G5".equals(a)) {
            return 4;
        }
        return -1;
    }

    ;
    public static int getDemL(String a) throws SQLException {

        ResultSet result_dem = main.st.executeQuery("select COUNT(*) as DEM from CHUAN_L_G_MON where MACHUANL='" + a + "'");
        while (result_dem.next()) {
            return Integer.parseInt(result_dem.getString("DEM").trim());
        }
        return -1;
    }

    ;
    public static int getL(String a) {
        for (int i = 1; i <= 13; i++) {
            if (a.equals("LO" + i)) {
                return i - 1;
            }
        }
        return -1;
    }

    ;

    public chuanL_Sinhvien(String MSSV) throws SQLException {
        for (int i = 0; i < 12; i++) {
            L[i] = 0;
        }
        ResultSet result ;
        diemSinhvien a ;
        String[] listMon = Sinhvien.getDsLop(MSSV);
        for (int i = 0; i < listMon.length; i++) {
            a = new diemSinhvien(MSSV, listMon[i]);
            result = main.st.executeQuery("select * from CHUAN_L_G_MON where MAMH = '" + listMon[i] + "'");
            while (result.next()) {
                System.out.println(getL(result.getString("MACHUANL").trim()));
                System.out.println(listMon[i]);
                L[getL(result.getString("MACHUANL").trim())] = L[getL(result.getString("MACHUANL").trim())] + a.G_HP[getG(result.getString("MACHUANG").trim())];
            }
        }
        for (int i = 1; i <= 13; i++) {
            L[i - 1] = L[i - 1] / getDemL("LO" + i);
        }
    }

}
