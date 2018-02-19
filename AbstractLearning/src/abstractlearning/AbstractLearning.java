/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractlearning;

import abstractlearning.model.Circle;
import abstractlearning.model.Circle2;
import abstractlearning.model.Rectangle;
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
        
        
        //compare จะรีเทินค่า 3 ค่า 
        /*
        ถ้า รีเทินเป็น 0 แปลว่า 2 มันเท่ากัน
        ถ้า รีเทิน -1 แสดงว่าค่าที่ไปเปรียบมากกว่าค่าที่เราเปรียบ
        ถ้า รีเทิน + แสดงว่าค่าที่ไปเปรียบเทียบมากกว่าค่าที่เอาไปเปรียบ
        
        */
        
        System.out.println(str1.compareTo(str2));
        
        
        System.out.println("------ เรื่องของ Ractangle ---------");
        Rectangle rec1 = new Rectangle(5,10);
        Rectangle rec2 = new Rectangle(5,10);
        
        System.out.println(rec1.compareTo(rec2));
        
        
    }
    
}
