/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polyproject;

import polyproject.model.Car;
import polyproject.model.Dog;
import polyproject.model.Human;
import polyproject.model.infomation;

/**
 *
 * @author INT105
 */
public class PolyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int count = 0;
        
        //Class พ่อสามารถเรียก Class ลูกได้
        infomation[] infos = new infomation[5];
        infos[0] = new Car();
        infos[1] = new Dog();
        infos[2] = new Human();
        infos[3] = new Dog();
        infos[4] = new Human();
        
        for(infomation info : infos){
            if(info.isLife() == true){
                count++;
            } 
        }
        
        System.out.println(count);

    }
    
    
    

 


}
