/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polyproject.model;

/**
 *
 * @author INT105
 */
public class Car implements  infomation{
    @Override
    public boolean isLife(){
        return false;
    }
    
    @Override
    public String move(){
        return "Move by Cheel ";
    }
    
     @Override 
     public String giveDetail(){
         return "Valeee";
     }
    
    
    
}
