
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import connection.myConnection;

public class main {

    public static Connection connection = null;
    public static Statement st;
    public static String Maso = null;
    public static String Phanquyen = null;
    public static String Name = null;
    public static String MAKHOA = null;
    public static LocalDateTime Thoigian = null;

    public static float tb_HP(String MSSV) { ///Tính trung bình HP của SV đó
        String[] list;
        try {
            list = Sinhvien.getDsLop(MSSV);
            float count = 0, tb = 0;
            for (int i = 0; list[i] != null; i++) {
                diemSinhvien a = new diemSinhvien(MSSV, list[i]);
                tb = tb + a.HP;
                count++;
            }
            tb = tb / count;
            return tb;
        } catch (SQLException ex) {
            System.out.println("lỗi");
        }
        return 0;
    }

    ;

    public static boolean sosanh(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    ;
    
    public static String converse_tenMon(String a) throws SQLException {
        main.st = main.connection.createStatement();
        ResultSet result;
        result = main.st.executeQuery("select * from MONHOC");
        while (result.next()) {
            if (result.getString("MAMH").trim().equals(a)) {
                return result.getString("TENMH").trim();
            }
            if (result.getString("TENMH").trim().equals(a)) {
                return result.getString("MAMH").trim();
            }
        }

        return null;
    }

    ;
    

    
  

    public static void main(String[] args) throws SQLException {
        // Kết nối với CSDL
        System.setProperty("file.encoding", "utf-8");
      
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3000/QLCDRSV", "root", "");
        st = connection.createStatement();
        //----------------------------------------------
        new Login().setVisible(true);
        
    }
}
