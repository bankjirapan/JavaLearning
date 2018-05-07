
package university.model;

public class KinderGartenStudent extends Student{
    
    private double schoolBusFee;
    private double annualFee;
    private String parentName;

    public KinderGartenStudent(double schoolBusFee, double annualFee, String parentName) {
        this.schoolBusFee = schoolBusFee;
        this.annualFee = annualFee;
        this.parentName = parentName;
    }

    public KinderGartenStudent(double schoolBusFee, double annualFee, String parentName, long StudentId, String studentName, double tuition) {
        super(StudentId, studentName, tuition);
        this.schoolBusFee = schoolBusFee;
        this.annualFee = annualFee;
        this.parentName = parentName;
    }
    
     public  double expensePerSemester(){
         
         //ส่งค่ากลับ
         return this.tuition + this.schoolBusFee + this.annualFee;
         
     }

    @Override
    public String toString() {
        return "KinderGartenStudent{" + "studentID=" + super.StudentId + ", StudentName = " + super.studentName + ", tuiltion = " + super.tuition + '}';
    }

    
    
    
    
    
    
}
