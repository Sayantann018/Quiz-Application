package quiz.application;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Login extends JFrame implements ActionListener{
    
    JButton rules, Back;
    JTextField tfname;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        
        JLabel heading = new JLabel("Engineer Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 160, 300, 25);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(Color.BLACK);
        add(name);
        
        tfname= new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(915, 270, 125, 25);
        rules.addActionListener(this);
        add(rules);
        
        Back = new JButton("Back");
        Back.setBounds(735, 270, 120, 25);
        Back.addActionListener(this);
        add(Back);
        
        setSize(1200, 500);
        setLocation(200, 200);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== rules){
            String  name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource()== Back){
            setVisible(false);
        }
     } 
    
    public static void main(String[]args){
        new Login();
        
    }
    
}
