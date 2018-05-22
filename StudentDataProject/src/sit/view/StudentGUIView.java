/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import sit.controller.ButtonListener;
import sit.controller.StudentController;
import sit.controller.StudentSelectionListener;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class StudentGUIView {

    //สร้าง Frema ขึ้นมา
    private JFrame frameStudent;

//------------------------------------วาด panel อยู่ฝั่งซ้าย ----------------------------------------------------
    private JPanel jpnStudentRecord;
    private JPanel jpnBotton;
//------------------ ----------------อยู่ใน jpnStudentLeft -----------------------------------------------------
    // private JPanel jpnStudentTable;
    private JPanel jpnStudentLeft;
    
    private JTextField txtStdFirstName;
    private JTextField txtStdLastName;
    private JTextField txtStdId;
    
    private JButton btnSave;
    private JButton btnSaveAs;
    private JButton btnReset;
    
    private JTable tblStudent;
    private JScrollPane scrlStudent;
    
    public StudentGUIView() throws ClassNotFoundException, SQLException, IOException {
        initGUI();
    }
    
    private void initGUI() throws ClassNotFoundException, SQLException, IOException {
        frameStudent = new JFrame("Student List");
        jpnStudentRecord = new JPanel(new GridLayout(3, 2));
        
        jpnStudentRecord.add(new JLabel("Student ID "));
        txtStdId = new JTextField();
        jpnStudentRecord.add(txtStdId);
        
        jpnStudentRecord.add(new JLabel("First name"));
        txtStdFirstName = new JTextField();
        jpnStudentRecord.add(txtStdFirstName);
        
        jpnStudentRecord.add(new JLabel("Last name"));
        txtStdLastName = new JTextField();
        jpnStudentRecord.add(txtStdLastName);
        
        jpnBotton = new JPanel();
        btnSave = new JButton("Save");
        btnSaveAs = new JButton("Save As Object");
        btnReset = new JButton("Reset");

        //บันทวกกกกกกกกกกก
        ButtonListener btnAction = new ButtonListener(txtStdId, txtStdFirstName, txtStdLastName);
        btnSave.addActionListener(btnAction);
        btnSaveAs.addActionListener(btnAction);
        btnReset.addActionListener(btnAction);
        
        jpnBotton.add(btnSave);
        jpnBotton.add(btnSaveAs);
        jpnBotton.add(btnReset);
        
        jpnStudentLeft = new JPanel(new BorderLayout());
        jpnStudentLeft.add(jpnStudentRecord, BorderLayout.NORTH);
        jpnStudentLeft.add(jpnBotton, BorderLayout.CENTER);
        
        loadStudentDataToJTable();
        
        frameStudent.add(jpnStudentLeft, BorderLayout.WEST);
        frameStudent.add(scrlStudent, BorderLayout.CENTER);
        frameStudent.setSize(700, 400);
        frameStudent.setVisible(true);
        frameStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void loadStudentDataToJTable() throws ClassNotFoundException, SQLException, IOException {
        
        String[] columnHeader = {"Stduent Id", "First Name", "Last Name"};
        StudentController sctrl = new StudentController("sit", "sit");
        ArrayList<Student> list = sctrl.selectStudent();
        
        String[][] stdList = new String[list.size()][columnHeader.length];
        
        for (int i = 0; i < stdList.length; i++) {
            stdList[i][0] = (list.get(i).getStdId()) + "";
            stdList[i][1] = (list.get(i).getFirstname());
            stdList[i][2] = (list.get(i).getLastname());
            
        }

        //นำ Array สองมิติเข้ามา
        tblStudent = new JTable(stdList, columnHeader);

        //SetMode
        tblStudent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        StudentSelectionListener ssl = new StudentSelectionListener(tblStudent, txtStdId, txtStdFirstName, txtStdLastName);
        
        tblStudent.getSelectionModel().addListSelectionListener(ssl);
        
        scrlStudent = new JScrollPane(tblStudent);
        
    }
}
