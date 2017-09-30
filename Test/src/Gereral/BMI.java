
package Gereral;

/**
 *
 * @author bankcom
 */

//นำเข้า Scanner
import java.util.Scanner;

public class BMI {
    
        public static void main(String[] args){
            
           double weight;
           double height;
        
           double result;
            
            System.out.println("Welcome to BMI");
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Please enter your weight(kg) : ");
            
            weight = sc.nextDouble();
            
            System.out.print("Please enter your height(cm) : ");
            
            height = sc.nextDouble() / 2;
            
            
            result = weight / (height*height);
            System.out.println("result BMI : "+result);
            
            
            
            
            
            
        }
    
}
