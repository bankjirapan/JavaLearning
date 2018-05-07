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
public abstract class Student {

    protected long StudentId;
    protected String studentName;
    protected double tuition;

    public Student() {
    }
    
    public abstract double expensePerSemester();

    
    public Student(long StudentId, String studentName, double tuition) {
        this.StudentId = StudentId;
        this.studentName = studentName;
        this.tuition = tuition;
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
        return "Student{" + "StudentId=" + StudentId + ", studentName=" + studentName + ", tuition=" + tuition + '}';
    }
    
    
    
    
}
