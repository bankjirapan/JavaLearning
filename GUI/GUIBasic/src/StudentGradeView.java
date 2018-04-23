
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

    public StudentGradeView(int numOfSubjects) {

            //create array of label and Textfidels
            lblSubject = new JLabel[numOfSubjects];
            txtGrade = new JTextField[numOfSubjects];
            txtCredit = new JTextField[numOfSubjects];
            initGui();

    }
    
    
    public void initGui(){
        JFrame FrameGrade = new JFrame("GPA Calulator");
        FrameGrade.setSize(500,500);
        FrameGrade.setVisible(true);
        FrameGrade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
  
    
    
}
