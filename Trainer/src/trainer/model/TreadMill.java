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
public class TreadMill implements ExerciseMachine{
    
    
    private String name;
    private int price;

    public TreadMill() {
        this.name = "Bank";
        this.price = 350;
    }


    
    //Class ของ Implements
    @Override
     public int helpMetabolism(){
        return 350;
    }

  

    @Override
    public String toString() {
        return "TreadMill{" + "name=" + name + ", price=" + price + '}';
    }
    
    
    
    
    
}
