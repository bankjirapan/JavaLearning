/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author bankcom
 */

//นำเข้า Class Scanner;

import java.util.Scanner;

//import class cut ;

import java.text.DecimalFormat;

public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        double weight;
        double height;
        double bmi;
        double covertheight;
        
       //นำ Scanner มาใช้งาน 
        
         Scanner inkeyboard = new Scanner(System.in);
         
         
        
        System.out.println("Please enter  Weight KM");      
       
         weight = inkeyboard.nextDouble();
        
        System.out.println("Please enter height cm or m");
        
         height = inkeyboard.nextDouble();
         
         System.out.println("Ok ! Thank for enter data");
         
         System.out.println("Anaswer");
         
         //Culator BMI
         
         //Covert cm to m
         if(height>=4){
         covertheight = height / 100;
         } else {
          covertheight = height;
         }
         
         //Create Class Decimalformate 
         
         DecimalFormat fmt = new DecimalFormat("0.#######");
         
         
         bmi = weight / Math.pow(covertheight,2);
         
         System.out.println("your BMI = " + fmt.format(bmi));
         
         
        
        
    }
    
}
