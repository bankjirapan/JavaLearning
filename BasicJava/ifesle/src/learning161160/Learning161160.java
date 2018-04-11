
package learning161160;

import java.util.Scanner;

public class Learning161160 {
    public static void main(String[] args) {
       
        
        //การใช้ if else ในการบอกเกรด
        
        System.out.println("Welcome to chack score grade");
        
        //รับค่าจากแป้นพิมพ์
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your score");
        
        int score = input.nextInt();
        
        
        String message;
        
        
        if(score >= 80){
            message = "A";
        } else if(score >= 75){
            message = "B+";
        } else if(score >= 70){
            message = "B";
        } else if(score >= 65){
            message = "C+";
        } else if(score >= 60){
            message = "C";
        } else if(score >= 55){
            message = "D";
        } else {
            message = "F";
        }
        
        System.out.println("คุณได้เกรด :"+message);
        
       
        
        
    }
    
}
