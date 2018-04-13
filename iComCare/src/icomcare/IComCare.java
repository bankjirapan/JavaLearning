package icomcare;

/**
 *
 * @author bankcom
 */
import icomcare.controller.icomcareController;
import icomcare.model.addRepair;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class IComCare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // runiComCare();
            System.out.print("สถานะการเชื่อมต่อฐานข้อมูล : ");
            icomcareController icomcare = new icomcareController();

            runiComCare();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException SQLEx) {
            System.out.println(SQLEx);
        }
    }

    public static void runiComCare() throws ClassNotFoundException, SQLException {
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

    public static void Loggedin() throws ClassNotFoundException, SQLException {

        //Import Scanner into project
        Scanner sc = new Scanner(System.in);
        int functionSelect = 99;
        System.out.println(" -- Welcome Administrator -- ");

        System.out.println("กรุณาเลือกการทำงาน \n 1: งานแจ้งซ่อม \n 2: ลบ/แก้ไข การแจ้งซ่อม \n 3: ค้นหาข้อมูล \n 4: แสดงการแจ้งซ่อมทั้งหมด \n 5: ออกจากระบบ \n 0: ออกจากโปรแกรม");

        System.out.print("เลือกเมนู : ");
        functionSelect = sc.nextInt();

        switch (functionSelect) {
            case 1:
                RepairComputer();
                break;
            case 2:
                ManagesRepair();
                break;
            case 3:
                SearchData();
                break;
            case 4:
                ShowAllDATA();
                break;
            case 5:
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

    public static void RepairComputer() throws ClassNotFoundException, SQLException, InputMismatchException {
        int RepairRun = 1;
        Random rand = new Random();
        int numOfItem = rand.nextInt(99999) + 1;
        Scanner sc = new Scanner(System.in);

        addRepair addrepair = new addRepair();
        icomcareController icomcare = new icomcareController();

        System.out.println("------- แจ้งซ่อมสินค้า -------");

        while (RepairRun != 0) {
            System.out.println("หมายเลขแจ้งซ่อมคือ : " + numOfItem);
            addrepair.setNumOfItem(numOfItem);
            System.out.print("ชื่อผู้แจ้งซ่อม : ");
            addrepair.setNameCustomer(sc.next());
            System.out.print("สินค้าแจ้งซ่อม : ");
            addrepair.setItemRepair(sc.next());
            System.out.print("ประเภท : ");
            addrepair.setCategory(sc.next());
            System.out.print("คำอธิบาย : ");
            addrepair.setDiscription(sc.next());
            System.out.print("อาการเสีย : ");
            addrepair.setAnalyzeWaste(sc.next());
            System.out.print("วิธีซ่อม : ");
            addrepair.setSolution(sc.next());
            System.out.print("วันที่รับซ่อม : ");
            addrepair.setDateOfRepair(sc.next());
            System.out.print("กำหนดวันส่งซ่อม : ");
            addrepair.setDateSend(sc.next());
            System.out.print("ประเมินราคา : ");

            try {
                addrepair.setPrice(sc.nextDouble());
            } catch (InputMismatchException inputError) {
                System.out.println("aaa");
            }

            RepairRun = 0;

            int insertRepair = icomcare.addRepair(addrepair);
            System.out.println("เพิ่มรายการแล้ว " + insertRepair);
        }

        Loggedin();
    }

    public static void SearchData() throws ClassNotFoundException, SQLException {
        System.out.println("ค้นหาข้อมูล");
    }

    public static void ShowAllDATA() throws ClassNotFoundException, SQLException {
        icomcareController icomcare = new icomcareController();
        System.out.println(
                "------------------------------- \n"
                + "++++ รายชื่อการแจ้งซ๋อมทั้งหมด ++++ \n"
                + "-------------------------------");
        System.out.println(icomcare.ShowAllDATA());
        Loggedin();
    }

    public static void ManagesRepair() throws ClassNotFoundException, SQLException {
        icomcareController icomcare = new icomcareController();
        Scanner sc = new Scanner(System.in);
        int NoExitLoop = 1;
        int UserSelect = 0;
        int RepairRun = 1;
        int numOfItemDelete;
        int numOfUpdate;
        addRepair addrepair = new addRepair();

        System.out.println("จัดการการแจ้งซ๋อม");
        System.out.println(
                "------------------------------- \n"
                + "++++ รายชื่อการแจ้งซ๋อมทั้งหมด ++++ \n"
                + "-------------------------------");

        System.out.println(icomcare.ShowSameData());

        while (NoExitLoop != 0) {

            System.out.println("******** เลือกเมนู *******");
            System.out.println("1: แก้ไขข้อมูลแจ้งซ่อม \n2: ลบข้อมูลแจ้งซ่อม \n0:กลับสู่เมนูหลัก");
            System.out.print("เลือกเมนู : ");
            UserSelect = sc.nextInt();

            if (UserSelect == 1) {

                System.out.print("กรุณาใส่หมายเลขแจ้งซ่อมที่จะแก้ไข : ");
                numOfUpdate = sc.nextInt();
                int CheckEmtye = icomcare.CheckData(numOfUpdate);
                if (CheckEmtye == 0) {
                    System.out.println("ไม่สามารถแก้ไขได้ไม่พบข้อมูลดังเกล่า");
                } else {
                    while (RepairRun != 0) {
                        System.out.println("------- แก้ไข -------- ");
                        System.out.println("หมายเลขแจ้งซ่อมคือ : " + numOfUpdate);
                        System.out.print("ชื่อผู้แจ้งซ่อม : ");
                        addrepair.setNameCustomer(sc.next());
                        System.out.print("สินค้าแจ้งซ่อม : ");
                        addrepair.setItemRepair(sc.next());
                        System.out.print("ประเภท : ");
                        addrepair.setCategory(sc.next());
                        System.out.print("คำอธิบาย : ");
                        addrepair.setDiscription(sc.next());
                        System.out.print("อาการเสีย : ");
                        addrepair.setAnalyzeWaste(sc.next());
                        System.out.print("วิธีซ่อม : ");
                        addrepair.setSolution(sc.next());
                        System.out.print("วันที่รับซ่อม : ");
                        addrepair.setDateOfRepair(sc.next());
                        System.out.print("กำหนดวันส่งซ่อม : ");
                        addrepair.setDateSend(sc.next());
                        System.out.print("ประเมินราคา : ");

                        try {
                            addrepair.setPrice(sc.nextDouble());
                        } catch (InputMismatchException inputError) {
                            System.out.println("aaa");
                        }

                        RepairRun = 0;

                        int UpdateData = icomcare.UpdateData(numOfUpdate, addrepair);
                        System.out.println("เพิ่มรายการแล้ว " + UpdateData);
                    }

                }

            } else if (UserSelect == 2) {
                System.out.print("กรุณาใส่หมายเลขแจ้งซ่อมที่จะลบ : ");
                numOfItemDelete = sc.nextInt();
                icomcare.DeleteRepair(numOfItemDelete);
                System.out.println("ลบข้อมูล : " + numOfItemDelete + " แล้ว");
            } else if (UserSelect == 0) {
                NoExitLoop = 0;
            }
        }
        Loggedin();
    }

    public static void ExitiComCare() {
        System.out.println("Good bye");
    }

}
