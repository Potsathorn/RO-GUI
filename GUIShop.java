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

public class GUIShop extends JFrame {
    private ArmorShopItem AM = new ArmorShopItem("Armor",100);
    private ManaPotionShopItem MN = new ManaPotionShopItem("Mana",100);
    
    private int php;
    private String pweapon;
    private int parmor;
    private int pexp;
    private int plevel;
    private int pmana;
    private float pmoney;
    private int countMon; 
    
    private Novice jnv;
    
    public GUIShop(Novice PlayerJob,Bag bigbag){
        super("Shop");
        
        this.php = PlayerJob.getHP();
        this.parmor = PlayerJob.getArmor();
        this.pexp = PlayerJob.getEXP();
        this.plevel = PlayerJob.getLvel();
        this.pweapon = PlayerJob.getWeapon();
        this.pmana = PlayerJob.getMana();
        this.pmoney = PlayerJob.getMoney();
        this.countMon = PlayerJob.getKillMonster();
        
        ImageIcon par = new ImageIcon("ar.png");
        ImageIcon pkf = new ImageIcon("kf.png");
        ImageIcon pmn = new ImageIcon("mn.png");
        ImageIcon iar = new ImageIcon("pp.png");
        ImageIcon imny = new ImageIcon("iconMny1.png");
        ImageIcon imn = new ImageIcon("iconMn1.png");
        
       
            
        
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        //Panel
        JPanel pn = new JPanel();
        pn.setLayout(new BorderLayout());
        
        JPanel pc = new JPanel();
        pc.setLayout(new BorderLayout());
      //  pc.setBackground(Color.);
        
        JPanel ps = new JPanel();
        ps.setLayout(new BorderLayout());
        
        p.add(pn,BorderLayout.NORTH);
        p.add(pc,BorderLayout.CENTER);
        p.add(ps,BorderLayout.SOUTH);
        
        
        //NORTH
        JLabel sp = new JLabel("Shop",JLabel.CENTER);
        sp.setFont(new Font("Eras Demi ITC", Font.BOLD, 30));
        
        
        
        
        pn.add(sp);
        
        
        
        //CENTER
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
       
            //p1
            JPanel p2 = new JPanel();
            p2.setLayout(new BorderLayout());
            
                JPanel p2p = new JPanel();
                p2p.setLayout(new GridLayout(1,3));
                JLabel sar = new JLabel("",par,JLabel.CENTER);
                JLabel skf = new JLabel("",pkf,JLabel.CENTER);
                JLabel smn = new JLabel("",pmn,JLabel.CENTER);
                
                JPanel p2b = new JPanel();
                p2b.setLayout(new GridLayout(2,4));
                JButton barb = new JButton("Buy: "+AM.getPrice());
                barb.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
                JButton bmnb = new JButton("Buy: "+MN.getPrice());
                bmnb.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
                JButton bkfb = new JButton("Buy: 350");
                bkfb.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
                JLabel bmt = new JLabel("");
                JLabel bmt1 = new JLabel("");
                JLabel bmt2 = new JLabel("");
                
                p2p.add(sar);
                p2p.add(skf);
                p2p.add(smn);
                p2b.add(barb);
                p2b.add(bkfb);
                p2b.add(bmnb);
                p2b.add(bmt);
                p2b.add(bmt1);
                p2b.add(bmt2);
                
            p2.add(p2p,BorderLayout.CENTER);
            p2.add(p2b,BorderLayout.SOUTH);
            
            
            
            JPanel p3 = new JPanel();
            p3.setLayout(new BorderLayout());
            
                JLabel mny = new JLabel("Money: "+pmoney,imny,JLabel.CENTER);
                mny.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
                JLabel mt1 = new JLabel("       ");
                JLabel mt2 = new JLabel("       ");
                JLabel mt4 = new JLabel("       ");
                JLabel mt5 = new JLabel("       ");
                
                
                
                
                
              
                p3.add(mny ,BorderLayout.SOUTH);
               
            

            
            
            
            
            p1.add(p2,BorderLayout.CENTER);
            p1.add(p3,BorderLayout.SOUTH);
        
        
        
        pc.add(p1);
        //SOUTH
        JPanel sn = new JPanel();
        sn.setLayout(new GridLayout(1,3));
        
        JPanel ss = new JPanel();
        ss.setLayout(new GridLayout(1,5));
        
        
        JLabel ar = new JLabel("Armor: "+parmor+" / 100",iar,JLabel.CENTER);
        JLabel mt6 = new JLabel("              ");
        JLabel mt7 = new JLabel("              ");
        JLabel mt8 = new JLabel("              ");
        JLabel mn = new JLabel("Mana: "+pmana+" / 100",imn,JLabel.CENTER);
         mn.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
         ar.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        //sn.add(mt6);
        sn.add(ar);
        sn.add(mt7);
        sn.add(mn);
       // sn.add(mt8);
        
        JLabel mt9 = new JLabel("       ");
        JButton bk = new JButton("Back");
         bk.setFont(new Font("Eras Demi ITC", Font.BOLD, 25));
        JLabel mt10 = new JLabel("       ");
        
        ss.add(mt9);
        ss.add(mt1);
        ss.add(bk);
        ss.add(mt2);
        ss.add(mt10);
        
        
         if(pmoney<AM.getPrice())
             barb.setEnabled(false);
         if(pmoney<MN.getPrice())
             bmnb.setEnabled(false);
         if(pmoney<350 || pweapon.equals("CoE")){
             bkfb.setEnabled(false);
             if(pweapon.equals("CoE"))
                bkfb.setText("Sold Out");
             else
                 bkfb.setText("Buy: 350");
                
         }
        
        
        
        
        
        ps.add(sn,BorderLayout.CENTER);
        ps.add(ss,BorderLayout.SOUTH);
        
                barb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
              //  ds.setText("Have used the item: "+allitems.item3.getName()+"    Heal: +"+allitems.item3.getHeal()+"    Mana: +"+allitems.item3.getMana());
            //    ds.setIcon(ipt);
                    parmor += AM.getArmor();
                    pmoney -= AM.getPrice();
                    
             
                    
                    if(parmor >= 100){
                        parmor = 100;
                    }
               
                    
                    if(pmoney <=0){
                        pmoney = 0;
                    }
                    
                    if(pmoney <=0)
                        barb.setEnabled(false);

                ar.setText("Armor: "+parmor+" / 100");
                mny.setText("Money: "+pmoney);

            }
        });
                bmnb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
              //  ds.setText("Have used the item: "+allitems.item3.getName()+"    Heal: +"+allitems.item3.getHeal()+"    Mana: +"+allitems.item3.getMana());
            //    ds.setIcon(ipt);
     
                    pmana += MN.getMana();
                    pmoney -= MN.getPrice();
                    
             
                    
                    if(pmana >= 100){
                        pmana = 100;
                    }
               
                    
                    if(pmoney <=0){
                        pmoney = 0;
                    }
                    
                    if(pmoney <=0)
                        bmnb.setEnabled(false);

                mn.setText("Mana: "+pmana+" / 100");
                mny.setText("Money: "+pmoney);

            }
        });
                bkfb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
              //  ds.setText("Have used the item: "+allitems.item3.getName()+"    Heal: +"+allitems.item3.getHeal()+"    Mana: +"+allitems.item3.getMana());
            //    ds.setIcon(ipt);
            
                    pweapon = "CoE";
                     bkfb.setEnabled(false);
                     bkfb.setText("Sold Out");
            
            
                   
                    pmoney -= 350;
                    
        
                    if(pmoney <=0){
                        pmoney = 0;
                    }
                    
                    if(pmoney <=0)
                        bkfb.setEnabled(false);


                mny.setText("Money: "+pmoney);

            }
        });
                
                bk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                setVisible(false);
                jnv = new Novice(PlayerJob.getName(),PlayerJob.getBasicSkill(),pweapon,PlayerJob.getDamage(),php,pexp,pmoney,pmana,parmor,plevel,countMon);
                new GUIBattleground(jnv,bigbag);
        }
        });
        
        
        
        add(p);
        setSize(665,601);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);        
        
    }
    
}
