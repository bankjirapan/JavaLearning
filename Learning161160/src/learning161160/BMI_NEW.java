
package learning161160;


import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI_NEW {
    
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner input = new Scanner(System.in);
        
        DecimalFormat tuskum = new DecimalFormat("#.##");
        
        System.out.println("This is a Body Mass Index(BMI) calculator");
        
        System.out.print("Input your weight in kg: ");
       
        weight = input.nextDouble();
        
        System.out.print("Input your height in cm: ");
        
        //ไอ้นี่มันดับเบิ้ล
        height = input.nextDouble();
        
        
        
        bmi = cal(weight,height);
        
        System.out.println("Your BMI = " + tuskum.format(bmi));
        
        String message = message_re(bmi);
        
        System.out.println(message);
    }
    
     
    public static double cal(double weight,double height){
        
        
        //แปลงให้มันเป็นเซต Cm 
     
       height = height/100; 
       
       return weight / (height * height);
    }
    
    public static String message_re(double bmi){
        String message;
        if (bmi < 18.5) {
            message = "Underweight";
        } else if (bmi < 25) {
            message = "Normal weight";
        } else if (bmi < 30) {
            message = "Over weight";
        } else {
            message = "Obese";
        }
        
        return message;
    }
        
    
}
