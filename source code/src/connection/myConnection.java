
package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class myConnection {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3000/QLCDRSV", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;   
    }   
    
}
