/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainer.model;

/**
 *
 * @author bankcom
 */
public class EatingFood extends Food{
    
    private String foodTime;

    public EatingFood() {
    }
    
    

    public String getFoodTime() {
        return foodTime;
    }
    
    public int getEnergy(){
        return 400;
    }
    
    public int getEnergyMore(){
        return 7000;
    }

    public void setFoodTime(String foodTime) {
        this.foodTime = foodTime;
    }
    
    
    
    
    
}
