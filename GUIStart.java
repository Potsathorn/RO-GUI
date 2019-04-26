/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playgame;

/**
 *
 * @author Potsathron
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIStart extends JFrame{
    private int count = 0;
    
    public GUIStart(){
        JLabel Background;
        JButton bt1 = new JButton("PLAY");
        bt1.setFont(new Font("Eras Demi ITC", Font.BOLD, 20));
        ImageIcon img = new ImageIcon("bk3.png");
        Background = new JLabel("",img,JLabel.CENTER);
        Background.setLayout(null);
        bt1.setBounds(370,400,120,35);
        
        Background.setBounds(0,0,850,600);
        Background.add(bt1);
        add(Background);
        
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                new GUIChooseJob();
                
            }
        });
        
        setSize(870,630);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        

    }
    
    
}
