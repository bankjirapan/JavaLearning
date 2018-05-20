/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeptiontotorial;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author bankcom
 */
public class ExeptionTotorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RunSoftware();
        //RunSoftwareThows();
    }

    public static void RunSoftware() {

        int PhoneNumber = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Your phone : ");

        try {
            PhoneNumber = sc.nextInt();

            System.out.println(PhoneNumber);

        } catch (InputMismatchException ex) {
            System.out.println("Errors " + ex);
            RunSoftware();

        } catch (RuntimeException re) {
            System.out.println(re);
        }

    }

    public static void RunSoftwareThows() throws InputMismatchException {

        int PhoneNumber = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Your phone : ");

        PhoneNumber = sc.nextInt();

        System.out.println(PhoneNumber);

    }

}
