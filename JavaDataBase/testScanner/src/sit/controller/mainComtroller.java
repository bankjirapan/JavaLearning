/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import sit.db.ConnectionManager;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class mainComtroller {

    private Connection Connect;

    public mainComtroller(String username, String Password) throws ClassNotFoundException, SQLException {
        String dbLocation = "jdbc:derby://localhost:1527/iTrackDB";
        Connect = ConnectionManager.createConnection(dbLocation, username, Password);
        System.out.println("Database Connected finish");
    }

    public mainComtroller(Properties pro) throws SQLException {
        String dbLocation = "jdbc:derby://localhost:1527/iTrackDB";
        Connect = ConnectionManager.creteConection(dbLocation, pro);
        System.out.println("Database Connected finish");

    }
    
    
    //เชื่อมต่อข้อมูลแบบใช้ IO
    public mainComtroller(String filename)throws ClassNotFoundException, SQLException, IOException{
        Connect = ConnectionManager.createConnection(filename);
        System.out.println("DATABASE Connect Finish");
    }

    public int inSertTrack(Student std) throws SQLException {
        int insertDB = 0;
        int id = std.getStdID();
        String Username = std.getStdFirstName();
        String Password = std.getStdLastName();
        String sql = "INSERT INTO login (PERSONID,USERNAME,PASSWORD,LASTNAME,FIRSTNAME) VALUES ("+id+",'bank','bank','"+Username+"','"+Password+"')";

        Statement commandSql = Connect.createStatement();
        insertDB = commandSql.executeUpdate(sql);
        return insertDB;
    }
    
    
    
   public void close() throws SQLException{
       ConnectionManager.CloseCon(Connect);
   }

}
