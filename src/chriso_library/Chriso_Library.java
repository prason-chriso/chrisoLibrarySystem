/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso_library;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.SwingConstants;

/**
 *
 * @author Amit
 */
public class Chriso_Library{

    /**
     * @param args the command line arguments
     */
    Chriso_Library(){
        JFrame f1 = new JFrame("display");
        JPanel p1 = new JPanel();
        JLabel l1;
        ImageIcon img =  new ImageIcon(getClass().getResource("default.jpg"));
       l1 = new JLabel("my image",img ,JLabel.CENTER);
       // p1.setLayout(new BorderLayout());
        f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        p1.add(l1);
        
        f1.add(p1);
        f1.validate();
        f1.setVisible(true);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Chriso_Library();
        
    }
    
}
