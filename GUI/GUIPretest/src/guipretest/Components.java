/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipretest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bankcom
 */
public class Components {

    public Components() {
        //Componetns 
        JButton button1 = new JButton("button1");
        JButton button2 = new JButton("button2");
        JButton button3 = new JButton("button3");
        
        
        //New Frame
        JFrame frame = new JFrame("Hello World");
        //Panel
        JPanel p = new JPanel();
        
        
        //add to panel
        p.add(button1);
        p.add(button2);
        p.add(button3);
        
        
        frame.add(p);
        
        
        
        
        
        
        //สร้าง Freame
        frame.setSize(500, 500);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //จบของการวาด Frame;
        
    }
    
    
        
    
}
