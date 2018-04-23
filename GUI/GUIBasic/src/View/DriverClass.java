/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import guibasic.model.StudentCourse;

/**
 *
 * @author INT105
 */
public class DriverClass {
    
    public static void main(String[] args) {
        StudentCourse MyGrade[] = new StudentCourse[6];
        MyGrade[0] = new StudentCourse("INT106",3,"A");
        MyGrade[1] = new StudentCourse("INT105",3,"A");
        MyGrade[2] = new StudentCourse("INT104",3,"A");
        MyGrade[3] = new StudentCourse("INT103",3,"A");
        MyGrade[4] = new StudentCourse("INT102",3,"A");
        MyGrade[5] = new StudentCourse("INT101",3,"A");
       
        
        StudentGradeView sgv = new StudentGradeView(6,MyGrade);
    }
    
    
}
