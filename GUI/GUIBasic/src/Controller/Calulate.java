/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author INT105
 */
public class Calulate implements ActionListener {

    private JTextField txtGrade[];
    private JTextField txtCredit[];
    private JTextField txtGPA;

    public Calulate(JTextField[] txtGrade, JTextField[] txtCredit, JTextField txtGPA) {
        this.txtGrade = txtGrade;
        this.txtCredit = txtCredit;
        this.txtGPA = txtGPA;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        float gpa = 0;
        float totalCredit = 0;
        float totalGrade = 0;

        for (int i = 0; i < txtGrade.length; i++) {
            float grade = convertLetterGradeToNumber(txtGrade[i].getText());
            float credit = Float.parseFloat(txtCredit[i].getText());
            totalGrade += grade * credit;
            totalCredit += credit;

        }
        gpa = totalGrade / totalCredit;
        txtGPA.setText(gpa + "");
        //System.out.println(e.getActionCommand());
    }

    private float convertLetterGradeToNumber(String grade) {
        float value = -1;

        switch (grade) {

            case "A":
                value = 4;
                break;
            case "B":
                value = 3;
                break;
            case "C":
                value = 2;
                break;
            case "D":
                value = 1;
                break;
            case "F":
                value = 0;
                break;
        }

        return value;
    }

}
