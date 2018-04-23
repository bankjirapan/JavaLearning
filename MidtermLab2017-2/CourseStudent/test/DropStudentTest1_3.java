/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import sit.model.Course;
import sit.model.RegisStudent;

/**
 *
 * @author User
 */
public class DropStudentTest1_3 {
    private Course course;
    
 
  @Test
    public void dropStudentWhoDoesNotRegisterThenReturnFalse(){
        course=new Course("Miracle Of Life", 1);
        RegisStudent addedStudent1=new RegisStudent(1, "SomChai");
        course.addStudent(addedStudent1);
        RegisStudent dropStd=new RegisStudent(2, "SomSri");
        boolean result=course.dropStudent(dropStd);
        assertEquals(false,result);
    }
    
    @Test
    public void dropStudentWhenNoStudentInArrayThenReturnFalse(){
        course=new Course("Miracle Of Life", 1);
        RegisStudent dropStd=new RegisStudent(2, "SomSri");
        boolean result=course.dropStudent(dropStd);
        assertEquals(false,result);
    }
    
    @Test
    public void dropStudentSuccessWhenStudentInArrayThenReturnTrue(){
        course=new Course("Miracle Of Life", 3);
        RegisStudent addedStudent1=new RegisStudent(1, "SomChai");
        RegisStudent addedStudent2=new RegisStudent(2, "SomSri");
        RegisStudent addedStudent3=new RegisStudent(3, "SomBat");
        course.addStudent(addedStudent1);
        course.addStudent(addedStudent2);
        course.addStudent(addedStudent3);
        
        RegisStudent dropStd=new RegisStudent(1, "SomChai");
        boolean result=course.dropStudent(dropStd);
        assertEquals(true,result);
    }
    
    @Test
    public void dropStudentSuccessWhenStudentInArrayThenNumberOfStudentsDecrease(){
        course=new Course("Miracle Of Life", 4);
        RegisStudent addedStudent1=new RegisStudent(1, "SomChai");
        RegisStudent addedStudent2=new RegisStudent(2, "SomSri");
        RegisStudent addedStudent3=new RegisStudent(3, "SomBat");
        RegisStudent addedStudent4=new RegisStudent(4, "SomRak");
        course.addStudent(addedStudent1);
        course.addStudent(addedStudent2);
        course.addStudent(addedStudent3);
        course.addStudent(addedStudent4);
        
        RegisStudent dropStd=new RegisStudent(1, "SomChai");
        course.dropStudent(dropStd);
        int numOfStd=course.getNumberOfStudents();
        assertEquals(3,numOfStd);
    }
    
    @Test
    public void dropStudentSuccessThenStudentShouldBeShifted(){
        course=new Course("Miracle Of Life", 4);
        RegisStudent addedStudent1=new RegisStudent(1, "SomChai");
        RegisStudent addedStudent2=new RegisStudent(2, "SomSri");
        RegisStudent addedStudent3=new RegisStudent(3, "SomBat");
        RegisStudent addedStudent4=new RegisStudent(4, "SomRak");
        course.addStudent(addedStudent1);
        course.addStudent(addedStudent2);
        course.addStudent(addedStudent3);
        course.addStudent(addedStudent4);
        
        RegisStudent dropStd=new RegisStudent(1, "SomChai");
        course.dropStudent(dropStd);
        
        RegisStudent updatedStudent5=new RegisStudent(2, "SomSri");
        RegisStudent updatedStudent6=new RegisStudent(3, "SomBat");
        RegisStudent updatedStudent7=new RegisStudent(4, "SomRak");
        RegisStudent updatedStudent8=new RegisStudent(4, "SomRak");
        RegisStudent [] updatedStudent={updatedStudent5, updatedStudent6,updatedStudent7,updatedStudent8 };
        
        assertArrayEquals(updatedStudent,course.getStudents());
    }
    @Test
    public void dropLastStudentSuccessThenStudentShouldBeShifted(){
        course=new Course("Miracle Of Life", 4);
        RegisStudent addedStudent1=new RegisStudent(1, "SomChai");
        RegisStudent addedStudent2=new RegisStudent(2, "SomSri");
        RegisStudent addedStudent3=new RegisStudent(3, "SomBat");
        RegisStudent addedStudent4=new RegisStudent(4, "SomRak");
        course.addStudent(addedStudent1);
        course.addStudent(addedStudent2);
        course.addStudent(addedStudent3);
        course.addStudent(addedStudent4);
        
        RegisStudent dropStd=new RegisStudent(4, "SomRak");
        course.dropStudent(dropStd);
        
        RegisStudent updatedStudent5=new RegisStudent(1, "SomChai");
        RegisStudent updatedStudent6=new RegisStudent(2, "SomSri");
        RegisStudent updatedStudent7=new RegisStudent(3, "SomBat");
        RegisStudent updatedStudent8=new RegisStudent(4, "SomRak");
        RegisStudent [] updatedStudent={updatedStudent5, updatedStudent6,updatedStudent7,updatedStudent8 };
        
        assertArrayEquals(updatedStudent,course.getStudents());
    }
    @Test
    public void dropLastStudentSuccessThenNumberOfStudentsDecrease(){
        course=new Course("Miracle Of Life", 4);
        RegisStudent addedStudent1=new RegisStudent(1, "SomChai");
        RegisStudent addedStudent2=new RegisStudent(2, "SomSri");
        RegisStudent addedStudent3=new RegisStudent(3, "SomBat");
        RegisStudent addedStudent4=new RegisStudent(4, "SomRak");
        course.addStudent(addedStudent1);
        course.addStudent(addedStudent2);
        course.addStudent(addedStudent3);
        course.addStudent(addedStudent4);
        
        RegisStudent dropStd=new RegisStudent(4, "SomRak");
        course.dropStudent(dropStd);
      
        
        assertEquals(3,course.getNumberOfStudents());
    }    
}
