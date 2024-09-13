
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score){
        
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thank you "+ name+" for playing Enginner Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add (heading);
        
        JLabel mcqscore = new JLabel("Your score is "+ score);
        mcqscore.setBounds(350,200,300,30);
        mcqscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add (mcqscore);
        
         
        JButton submit = new JButton("Play Again");
        submit.setBounds(375, 270, 120, 30);
        submit.addActionListener(this);
        add (submit);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[]args){
        new Score("user",0);
    }
}
    
     

