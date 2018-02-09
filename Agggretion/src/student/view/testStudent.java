
package student.view;

/**
 *
 * @author bankcom
 */

//นำไฟล์เข้ามา 
import student.model.Address;
import student.model.Student;
public class testStudent {
    
    public static void main(String[] args) {
        
        Address bankAddrer = new Address("155","3","Prachautid","Bangkok","10140");
        
        Student bank = new Student(60130500012l,"Jirapan",bankAddrer);
        
        System.out.println(bank);
        
        //สมมุติมีค่าใหม่สามารถเอาค่าใหม่ใส่ไปได้
        Address BankNewAddr = new Address("157","4","Ratchadumnorn","Bangkok","10120");
        
        bank.setStdAddress(BankNewAddr);
        System.out.println(bank);
        
        
        //ทดลองเอา Areeya ย้ายเข้ามาบ้าน BankAddere 
        Student Areeya = new Student(1502,"Areeya",bankAddrer);
        
        System.out.println(Areeya);
        
        
        
        
        
        
    }
    
}
