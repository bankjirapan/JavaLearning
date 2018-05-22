package sit.view;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import sit.controller.StudentController;
import sit.db.ConnectionManager;
import sit.model.Student;

public class TestStudent {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        /*
       
        ArrayList<Student> stdList = sctrl.selectStudent();
        for(Student student : stdList){
        System.out.println(student);
        }
        }
        */
        StudentGUIView stdView = new StudentGUIView();
    }

}
