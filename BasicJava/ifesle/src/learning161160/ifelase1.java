/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning161160;

/**
 *
 * @author bankcom
 */

import java.util.Scanner;
public class ifelase1 {
    
    public static void main(String[] args){
        //System.out.println("Hello world");
        
        
        System.out.println("ระบบสร้าง Password แบบปลอคภัย");
        
        
        System.out.println("Enter Your name");
        Scanner input = new Scanner(System.in);
        
        String fname = input.next();
        
        System.out.println(fname.substring(fname.length()-2));
    }
    
}
