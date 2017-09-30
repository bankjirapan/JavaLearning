
package learning;

import java.util.Scanner;

public class Learning {

    public static void main(String[] args) {
       
        
       /* 
        Scanner input = new Scanner(System.in);
        
        System.out.println("กรุณาใส่ชื่อวิชา");
        
        String a = input.next();
        
        System.out.println(a.substring(3,6));
        
        
        
        String b = "Hello world";
        System.out.println(b.charAt(6));
*/
       
       String fname;
       String sname;
       
        System.out.println("Welcome to email kmutt \n ------------------");
        
        Scanner aimmy = new Scanner(System.in);
        
        System.out.print("Please enter your name : ");
        
        fname = aimmy.next();
        
        System.out.print("Please enter your surname : ");
        
        sname = aimmy.next();
        
        String low_fname = fname.toLowerCase();
        String low_sname = sname.toLowerCase();
        
        System.out.println(low_fname+"."+low_sname.substring(0,3)+"@mail.kmutt.ac.th");
        
        //สุ่ม Password 
        
        char a = 'a';
        char z = 'z';
        char A = 'A';
        char Z = 'Z';
        int num1 = 1;
        int num10 = 9;
        
        System.out.print(fname.toLowerCase().charAt(0)+""+sname.toLowerCase().charAt(0));
        //สร้างตัวพิมพ์ใหญ่
        
        
        for(int i = 0;i<2;i++){
        
        int low_a = (char)(Math.random()*(z-a)+1)+a;
        
        System.out.print((char)low_a);
       
        }
       
        
        
        
        
        
        
        
        
    }
    
}
