/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractlearning;

import abstractlearning.model.Circle;
import abstractlearning.model.Circle2;
import abstractlearning.model.Snape;

/**
 *
 * @author INT105
 */
public class AbstractLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code app
        Snape s1;
        Circle c1;
        Circle2 c2 = new Circle2(2.5,1);
        
        double area = c2.findArea();
        double circum = c2.findCircumference();
        
        System.out.println("Area = "+area);
        System.out.println("Circum = "+circum);
        System.out.println(c2);
    }
    
}
