package icomcare;

/**
 *
 * @author bankcom
 */
import java.util.Scanner;

public class IComCare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String Username = "admin";
        String Password = "admin";
        String User;
        String Pass;
        int Loggedin = 0;

        //Import Scanner into project
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to iComCare - Manages Computershop === \n");

        while (Loggedin != 1) {
            System.out.print("Please Login \n");
            System.out.print("Username : ");
            User = sc.next();
            System.out.print("Password : ");
            Pass = sc.next();

            if (User.equalsIgnoreCase(Username) && Pass.equalsIgnoreCase(Password)) {
                Loggedin = 1;
                Loggedin();
            } else {
                Loggedin = 0;
            }
        }

    }

    public static void Loggedin() {
        System.out.println(" -- Welcome Administrator -- ");
    }

}
