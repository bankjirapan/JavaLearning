/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscanner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import sit.controller.mainComtroller;

/**
 *
 * @author INT105
 */
public class testIO {
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        
        try{
            String file = "dbProperties.txt";
            mainComtroller conDB = new mainComtroller(file);
            
        } catch(ClassNotFoundException cs){
            System.out.println(cs);
        } catch(IOException io){
            System.out.println("Files not found"+ io);
        } catch(SQLException sql){
            System.out.println("SQL ERROR "+sql);
        }
        
        
        
        
    }
    
}
