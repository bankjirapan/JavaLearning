/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author INT105
 */
public class StudentSelectionListener implements ListSelectionListener {

    private JTextField txtStdId;
    private JTextField txtStdFirstName;
    private JTextField txtStdLastName;
    private JTable tblStudent;

        public StudentSelectionListener(
                JTable tblStudent,
                JTextField txtStdId,
                JTextField txtStdFirstName,
                JTextField txtStdLastName
        ) {
            this.txtStdId = txtStdId;
            this.txtStdFirstName = txtStdFirstName;
            this.txtStdLastName = txtStdLastName;
            this.tblStudent = tblStudent;
        }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedRow = tblStudent.getSelectedRow();
        //System.out.println();
        String stdId = (String) (tblStudent.getValueAt(selectedRow, 0));
        String stdFirstName = (String) (tblStudent.getValueAt(selectedRow, 1));
        String stdLastName = (String) (tblStudent.getValueAt(selectedRow, 2));
        System.out.println(stdId+" "+ stdFirstName+" "+ stdLastName);
        this.txtStdId.setText(stdId);
        this.txtStdFirstName.setText(stdFirstName);
        this.txtStdLastName.setText(stdLastName);
    }

}
