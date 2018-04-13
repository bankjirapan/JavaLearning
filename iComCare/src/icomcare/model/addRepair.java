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
public class addRepair {

    private static int numOfItem;
    private String nameCustomer;
    private String ItemRepair;
    private String Category;
    private String discription;
    private String analyzeWaste;
    private String Solution;
    private String DateOfRepair;
    private String DateSend;
    private double Price;

    public addRepair(String nameCustomer,
            String ItemRepair,
            String Category,
            String discription,
            String analyzeWaste,
            String Solution,
            String DateOfRepair,
            String DateSend,
            double Price
    ) {
        this.nameCustomer = nameCustomer;
        this.ItemRepair = ItemRepair;
        this.Category = Category;
        this.discription = discription;
        this.analyzeWaste = analyzeWaste;
        this.Solution = Solution;
        this.DateOfRepair = DateOfRepair;
        this.DateSend = DateSend;
        this.Price = Price;
    }
    
    
    

}
