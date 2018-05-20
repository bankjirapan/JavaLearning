/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learbasicjava;

import java.util.Scanner;

/**
 *
 * @author bankcom
 */
public class LearBasicJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String txt;
        String result;
        

        int count = 0;
        int sum = 0;
        int num = 0;
        

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Phone : ");
        txt = sc.next();
     

       
        for (int i = 0; i < txt.length(); i++) {
            
            sum += Integer.parseInt(""+txt.charAt(i));
            switch (txt.charAt(i)) {
                case '0':
                    count++;
                    break;

            }
        
            
            

        
        // TODO code application logic here
    }

        System.out.println(sum);

            switch (sum % 3) {
                case 0:
                    result = "คุณโชคดี";
                    break;
                case 1:
                    result = "เกือบโชคดี";
                    break;
                default:
                    result = "ไม่โชคดีเลย";
                    break;
            }
        
            System.out.println("Result : "+result);
    }
}
