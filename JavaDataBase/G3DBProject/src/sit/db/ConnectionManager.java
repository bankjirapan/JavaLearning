package sit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static Connection createConnection
        (String url, String username, String psw) 
                throws ClassNotFoundException, SQLException{
        //load driver class and register driver class to DriverManager
       // Class.forName("org.apache.derby.jdbc.EmbeddedDriver");      
        Connection cn=DriverManager.getConnection(url, username, psw);
        System.out.println("Driver class registered successfully");
        return cn;
    }
    public static void closeConnection(Connection cn)
            throws SQLException{
        cn.close();
    }
}
