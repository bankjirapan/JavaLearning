/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class ButtonListener implements ActionListener {

    private JTextField txtStdId;
    private JTextField txtStdFirstName;
    private JTextField txtStdLastName;

    public ButtonListener(
            JTextField txtStdId,
            JTextField txtStdFirstName,
            JTextField txtStdLastName
    ) {
        this.txtStdId = txtStdId;
        this.txtStdFirstName = txtStdFirstName;
        this.txtStdLastName = txtStdLastName;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String btnCommand = e.getActionCommand();
        if (btnCommand.equalsIgnoreCase("Reset")) {

            System.out.println("Reset..");

            txtStdId.setText("");
            txtStdFirstName.setText("");
            txtStdLastName.setText("");

        } else if (btnCommand.equalsIgnoreCase("Save")) {

            System.out.println("save...");

            Save();

        } else if (btnCommand.equalsIgnoreCase("Save As Object")) {
            System.out.println("save as...");
            SaveAs();
        }
    }

    public void Save() {
        try {
            FileOutputStream fos = new FileOutputStream("student.bank", true);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(Integer.parseInt(txtStdId.getText()));
            dos.writeUTF(txtStdFirstName.getText());
            dos.writeUTF(txtStdLastName.getText());
            dos.close();
        } catch (FileNotFoundException ex) {

            System.out.println(ex);
        } catch (IOException io) {
            System.out.println(io);
        }

    }

    public void SaveAs() {
        try {
            FileOutputStream fos = new FileOutputStream("student-object.bank");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            int stdId = Integer.parseInt(txtStdId.getText());
            String stdFirstName = txtStdFirstName.getText();
            String stdLastName = txtStdLastName.getText();
            
            
            Student std = new Student(stdId,stdFirstName,stdLastName);
            
            
            
            oos.writeObject(std);
            oos.close();
            
        } catch (FileNotFoundException ex) {

            System.out.println(ex);
        } catch (IOException io) {
            System.out.println(io);
        }

    }

}
