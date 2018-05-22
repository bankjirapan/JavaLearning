/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcaremaster.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author bankcom
 */
public class LoginView {

    public LoginView() {

        MainFrame();

    }

    public static void MainFrame() {

        JFrame Login = new JFrame();

        JLabel WelcomeLogin = new JLabel("Welcome to iComCare");

        //สร้าง Panel
        JPanel MainPanel = new JPanel();
   

        //ตั้งค่า Panel
        MainPanel.add(WelcomeLogin);
        
        

        Login.add(MainPanel);
        //New Frame 
        Login.setSize(500, 500);
        Login.setLocationRelativeTo(Login);
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login.setVisible(true);

    }

}
