/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcare.database;

/**
 *
 * @author bankcom
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bankcom
 */
public class ConnectManager {

    //นำ Class ชื่อ Connection เข้ามา
    public static Connection ConnectDatabase(
            String Location,
            String Username,
            String Password
    ) throws ClassNotFoundException, SQLException {

        //สร้าง Class
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

        Connection ConnectDB = DriverManager.getConnection(Location, Username, Password);
        return ConnectDB;
    }

    public static void CloseDatabase(Connection ConnectDB)
            throws ClassNotFoundException,
            SQLException {
        ConnectDB.close();

    }

}
