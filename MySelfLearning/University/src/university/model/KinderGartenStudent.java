
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
         return 0;
     }

    @Override
    public String toString() {
        return "KinderGartenStudent{" + "schoolBusFee=" + schoolBusFee + ", annualFee=" + annualFee + ", parentName=" + parentName + '}';
    }

    
    
    
    
    
    
}
