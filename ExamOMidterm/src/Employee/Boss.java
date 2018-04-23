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
public class Boss extends Employee{
    
    private double rate;

    public Boss(double rate) {
        this.rate = rate;
    }

    public Boss(double rate, int ElyId, String name, double saraly) {
        super(ElyId, name, saraly);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    @Override
     public double getSaraly() {
       return super.getSaraly() * this.rate;
        
        
         
    }
    
   
    @Override
    public String toString() {
        //return "Boss{" + "rate=" + rate + '}';
        
        String BossFunction;
        BossFunction = "List Employee "+super.toString()+" Rete = "+rate;
        
        return BossFunction;
    }
    
    
    
}
