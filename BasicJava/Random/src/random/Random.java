/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.Scanner;

/**
 *
 * @author bankcom
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner bank = new Scanner(System.in);
        
        //รับค่า
        System.out.println("Enter your Password");
        String a = bank.next();
        
        System.out.println("Enter your Number");
        String num = bank.next();
         
         
        
        //รับ 4 ตัว
        char a1 = a.charAt(0);
        char a2 = a.charAt(1);
        char a3 = a.charAt(2);
        char a4 = a.charAt(3);
        
   
        
        String lenght1 = num.substring(num.length()-2,num.length());
       
     char aaa = lenght1.charAt(0);
     char bbb = lenght1.charAt(1);
        
   
     
    
        
        System.out.println(""+a4+a3+a2+a1+bbb+aaa);
        
        
    }
    
}
