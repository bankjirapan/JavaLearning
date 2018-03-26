/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author INT105
 */
public class ConnectionManager {

    public static Connection createConnection(
            String nameLocation,
            String Username,
            String Password
    ) throws ClassNotFoundException, SQLException {

        //ต้องสร้าง connection
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

        Connection cn = DriverManager.getConnection(nameLocation, Username, Password);
        return cn;
    }

    public static Connection creteConection(
            String LocationDB, Properties props
    ) throws SQLException {
//        String Username = props.getProperty("Username");
//        String Password = props.getProperty("Password");

        Connection cn = DriverManager.getConnection(LocationDB, props);
        return cn;
    }
    
    public static void CloseCon(Connection cn) throws SQLException{
        cn.close();
    }

}
