/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibasic.model;

/**
 *
 * @author INT105
 */
public class StudentCourse {

    //private Course course;
    private String subject;
    private float credit;
    private String grade;

    public StudentCourse(String subject, float credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public StudentCourse() {
    }

    public float CovertGrade() {
        float value = -1;

        switch (grade) {
            
            case "A" : value = 4; break;
            case "B+":value =  3.5f; break;
            case "B" : value = 3; break;
            case "C+" : value = 2.5f; break;
            case "C" : value = 2; break;
            case "D+" : value = 1.5f; break;
            case "D" : value = 1; break;
            case "F" : value = 0; break;
        }
        
        return value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentCourse{" + "subject=" + subject + ", credit=" + credit + ", grade=" + grade + '}';
    }

}
