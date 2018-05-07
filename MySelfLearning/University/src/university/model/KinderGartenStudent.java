
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

    public double getSchoolBusFee() {
        return schoolBusFee;
    }

    public void setSchoolBusFee(double schoolBusFee) {
        this.schoolBusFee = schoolBusFee;
    }

    public double getAnnualFee() {
        return annualFee;
    }

    public void setAnnualFee(double annualFee) {
        this.annualFee = annualFee;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public long getStudentId() {
        return StudentId;
    }

    public void setStudentId(long StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    @Override
    public String toString() {
        return "KinderGartenStudent{" + "schoolBusFee=" + schoolBusFee + ", annualFee=" + annualFee + ", parentName=" + parentName + '}';
    }

    
    
    
    
    
    
}
