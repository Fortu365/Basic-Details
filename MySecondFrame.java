/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Fortunate
 */
public class MySecondFrame extends JFrame{

    public MySecondFrame() {
        
        setTitle("Fortunte Malatji");
        setSize(500, 550); 
        JFrame.setDefaultLookAndFeelDecorated(true); 
        setResizable(false); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLACK);
        setVisible(true);
    }   
}
