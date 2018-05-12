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

    private int numOfItem;
    private String nameCustomer;
    private String ItemRepair;
    private String Category;
    private String discription;
    private String analyzeWaste;
    private String Solution;
    private String DateOfRepair;
    private String DateSend;
    private double Price;

    public addRepair(int numOfItem, String nameCustomer, String ItemRepair, String Category, String discription, String analyzeWaste, String Solution, String DateOfRepair, String DateSend, double Price) {
        this.numOfItem = numOfItem;
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

    public addRepair(int numOfItem, String nameCustomer) {
        this.numOfItem = numOfItem;
        this.nameCustomer = nameCustomer;
    }
    
    

   

    public addRepair() {
    }

    public int getNumOfItem() {
        return numOfItem;
    }

    public void setNumOfItem(int numOfItem) {
        this.numOfItem = numOfItem;
    }

    
    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getItemRepair() {
        return ItemRepair;
    }

    public void setItemRepair(String ItemRepair) {
        this.ItemRepair = ItemRepair;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getAnalyzeWaste() {
        return analyzeWaste;
    }

    public void setAnalyzeWaste(String analyzeWaste) {
        this.analyzeWaste = analyzeWaste;
    }

    public String getSolution() {
        return Solution;
    }

    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    public String getDateOfRepair() {
        return DateOfRepair;
    }

    public void setDateOfRepair(String DateOfRepair) {
        this.DateOfRepair = DateOfRepair;
    }

    public String getDateSend() {
        return DateSend;
    }

    public void setDateSend(String DateSend) {
        this.DateSend = DateSend;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    


    @Override
    public String toString() {
        return "รายการแจ้งซ๋อม \n"
                + "nameCustomer : " + nameCustomer +"\n"
                + "ItemRepair : " + ItemRepair  +"\n"
                + "Category : " + Category  +"\n"
                + "discription : " + discription  +"\n"
                + "analyzeWaste : " + analyzeWaste  +"\n"
                + "Solution : " + Solution  +"\n"
                + "DateOfRepair : " + DateOfRepair  +"\n"
                + "DateSend : " + DateSend  +"\n"
                + "Price : " + Price + '\n';
    }
    
    

}