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
public class Human implements infomation{
      @Override
    public boolean isLife(){
        return true;
    }
    
    @Override
    public String move(){
        return "Move by 2 leg on grond";
    }
    
     @Override 
     public String giveDetail(){
         return "Human Rise";
     }
}
