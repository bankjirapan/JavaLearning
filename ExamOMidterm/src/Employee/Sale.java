/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author bankcom
 */
public class Sale extends Employee{
    
    private double commission;

    public Sale(double commission) {
        this.commission = commission;
    }

    public Sale(double commission, int ElyId, String name, double saraly) {
        super(ElyId, name, saraly);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Sale{" + "commission=" + commission + '}';
    }
    
    
    
}
