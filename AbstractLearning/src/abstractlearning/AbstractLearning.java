/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractlearning;

import abstractlearning.model.Circle;
import abstractlearning.model.Circle2;
import abstractlearning.model.Snape;
import abstractlearning.model.Square2;

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
        
        
        //*****************************
        
        Square2 sq = new Square2(5);
        
        System.out.println("Area = "+sq.findArea());
        System.out.println("Circum = "+sq.findCircumference());
        
        
        
        //ตัวอย่างงงง Compareto ----------
        System.out.println("-------End--------");
        
        String str1 = "Book";
        String str2 = "ant";
        //มันจะรีเทินค่าเป็น Aggy
        
        // A-Z เท่ากับ 65-90  
        // a-z เท่ากับ 97-122
        System.out.println(str1.compareTo(str2));
        
        
    }
    
}
