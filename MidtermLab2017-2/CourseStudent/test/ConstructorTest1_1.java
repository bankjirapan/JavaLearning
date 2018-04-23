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
public class ConstructorTest1_1 {
    private Course course;
    
    @Test
    public void newCourseThenCourseNameAdded(){
        course=new Course("Miracle Of Life", 5); 
        String actual=course.getCourseName();
        assertEquals("Miracle Of Life", actual);
    }
    
    @Test
    public void newCourseThenArrayCreatedWiththeSizeOfRegisStudents(){
        course=new Course("Miracle Of Life", 5); 
        RegisStudent[] actual=course.getStudents();
        assertEquals(5, actual.length);
        
    }
    
   
}
