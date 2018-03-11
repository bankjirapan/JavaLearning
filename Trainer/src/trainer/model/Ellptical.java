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

//implement สามารถ im ได้หลาย Class
public class Ellptical implements ExerciseMachine{
    
    
    private String name;
    private int price;

    public Ellptical() {
        this.name = "Bank";
        this.price = 5;
    }

 
    
    @Override
    public int helpMetabolism(){
        return 400;
    }


    @Override
    public String toString() {
        return "Ellptical{" + "name=" + name + ", price=" + price + '}';
    }
    
    
    
    
}
