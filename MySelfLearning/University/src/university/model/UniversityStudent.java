/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.model;

/**
 *
 * @author INT105
 */
public class UniversityStudent extends Student {

    private double educationSupportFee;
    private boolean scholarship;
    private boolean alumni;

    public UniversityStudent(double educationSupportFee, boolean scholarship, boolean alumni) {
        this.educationSupportFee = educationSupportFee;
        this.scholarship = scholarship;
        this.alumni = alumni;
    }

    public UniversityStudent(double educationSupportFee, boolean scholarship, boolean alumni, long StudentId, String studentName, double tuition) {
        super(StudentId, studentName, tuition);
        this.educationSupportFee = educationSupportFee;
        this.scholarship = scholarship;
        this.alumni = alumni;
    }

    public double getEducationSupportFee() {
        return educationSupportFee;
    }

    public void setEducationSupportFee(double educationSupportFee) {
        this.educationSupportFee = educationSupportFee;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public boolean isAlumni() {
        return alumni;
    }

    public void setAlumni(boolean alumni) {
        this.alumni = alumni;
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

    public double expensePerSemester() {
        return 0;
    }

    @Override
    public String toString() {
        return "UniversityStudent{" + "educationSupportFee=" + educationSupportFee + ", scholarship=" + scholarship + ", alumni=" + alumni + '}';
    }

}
