package exeptiontotorial.Odd;

import java.util.Scanner;

public class ExeptionCheckOdd {

    public static void main(String[] args) {

        int PhoneNumber;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Number : ");
            PhoneNumber = sc.nextInt();
            
            HandlerCheckOdd(PhoneNumber);
            
        } catch (OddNumberException od) {
            System.out.println(od);
        }

    }

    public static void HandlerCheckOdd(int Phone) throws OddNumberException {

        if (Phone % 2 == 1) {
            throw new OddNumberException("Invalid Input");
        }

        System.out.println("Your Number " + Phone);
    }

}
