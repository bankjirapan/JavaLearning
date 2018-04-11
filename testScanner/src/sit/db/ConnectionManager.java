/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author INT105
 */
public class ConnectionManager {

    //การโหลดไฟล์ config ผ่านไฟล์
    public static Connection createConnection(
            //รับค่าชื่อไฟล์เข้ามา
            String fileName
    )
            //ป้องกันการเกิด Exception
            throws FileNotFoundException, IOException, SQLException
    {
        
        //โหลดไฟล์ผ่าน Properties
        Properties pros = new Properties();
        
        //ใช้ pros ผ่าน .load แล้วบอกว่าจะอ่านไฟล์
        pros.load(new FileReader(fileName));

        String serverName = pros.getProperty("SERVER_NAME");
        String serverPort = pros.getProperty("SERVER_PORT");
        String DBNAME = pros.getProperty("DB_NAME");
        String DBUSER = pros.getProperty("DB_USER");
        String DBPASS = pros.getProperty("DB_PASSWORD");
        org.apache.derby.jdbc.ClientDataSource ds = new org.apache.derby.jdbc.ClientDataSource();
        ds.setServerName(serverName);
        ds.setPortNumber(Integer.parseInt(serverPort));
        ds.setUser(DBUSER);
        ds.setPassword(DBPASS);
        ds.setDatabaseName(DBNAME);

        Connection cn = ds.getConnection();
        return cn;
    }

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

    public static void CloseCon(Connection cn) throws SQLException {
        cn.close();
    }

}
