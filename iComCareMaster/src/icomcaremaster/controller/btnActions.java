/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcaremaster.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author bankcom
 */
public class btnActions implements ActionListener {

    private JTextField txtUsername;
    private JTextField txtPassword;
    private JTextField txtName;
    private JTextField txtAddr;

    public btnActions(JTextField txtUsername, JTextField txtPassword, JTextField txtName, JTextField txtAddr) {
        this.txtUsername = txtUsername;
        this.txtPassword = txtPassword;
        this.txtName = txtName;
        this.txtAddr = txtAddr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Click Create");

        Random rand = new Random();
        int id = rand.nextInt(999) + 1;

        try {
            MainController mainCon = new MainController();

            mainCon.RegisnewUser(id, txtUsername.getText(), txtPassword.getText(), txtName.getText(), txtAddr.getText());
            System.out.println("Ok");

        } catch (SQLException sql) {
            System.out.println(sql);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

    }

}
