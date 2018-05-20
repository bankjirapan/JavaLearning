/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitphonebook.controller;

import java.sql.Connection;
import java.sql.SQLException;
import sitphonebook.database.ConnectManager;
import sitphonebook.model.SITBook;

/**
 *
 * @author bankcom
 */
public class mainController {

    private Connection con;

    public mainController(String Location,String Username,String Password) throws ClassNotFoundException, SQLException {

        con = ConnectManager.ConnectDatabase(Location, Username, Password);
        
        System.out.println("OK Ja");

    }

    public void CloseConnect(Connection con) throws SQLException {
        System.out.println("Close Database");
        con.close();
        
    }
    
    
    public int addPhoneNumber(SITBook phone){
        
        
        return 0;
    }

}
