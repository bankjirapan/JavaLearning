/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcare.model;

/**
 *
 * @author bankcom
 */
public class ShowRepair extends addRepair{

    public ShowRepair(int numOfItem, String nameCustomer, String ItemRepair, String Category, String discription, String analyzeWaste, String Solution, String DateOfRepair, String DateSend, double Price) {
        super(numOfItem, nameCustomer, ItemRepair, Category, discription, analyzeWaste, Solution, DateOfRepair, DateSend, Price);
    }

    @Override
    public String toString() {
        String ShowAll = super.toString();
 
        return ShowAll;
    }
    
   

    
}
