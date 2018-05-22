/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcaremaster.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
        JLabel Username = new JLabel("Username");
        JLabel Password = new JLabel("Password");
        JButton btnsubmit = new JButton("Login");
        JButton btnCalcel = new JButton("Cancel");

        //สร้าง TextField
        JTextField txtUsername = new JTextField(10);
        JTextField txtPassword = new JTextField(10);

        //สร้าง Panel
        JPanel MainPanel = new JPanel();
        JPanel FromPanel = new JPanel();
        JPanel TitleSoftware = new JPanel();

        //ตั้งค่า
        FromPanel.setLayout(new GridLayout(3, 1));

        //เพิ่ม components to Panel
        TitleSoftware.add(WelcomeLogin);
        FromPanel.add(Username);
        FromPanel.add(Password);
        FromPanel.add(txtUsername);
        FromPanel.add(txtPassword);
        FromPanel.add(btnsubmit);
        FromPanel.add(btnCalcel);

        //เพิ่ม Panel ลง Panel ใหญ่
        MainPanel.add(TitleSoftware);
        MainPanel.add(FromPanel);

        //เพิ่ม Panel to frame
        Login.add(MainPanel);

        //New Frame 
        Login.setSize(400, 300);
        Login.setLocationRelativeTo(Login);
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login.setVisible(true);

    }

}
