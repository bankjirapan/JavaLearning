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
public class Dog  implements infomation{
    
    
      @Override
    public boolean isLife(){
        return true;
    }
    
    @Override
    public String move(){
        return "Move by 4 leg ";
    }
    
     @Override 
     public String giveDetail(){
         return "Animal";
     }
    
}
