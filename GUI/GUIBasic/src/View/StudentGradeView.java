package View;

import Controller.Calulate;
import guibasic.model.StudentCourse;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
    private JPanel jpanel;
    private JPanel jcalculate;

    public StudentGradeView(int numOfSubjects, StudentCourse[] myGrade) {

        //create array of label and Textfidels
        lblSubject = new JLabel[numOfSubjects];
        txtGrade = new JTextField[numOfSubjects];
        txtCredit = new JTextField[numOfSubjects];

        stdGrade = myGrade;
        initGui();

    }

    public void initGui() {
        FlowLayout flow = new FlowLayout();
        jcalculate = new JPanel();
        jcalculate.setLayout(flow);

        jcalculate.add(new JLabel("GPA"));
        txtGPA = new JTextField("0.00");
        jcalculate.add(txtGPA);

        btnCalulate = new JButton("Calulator");
        Calulate cal = new Calulate(txtGrade, txtCredit, txtGPA);
        btnCalulate.addActionListener(cal);
        jcalculate.add(btnCalulate);

        addSubjextsToFrame();

        JFrame FrameGrade = new JFrame("GPA Calulator");
        FrameGrade.setSize(100, 100);
        FrameGrade.add(jpanel, BorderLayout.NORTH);
        FrameGrade.add(jcalculate, BorderLayout.CENTER);
        FrameGrade.pack();
        FrameGrade.setLocationRelativeTo(null);
        FrameGrade.setVisible(true);
        FrameGrade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addSubjextsToFrame() {
        GridLayout grid = new GridLayout(7, 3);
        jpanel = new JPanel(new GridLayout());
        jpanel.setLayout(grid);

        //add header label
        jpanel.add(new JLabel("Subject"));
        jpanel.add(new JLabel("Grade"));
        jpanel.add(new JLabel("Credit"));
         //add Subject,grade,credit
        for (int index = 0; index < stdGrade.length; index++) {
            lblSubject[index] = new JLabel(stdGrade[index].getSubject());
            txtGrade[index] = new JTextField(stdGrade[index].getGrade());

            Float credit = stdGrade[index].getCredit();
            txtCredit[index] = new JTextField(credit.toString());

            jpanel.add(lblSubject[index]);
            jpanel.add(txtGrade[index]);
            jpanel.add(txtCredit[index]);
        }

    }

}
