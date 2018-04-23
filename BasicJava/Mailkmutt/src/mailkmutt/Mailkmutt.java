/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailkmutt;

/**
 *
 * @author bankcom
 */

import java.util.Scanner;

public class Mailkmutt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String fname = "";
        String sname = "";
        
        System.out.println("Welcome to Create E-Mail of KMUTT \n ----------------");
        
        
       //สร้างตัวแปร Scanner ขึ้นมาเพื่อใช้งาน
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Please enter your name : ");
       
       fname = input.next();
       
       System.out.print("Please enter your surname : ");
       
       sname = input.next();
       
       System.out.println("Welcome " +fname + sname);
       
       System.out.println("---- your E-Mail of KMUTT ------");
       
       String low_fname = fname.toLowerCase();
       String low_sname = sname.toLowerCase();
       
        System.out.println(low_fname+"."+low_sname.substring(0,3)+"@mail.kmutt.ac.th");
        
        System.out.println("Your Password for Mail ");
        
        
//สุ่ม Password
        
        System.out.print(""+fname.toLowerCase().charAt(0)+sname.toLowerCase().charAt(0));
        
        //สร้างตัวแปร สำหรับเก็บค่า A-Z และ a-z และตัวเลข
        
        char a = 'a';
        char z = 'z';
        char A = 'A';
        char Z = 'Z';
        
        int num1 = 1;
        int num10 = 10;
        
        
        //สร้างสุ่มตัวพิมพ์ใหญ่ มา 2 ตัว
        for(int i=1; i<3 ; i++){
          int x = (int)(Math.random()*(Z-A+1)+A);
        
           System.out.print((char)x);
        }
        
        for(int i=1; i<3 ; i++){
          int y = (int)(Math.random()*(z-a+1)+a);
        
           System.out.print((char)y);
        
        }
        
         for(int i=1; i<3 ; i++){
          int g = (int)(Math.random()*(num10-num1+1)+num1);
        
           System.out.print(g);
        }
        System.out.println("\n");
        
        
        
       
       
       
        
    }
    
}
