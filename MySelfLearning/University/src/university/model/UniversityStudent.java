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

    public double expensePerSemester() {
        return 0;
    }

    @Override
    public String toString() {
        return "UniversityStudent{" + "educationSupportFee=" + educationSupportFee + ", scholarship=" + scholarship + ", alumni=" + alumni + '}';
    }

}
