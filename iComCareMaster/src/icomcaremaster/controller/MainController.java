/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcaremaster.controller;

import icomcaremaster.db.ConnectionManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**
 *
 * @author bankcom
 */
public class MainController {

    private Connection connect;
    private int Status = 0;

    private String UsernameDB = "icomcare";
    private String PasswordDB = "bankbank";
    private String linkURL = "jdbc:derby://localhost:1527/icomcareMaster";

    public MainController() throws SQLException, ClassNotFoundException {

        connect = ConnectionManager.ConnectionManager(
                linkURL,
                UsernameDB,
                PasswordDB
        );

        this.Status = 1;

    }

    public int CreateTables() throws SQLException {
        Statement createTable = connect.createStatement();
        String sqlCreate = "CREATE TABLE admin_login "
                + "(id INTEGER not NULL, "
                + " username VARCHAR(255), "
                + " password VARCHAR(255), "
                + " name VARCHAR(255), "
                + " addres VARCHAR(255),"
                + " PRIMARY KEY ( id ))";

        createTable.executeUpdate(sqlCreate);

        return createTable.executeUpdate(sqlCreate);
    }

    public int RegisnewUser(int id,String Username, String Password, String Name, String Addr) throws SQLException {

     
        Statement insert = connect.createStatement();

        String insertCommand = "INSERT INTO admin_login (ID,USERNAME,PASSWORD,NAME,ADDRES) "
                + "VALUES(" + id + ",'" + Username + "','" + Password + "','" + Name + "','" + Addr + "')";

        insert.executeUpdate(insertCommand);

        return insert.executeUpdate(insertCommand);
    }

    public int Status() {
        return Status;
    }

}
