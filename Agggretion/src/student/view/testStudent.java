
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
        
        Address bankAddrer = new Address("99","3","Prachautid","Bangkok","10140");
        
        Student bank = new Student(60130500012l,"Jirapan",bankAddrer);
        
        System.out.println(bank);
        
        
        
        
    }
    
}
