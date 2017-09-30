package test;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        String six_password = "";
        String input_password = "";
        //สร้างตัวแปรเพื่อรับค่า
        System.out.print("Please enter a 6 character password : ");
        Scanner input = new Scanner(System.in);

        input_password = input.next();

        //Sub String 6 char
        //ตรวจสอบว่ากรอกเกิน6 หรือ ไม่ หรือไม่ถึง
        int lenght_input;

        lenght_input = input_password.length();

        //ใช้หลักการวนลูบบบบ
        while (lenght_input <= 5) {
            System.out.print("Sorry try again ! your password is less than 6 characters : ");
            input_password = input.next();
            lenght_input = input_password.length();
        }

        if (lenght_input >= 6) {
            six_password = input_password.substring(0, 6);
        }

        System.out.println("Password Original : "+six_password);
        
        //แสดงผลออกมา
        System.out.print("New yuor Password : ");
        System.out.print(Change_char(six_password.charAt(5)));
        System.out.print(Change_char(six_password.charAt(4)));
        System.out.print(Change_char(six_password.charAt(3)));
        System.out.print(Change_char(six_password.charAt(2)));
        System.out.print(Change_char(six_password.charAt(1)));
        System.out.println(Change_char(six_password.charAt(0)));

//        int bank = 32;
//
//        //แปลงเป็น char แยกออกมาทีละตัว
//        int a1;
//        int a2;
//        int a3;
//        int a4;
//        int a5;
//        int a6;
//        
//        int b1 = 0;
//        a1 = six_password.charAt(0);
//        a2 = six_password.charAt(1);
//        a3 = six_password.charAt(2);
//        a4 = six_password.charAt(3);
//        a5 = six_password.charAt(4);
//        a6 = six_password.charAt(5);
//        
//        if(a1 < 90){
//            b1 = a1+32;
//        }
//
//        System.out.println(b1);
    }

    public static char Change_char(char input_method){
     if(Character.isUpperCase(input_method)){
         return (char)(input_method + 32);
     } else 
     if(Character.isLowerCase(input_method))
     {
         return (char)(input_method - 32);
     }
     
     return input_method;

}
}

