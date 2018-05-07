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
     
    public Student(long StudentId, String studentName, double tuition) {
        this.StudentId = StudentId;
        this.studentName = studentName;
        this.tuition = tuition;
    }

    public abstract double expensePerSemester();


    @Override
    public String toString() {
        return "Student{" + "StudentId=" + StudentId + ", studentName=" + studentName + ", tuition=" + tuition + '}';
    }
    
    
    
    
}
