/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeptiontotorial;

import java.util.Scanner;


/**
 *
 * @author bankcom
 */
public class ExceptionTypeThows {

    public static void main(String[] args) {

        String PhoneNumber;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Your phone : ");
            PhoneNumber = sc.next();
            handlerException(PhoneNumber);

        } catch (testException ae) {
            System.out.println(ae);
        }

    }

    public static void handlerException(String txt) throws testException {
  
        int Zero = (int) '0';
        int Nigt = (int) '9';

        for (int i = 0; i < txt.length(); i++) {

            if (txt.charAt(i) < Zero || txt.charAt(i) > Nigt) {
                throw new testException("Error not a number");
            } 
        }
        System.out.println(txt);
    }

}
