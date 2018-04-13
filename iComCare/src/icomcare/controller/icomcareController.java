/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcare.controller;

import icomcare.database.ConnectManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author bankcom
 */
public class icomcareController {

    private Connection connect;

    private String UsernameDB = "bank";
    private String PasswordDB = "bank";
    private String LocationDB = "jdbc:derby://localhost:1527/icomcare";

    public icomcareController() throws ClassNotFoundException, SQLException {

        connect = ConnectManager.ConnectDatabase(
                LocationDB,
                UsernameDB,
                PasswordDB
        );
        
        System.out.println("OK");

    }

}
