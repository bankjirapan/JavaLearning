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

        
        //System.out.println(e.getActionCommand());
    }

}
