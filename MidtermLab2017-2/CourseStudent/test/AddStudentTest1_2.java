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
public class AddStudentTest1_2 {

    private Course course;

    @Test
    public void addOneStudentThenStudentAddedToArray() {
        course = new Course("Miracle Of Life", 5);
        RegisStudent addedStudent = new RegisStudent(1, "SomChai");
        course.addStudent(addedStudent);
        RegisStudent[] actual = course.getStudents();
        assertEquals(addedStudent, actual[0]);
    }

    @Test
    public void addOneStudentThenReturnAddedIndex() {
        course = new Course("Miracle Of Life", 5);
        RegisStudent addedStudent = new RegisStudent(1, "SomChai");
        int addedIndex = course.addStudent(addedStudent);

        assertEquals(0, addedIndex);
    }

    @Test
    public void addDuplicatedStudentsThenReturnNumberOfStudentsNotUpdate() {
        course = new Course("Miracle Of Life", 3);
        RegisStudent addedStudent1 = new RegisStudent(1, "SomChai");
        RegisStudent addedStudent2 = new RegisStudent(1, "SomChai");
        RegisStudent addedStudent3 = new RegisStudent(3, "SomBat");
        course.addStudent(addedStudent1);
        course.addStudent(addedStudent2);
        course.addStudent(addedStudent3);
        assertEquals(2, course.getNumberOfStudents());
    }

    @Test
    public void addStudentsThenReturnNumberOfStudentsIncrease() {
        course = new Course("Miracle Of Life", 3);
        RegisStudent addedStudent1 = new RegisStudent(1, "SomChai");
        RegisStudent addedStudent2 = new RegisStudent(2, "SomSri");
        RegisStudent addedStudent3 = new RegisStudent(3, "SomBat");
        course.addStudent(addedStudent1);
        course.addStudent(addedStudent2);
        course.addStudent(addedStudent3);
        assertEquals(3, course.getNumberOfStudents());
    }

    @Test
    public void addOneStudentToFullArrayThenReturnMinusOne() {
        course = new Course("Miracle Of Life", 1);
        RegisStudent addedStudent = new RegisStudent(1, "SomChai");
        course.addStudent(addedStudent);
        int addedIndex = course.addStudent(addedStudent);
        assertEquals(-1, addedIndex);
    }

}
