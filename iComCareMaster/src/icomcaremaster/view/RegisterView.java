/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcaremaster.view;

import icomcaremaster.controller.btnActions;
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
public class RegisterView {

    private JTextField txtUsername;
    private JTextField txtPassword;
    private JTextField txtName;
    private JTextField txtAddr;

    public RegisterView() {

        JFrame Login = new JFrame();

        JLabel WelcomeLogin = new JLabel("Register - iComCare");
        JLabel Username = new JLabel("Username");
        JLabel Password = new JLabel("Password");
        JLabel Name = new JLabel("Name");
        JLabel Addr = new JLabel("Address");
        JButton btnsubmit = new JButton("Create");

        //สร้าง TextField
        txtUsername = new JTextField(10);
        txtPassword = new JTextField(10);
        txtName = new JTextField(10);
        txtAddr = new JTextField(10);

        //สร้าง Panel
        JPanel MainPanel = new JPanel();
        JPanel FromPanel = new JPanel();
        JPanel TitleSoftware = new JPanel();

        //กดปุ่มสร้าง
        btnActions btnEvent = new btnActions(txtUsername, txtPassword, txtName, txtAddr);
        btnsubmit.addActionListener(btnEvent);
        //ตั้งค่า
        FromPanel.setLayout(new GridLayout(6, 2));

        //เพิ่ม components to Panel
        TitleSoftware.add(WelcomeLogin);

        FromPanel.add(Username);
        FromPanel.add(txtUsername);
        FromPanel.add(Password);
        FromPanel.add(txtPassword);

        FromPanel.add(Name);
        FromPanel.add(txtName);
        FromPanel.add(Addr);
        FromPanel.add(txtAddr);

        FromPanel.add(btnsubmit);

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
