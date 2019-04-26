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

public class GUIPvP extends JFrame{
    
    public GUIPvP(){
        super("PvP");
        
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        add(p);
        
        //NORTH
        JPanel pn = new JPanel();
        pn.setLayout(new GridLayout(1,2));
        p.add(pn);
        
        //---Player
        JPanel pnp = new JPanel();
        pnp.setLayout(new GridLayout(3,1));
        pn.add(pnp);
        
        
        //---Player
        
        //---Monster
        JPanel pnm = new JPanel();
        pnm.setLayout(new GridLayout(3,1));
        pn.add(pnm);
        
        //---Monster
        
        //endNORTH
        
        //SOUTH
        
        //endSOUTH
        
        //WEST
        
        //endWEST
        
        //CENTER
        
        //endCENTER
        
        //EAST
        
        //EAST
        
        add(p);
        setSize(1080,678);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
