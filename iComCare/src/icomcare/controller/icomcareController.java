/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcare.controller;

import icomcare.database.ConnectManager;
import icomcare.model.ShowRepair;
import icomcare.model.ShowSameData;
import icomcare.model.addRepair;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

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

    public int addRepair(addRepair addrepair) throws SQLException {

        Random rand = new Random();
        int id = rand.nextInt(99999) + 1;

        int numOfItem = addrepair.getNumOfItem();
        String nameCustomer = addrepair.getNameCustomer();
        String Item = addrepair.getItemRepair();
        String Category = addrepair.getCategory();
        String Discript = addrepair.getDiscription();
        String analyzeWaste = addrepair.getAnalyzeWaste();
        String Solution = addrepair.getSolution();
        String DateOfRepair = addrepair.getDateOfRepair();
        String DateSend = addrepair.getDateSend();
        double Price = addrepair.getPrice();

        String insertSQL = "INSERT INTO ADDREPAIR (ID,NUMOFITEM,NAMECUSTOMER,ITEMREPAIR,CATEGORY,DISCRIPTION,ANALYZE,SOLUTION,DATEREPAIR,DATESEND,PRICE) "
                + "VALUES (" + id + "," + numOfItem + ",'" + nameCustomer + "','" + Item + "','" + Category + "','" + Discript + "','" + analyzeWaste + "','" + Solution + "','" + DateOfRepair + "','" + DateSend + "','" + Price + "')";

        Statement commandSQL = connect.createStatement();
        commandSQL.executeUpdate(insertSQL);
        return 0;
    }

    public ArrayList<ShowRepair> ShowAllDATA() throws SQLException {

        ArrayList<ShowRepair> ShowAllData = new ArrayList<ShowRepair>();

        Statement st = connect.createStatement();
        String querySql = "select * from ADDREPAIR";
        ResultSet result = st.executeQuery(querySql);

        while (result.next()) {
            int numOfItem = result.getInt("NUMOFITEM");
            String nameCustommer = result.getString("NAMECUSTOMER");
            String Item = result.getString("ITEMREPAIR");
            String Category = result.getString("CATEGORY");
            String Discript = result.getString("DISCRIPTION");
            String analyzeWaste = result.getString("ANALYZE");
            String Solution = result.getString("SOLUTION");
            String DateOfRepair = result.getString("DATEREPAIR");
            String DateSend = result.getString("DATESEND");
            double Price = result.getDouble("PRICE");
            ShowRepair AddForShow = new ShowRepair(
                    numOfItem,
                    nameCustommer,
                    Item,
                    Category,
                    Discript,
                    analyzeWaste,
                    Solution,
                    DateOfRepair,
                    DateSend,
                    Price
            );

            ShowAllData.add(AddForShow);

        }

        return ShowAllData;

    }

    public ArrayList<ShowSameData> ShowSameData() throws SQLException {

        Statement st = connect.createStatement();
        String querySql = "select * from ADDREPAIR";
        ResultSet result = st.executeQuery(querySql);

        ArrayList<ShowSameData> ShowSameData = new ArrayList<ShowSameData>();

        while (result.next()) {
            int numOfItem = result.getInt("NUMOFITEM");
            String nameCustommer = result.getString("NAMECUSTOMER");

            ShowSameData Samedata = new ShowSameData(numOfItem, nameCustommer);

            ShowSameData.add(Samedata);

        }

        return ShowSameData;
    }

    public int DeleteRepair(int NumOfItem) throws SQLException {

        Statement st = connect.createStatement();
        String SQLCommand = "DELETE FROM ADDREPAIR WHERE NUMOFITEM=" + NumOfItem + "";

        st.executeUpdate(SQLCommand);

        return 0;
    }

    public int CheckData(int numOfItem) throws SQLException {

        Statement st = connect.createStatement();
        int Nodata = 9;
      
        String querySql = "select * from ADDREPAIR";
        ResultSet result = st.executeQuery(querySql);
        
        
         int numItemDB = result.getMetaData().getColumnCount();
          
          
        while (result.next()) {
            int numOfItemDATA = result.getInt("NUMOFITEM");

        
        }

               
        return 1;
    }

    public int UpdateData(int numOfItem, addRepair addrepair) throws SQLException {

        String nameCustomer = addrepair.getNameCustomer();
        String Item = addrepair.getItemRepair();
        String Category = addrepair.getCategory();
        String Discript = addrepair.getDiscription();
        String analyzeWaste = addrepair.getAnalyzeWaste();
        String Solution = addrepair.getSolution();
        String DateOfRepair = addrepair.getDateOfRepair();
        String DateSend = addrepair.getDateSend();
        double Price = addrepair.getPrice();

        String UpdateSQl = "UPDATE ADDREPAIR SET NAMECUSTOMER = '" + nameCustomer + "'"
                + ",ITEMREPAIR = '"+Item+"',CATEGORY= '"+Category+"',DISCRIPTION='"+Discript+"',ANALYZE='"+analyzeWaste+"',SOLUTION='"+Solution+"',DATEREPAIR='"+DateOfRepair+"',DATESEND='"+DateSend+"',PRICE='"+Price+"' WHERE NUMOFITEM=" + numOfItem + "";

        Statement commandSQL = connect.createStatement();
        commandSQL.execute(UpdateSQl);
        return 0;

    }

    public void close() throws SQLException, ClassNotFoundException {
        ConnectManager.CloseDatabase(connect);
    }

}
