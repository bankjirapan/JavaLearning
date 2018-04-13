package icomcare;

/**
 *
 * @author bankcom
 */
import icomcare.controller.icomcareController;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IComCare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // runiComCare();
            icomcareController icomcare = new icomcareController();
            runiComCare();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException SQLEx) {
            System.out.println(SQLEx);
        }
    }

    public static void runiComCare() {
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

        //Import Scanner into project
        Scanner sc = new Scanner(System.in);
        int functionSelect = 99;
        System.out.println(" -- Welcome Administrator -- ");

        System.out.println("กรุณาเลือกการทำงาน \n 1: งานแจ้งซ่อม \n 2: งานขาย \n 3: ออกจากระบบ \n 0: ออกจากโปรแกรม");

        System.out.print("เลือกเมนู : ");
        functionSelect = sc.nextInt();

        switch (functionSelect) {
            case 1:
                RepairComputer();
                break;
            case 2:
                SaleItem();
                break;
            case 3:
                runiComCare();
                break;
            case 0:
                ExitiComCare();
                break;
            default:
                Loggedin();
                break;
        }

    }

    public static void RepairComputer() {
        System.out.println("แจ้งซ่อมสินค้า");
    }

    public static void SaleItem() {
        System.out.println("งานขายสินค้า");
        System.out.println(
                "------------------------------- \n"
                + "++++ อยู่ระหว่างการพัฒนา ++++ \n"
                + "-------------------------------");

        Loggedin();
    }

    public static void ExitiComCare() {
        System.out.println("Good bye");
    }

}
