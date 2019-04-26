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

public class GUIChooseJob extends JFrame{
    
    private AllJobs allJobs = new AllJobs();
    
    private Bag bigbag = new Bag();
    private Jobs JNV = allJobs.getNovice();
    private Jobs JSM = allJobs.getSwordman();
    private Jobs JAC = allJobs.getArcher();
    private Jobs JMG = allJobs.getMagician();
    private Jobs JTF = allJobs.getThief();
    
    private Novice NV = new Novice(JNV.getJName(),JNV.getJSkill(),JNV.getJWeapon(),14,130,0,0,0,0,0,0);
    private Novice SM = new Novice(JSM.getJName(),JSM.getJSkill(),JSM.getJWeapon(),15,145,0,0,0,0,0,0);
    private Novice AC = new Novice(JAC.getJName(),JAC.getJSkill(),JAC.getJWeapon(),10,140,0,0,0,0,0,0);
    private Novice MG = new Novice(JMG.getJName(),JMG.getJSkill(),JMG.getJWeapon(),13,150,0,0,0,0,0,0);
    private Novice TF = new Novice(JTF.getJName(),JTF.getJSkill(),JTF.getJWeapon(),10,135,0,0,0,0,0,0);
    
    private int CheckJob = 0;
    
    public GUIChooseJob(){
        super("Choose a Job");
        JPanel c = new JPanel();
        c.setLayout(new BorderLayout());
        add(c);

        ImageIcon nv = new ImageIcon("nv.png");
        ImageIcon sm = new ImageIcon("sm.png");
        ImageIcon at = new ImageIcon("at.png");
        ImageIcon mg = new ImageIcon("mg.png");
        ImageIcon tf = new ImageIcon("tf.png");
        ImageIcon chr = new ImageIcon("iconCharacter.png");
       // ImageIcon ibtf = new ImageIcon("iconBtf.png");
       // ImageIcon chr = new ImageIcon("iconCharacter.png");
        
        
        
        
        JLabel title = new JLabel("CHOOSE A JOB",JLabel.CENTER);
        title.setFont(new Font("Algerian", Font.BOLD, 22));
        c.add(title, BorderLayout.NORTH);
        
        JButton play = new JButton("CLICK HERE TO PLAY!",chr);
        play.setFont(new Font("Angsana New", Font.BOLD, 20));
        c.add(play,BorderLayout.SOUTH);
        
        JLabel pic;
        pic = new JLabel("",nv,JLabel.CENTER);
        c.add(pic,BorderLayout.WEST);
        
        //CENTER
        JPanel c1 = new JPanel();
        c1.setLayout(new GridLayout(5,1));
        
        JLabel inf = new JLabel("Job: "+NV.getName(),JLabel.LEFT);
        inf.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JLabel inf1 = new JLabel("HP: "+NV.getHP(),JLabel.LEFT); //Cambria Math
        inf1.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JLabel inf2 = new JLabel("Skill: "+NV.getBasicSkill(),JLabel.LEFT);
        inf2.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JLabel inf3 = new JLabel("Weapon: "+NV.getWeapon(),JLabel.LEFT);
        inf3.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JLabel inf4 = new JLabel("Damage: "+NV.getDamage(),JLabel.LEFT);
        inf4.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        
        c1.add(inf);
        c1.add(inf1);
        c1.add(inf2);
        c1.add(inf3);
        c1.add(inf4);
        
        c.add(c1,BorderLayout.CENTER);
        //CENTER
        
        //EAST
        JPanel c2 = new JPanel();
        c2.setLayout(new GridLayout(5,1));
        
        JButton btnv = new JButton("NOVICE");
        btnv.setFont(new Font("Cambria Math", Font.BOLD, 18));
        JButton btsm = new JButton("SWORDMAN");
        btsm.setFont(new Font("Cambria Math", Font.BOLD, 18));
        JButton btat = new JButton("ARCHER");
        btat.setFont(new Font("Cambria Math", Font.BOLD, 18));
        JButton btmg = new JButton("MAGICIAN");
        btmg.setFont(new Font("Cambria Math", Font.BOLD, 18));
        JButton bttf = new JButton("THEIF");
        bttf.setFont(new Font("Cambria Math", Font.BOLD, 18));
        
        
        c2.add(btnv);
        c2.add(btsm);
        c2.add(btat);
        c2.add(btmg);
        c2.add(bttf);
        
        c.add(c2,BorderLayout.EAST);
        //EAST
        
        //Handler
        btnv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent env){
                inf.setText("Job: "+NV.getName());
                inf1.setText("HP: "+NV.getHP());
                inf2.setText("Skill: "+NV.getBasicSkill());
                inf3.setText("Weapon: "+NV.getWeapon());
                inf4.setText("Damage: "+NV.getDamage());
                pic.setIcon(new ImageIcon("nv.png"));
                CheckJob = 0;
                
 
            }
        });
        
        btsm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent esm){
                inf.setText("Job: "+SM.getName());
                inf1.setText("HP: "+SM.getHP());
                inf2.setText("Skill: "+SM.getBasicSkill());
                inf3.setText("Weapon: "+SM.getWeapon());
                inf4.setText("Damage: "+SM.getDamage());
                pic.setIcon(new ImageIcon("sm.png"));
                CheckJob = 1;
                
            }
        });
        
        btat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eat){
                inf.setText("Job: "+AC.getName());
                inf1.setText("HP: "+AC.getHP());
                inf2.setText("Skill: "+AC.getBasicSkill());
                inf3.setText("Weapon: "+AC.getWeapon());
                inf4.setText("Damage: "+AC.getDamage());
                pic.setIcon(new ImageIcon("at.png"));
                CheckJob = 2;
                
            }
        });
        
        btmg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent emg){
                inf.setText("Job: "+MG.getName());
                inf1.setText("HP: "+MG.getHP());
                inf2.setText("Skill: "+MG.getBasicSkill());
                inf3.setText("Weapon: "+MG.getWeapon());
                inf4.setText("Damage: "+MG.getDamage());
                pic.setIcon(new ImageIcon("mg.png"));
                CheckJob = 3;
                
            }
        });
        
        bttf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent etf){
                inf.setText("Job: "+TF.getName());
                inf1.setText("HP: "+TF.getHP());
                inf2.setText("Skill: "+TF.getBasicSkill());
                inf3.setText("Weapon: "+TF.getWeapon());
                inf4.setText("Damage: "+TF.getDamage());
                pic.setIcon(new ImageIcon("tf.png"));
                CheckJob = 4;
                
            }
        });
        
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent epy){
                if(CheckJob ==1){
                    setVisible(false);
                    new GUIBattleground(SM,bigbag);
                    
                }
                else if(CheckJob ==2){
                    setVisible(false);
                    new GUIBattleground(AC,bigbag);
                    
                }
                
                else if(CheckJob ==3){
                    setVisible(false);
                    new GUIBattleground(MG,bigbag);
                    
                }
                
                else if(CheckJob ==4){
                    setVisible(false);
                    new GUIBattleground(TF,bigbag);
                    
                }
                
                else{
                    setVisible(false);
                    new GUIBattleground(NV,bigbag);
                    
                    
                }
                
            }
        });
        
        setSize(772,700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        
        
    }

    
    
}
