package View;

import Controller.Calulate;
import guibasic.model.StudentCourse;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author INT105
 */
public class StudentGradeView {

    private JFrame freameGrade;
    private JLabel lblSubject[];
    private JTextField txtGrade[];
    private JTextField txtCredit[];
    private JButton btnCalulate;
    private StudentCourse[] stdGrade;
    private JTextField txtGPA;

    public StudentGradeView(int numOfSubjects, StudentCourse[] myGrade) {

        //create array of label and Textfidels
        lblSubject = new JLabel[numOfSubjects];
        txtGrade = new JTextField[numOfSubjects];
        txtCredit = new JTextField[numOfSubjects];
     
        stdGrade = myGrade;
        initGui();

    }

    public void initGui() {
        //create JFrame
        JFrame FrameGrade = new JFrame("GPA Calulator");
        FrameGrade.setSize(500, 500);

        //set Layout manager to JFream
        //replace default borderLayut width GridLayout
        GridLayout grid = new GridLayout(8, 3);
        FrameGrade.setLayout(grid);

        //add header label
        FrameGrade.add(new JLabel("Subject"));
        FrameGrade.add(new JLabel("Grade"));
        FrameGrade.add(new JLabel("Credit"));

        //add Subject,grade,credit
        for (int index = 0; index < stdGrade.length; index++) {
            lblSubject[index] = new JLabel(stdGrade[index].getSubject());
            txtGrade[index] = new JTextField(stdGrade[index].getGrade());

            Float credit = stdGrade[index].getCredit();
            txtCredit[index] = new JTextField(credit.toString());

            FrameGrade.add(lblSubject[index]);
            FrameGrade.add(txtGrade[index]);
            FrameGrade.add(txtCredit[index]);
        }
          FrameGrade.add(new JLabel("GPA"));
          txtGPA = new JTextField("0.00");
          FrameGrade.add(txtGPA);

        btnCalulate = new JButton("Calulator");
        Calulate cal = new Calulate();
        btnCalulate.addActionListener(cal);
        FrameGrade.add(btnCalulate);
        
        
        FrameGrade.setLocationRelativeTo(null);
        FrameGrade.setVisible(true);
        FrameGrade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
