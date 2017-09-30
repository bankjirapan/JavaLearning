package randomtest;

//import Class Scanner
import java.util.Scanner;

public class Randomtest{
    
    
    public static void main(String[] args){
        
        //ประกาศ Class ของ Scanner;
        
        Scanner input = new Scanner(System.in);
     
        
        //Create Valible fname;
        String fname = "";
        String Sname = "";
        
        System.out.println("Welcome to Register E-Mail of KMUTT");
        System.out.println("-------------------------");
        
        System.out.print("Please enter your name : ");
        
        fname = input.next();
        
        System.out.print("Please enter your Surname : ");
         
        Sname = input.next();
        
        System.out.println("Ok Welcome : "+fname +" "+ Sname+"\n---------------");
        
        System.out.println("Your Mail of KMUTT");
        
        //กำหนดชื่อเป็นตัวเล็ก
       String low_fname = fname.toLowerCase();
       String low_sname = Sname.toLowerCase();
       
       
        System.out.println(low_fname+"."+low_sname.substring(0,3)+"@mail.kmutt.ac.th"+"\nYour password defualt");
        
        
        // กำหนดตัวแปร A-Z และ a-z;
        char A = 'A';
        char Z = 'Z';
        char a = 'a';
        char z = 'z';
        
        int num1 =  1;
        int num2 = 10;
        
        //สร้างตัวนำหน้า
        System.out.print(fname.toUpperCase().charAt(0)+""+Sname.toUpperCase().charAt(0));
        
        //วนลูปเพื่อสร้าง 2 ตัว
        for(int  i = 1;i < 3; i++){
        int up = (int)(Math.random()*(Z-A+1)+A);
        System.out.print((char)up);
        }
        //วนลูปเพื่อสร้าง 2 ตัว
        for(int  i = 1;i < 3; i++){
        int low = (int)(Math.random()*(z-a+1)+a);
        System.out.print((char)low);
        }
        //วนลูปเพื่อสร้าง 2 ตัว
        for(int  i = 1;i < 3; i++){
        int num = (int)(Math.random()*(num2-num1+1)+num1);
        System.out.print(num);
        }
        
        
        
        

       
        
       
        
        
    }
    
}