
package course;

import java.util.Scanner;


public class Course {

 
    public static void main(String[] args) {
        
        
        System.out.println("Welcome to software Credites Course");
        
        
       Scanner input = new Scanner(System.in);
       
        System.out.print("Your coruse :");
        
        String int101 = input.next();
        
        System.out.print("your Credit : ");
        
        int c1 = input.nextInt();
        
        //--------
        
         System.out.print("Your coruse :");
        
        String mth101 = input.next();
        
        System.out.print ("your Credit :");
        
        int c2 = input.nextInt();
        
        //-----
        
         System.out.print("Your coruse :");
        
        String gen111 = input.next();
        
        System.out.print("your Credit :");
        
        int c3 = input.nextInt();
        
        //จะตัดคำนะ
        System.out.print("Your coruse : ");
        System.out.println(int101.substring(3,6)+", "+mth101.substring(3,6)+" ,"+gen111.substring(3,6));
        
        System.out.print("Payment : ");
        System.out.println((c1+c2+c3)*1000+" บาท");
        
        
       
       
    }
    
}
