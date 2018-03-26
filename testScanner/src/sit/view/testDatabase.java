/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import sit.controller.mainComtroller;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class testDatabase {

    public static void main(String[] args) {

        try {
            //mainComtroller srdCtrl = new mainComtroller("administrator","admin");
            Properties dbPros = new Properties();
            dbPros.setProperty("user", "administrator");
            dbPros.setProperty("password", "admin");
            mainComtroller stdCtrl = new mainComtroller(dbPros);
            int insetStd = stdCtrl.inSertTrack(new Student(99,"Bank","jirapan"));
            System.out.println(insetStd);
            
        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
    }

//    public int DeleteiTrack(int deleteID){
//        int DeleteRec = 0;
//        String sql = "Delete from "
//    }
}
