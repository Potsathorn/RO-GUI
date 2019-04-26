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

public class GUIBag extends JFrame{
    private TreasuryItem allitems = new TreasuryItem();

    
    private int on;
    private int mt;
    private int pt;
    private int dg;
    private int sw;
    private int ar;
    private int wn;
    private int kn;
    private int gd;
    private int ct;
    
    private int php;
    private int parmor;
    private int pexp;
    private int plevel;
    private int pmana;
    private float pmoney;
    private int countMon;
    
    private Novice fb;
    
    
    
    
    
    public GUIBag(Novice nv,Bag bag){
        super("Bag");
        this.on = bag.countItem("Onigiri");
        this.mt = bag.countItem("Meat");
        this.pt = bag.countItem("Potions");
        this.dg = bag.countItem("Dagger");
        this.sw = bag.countItem("Sword");
        this.ar = bag.countItem("Arrow");
        this.wn = bag.countItem("Wand");
        this.kn = bag.countItem("Knife");
        this.gd = bag.countItem("Gold");
        this.ct = bag.countItem("Crystal");
        
        this.php = nv.getHP();
        this.parmor = nv.getArmor();
        this.pexp = nv.getEXP();
        this.plevel = nv.getLvel();
        this.pmana = nv.getMana();
        this.pmoney = nv.getMoney();
        this.countMon = nv.getKillMonster();
        
       
        ImageIcon ion = new ImageIcon("ion.png");
        ImageIcon imt = new ImageIcon("imt.png");
        ImageIcon ipt = new ImageIcon("ipt.png");
        ImageIcon idg = new ImageIcon("idg.png");
        ImageIcon isw = new ImageIcon("isw.png");
        ImageIcon iar = new ImageIcon("iar.png");
        ImageIcon iwn = new ImageIcon("iwn.png");
        ImageIcon ikn = new ImageIcon("ikn.png");
        ImageIcon igd = new ImageIcon("igd.png");
        ImageIcon ict = new ImageIcon("ict.png");
        ImageIcon ihp = new ImageIcon("iconHP.png");
        ImageIcon imny = new ImageIcon("iconMny.png");
        ImageIcon imn = new ImageIcon("iconMn.png");
        ImageIcon ibtf = new ImageIcon("iconBtf.png");
        ImageIcon iemt = new ImageIcon("iemt.png");
        
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        //mainpanel
        //=====pn
        int n;
        n = on+mt+pt+gd+ct+sw+dg+ar+wn+kn;
        JPanel pn = new JPanel();
        
        JLabel ds = new JLabel("ALL ITEM: "+n,iemt,JLabel.CENTER);
        ds.setFont(new Font("Eras Demi ITC", Font.BOLD, 15));
        
        
        pn.add(ds);
        
        
        p.add(pn,BorderLayout.NORTH);
        
        //=====pn
        
        
        //======p3
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());
        
        JButton back = new JButton("Back");
        back.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        
        JPanel p3i = new JPanel();
        p3i.setLayout(new GridLayout(3,1));
        
        JLabel mn = new JLabel("Money: "+pmoney,imny,JLabel.CENTER);
        mn.setFont(new Font("Cambria Math", Font.BOLD, 12));
      //  mn.setBackground(Color.MAGENTA);
        mn.setOpaque(true);
        
        JLabel hp = new JLabel("HP: "+php+" / "+nv.getMaxHP(),ihp,JLabel.CENTER);
        hp.setFont(new Font("Cambria Math", Font.BOLD, 12));
     //   hp.setBackground(Color.CYAN);
        hp.setOpaque(true);
        
        JLabel mana = new JLabel("Mana: "+pmana + "/ 100",imn,JLabel.CENTER);
        mana.setFont(new Font("Cambria Math", Font.BOLD, 12));
     //   hp.setBackground(Color.CYAN);
        hp.setOpaque(true);
        
        
        p3i.add(mn);
        p3i.add(hp);
        p3i.add(mana);
        
        
        
        
        p3.add(back,BorderLayout.SOUTH);
        p3.add(p3i,BorderLayout.CENTER);
        //======p3
        
        //=======p1
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(6,1));
        
        JLabel use = new JLabel("FOR USE",JLabel.CENTER);
        use.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JButton onb = new JButton(allitems.item1.getName()+" ("+on+")",ion);
        JButton mtb = new JButton(allitems.item2.getName()+" ("+mt+")",imt);
        JButton ptb = new JButton(allitems.item3.getName()+" ("+pt+")",ipt);
        JButton gdb = new JButton(allitems.item9.getName()+" ("+gd+")",igd);
        JButton ctb = new JButton(allitems.item10.getName()+" ("+ct+")",ict);
        
        
        
        
        
        
        
        
        p1.add(use);
        p1.add(onb);
        p1.add(mtb);
        p1.add(ptb);
        p1.add(gdb);
        p1.add(ctb);
        //=======p1
        
        //=======p2
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(6,1));
        JLabel sell = new JLabel("FOR SELL",JLabel.CENTER);
        sell.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JButton dgb = new JButton(allitems.item4.getName()+" ("+dg+")",idg);
        JButton swb = new JButton(allitems.item5.getName()+" ("+sw+")",isw);
        JButton arb = new JButton(allitems.item6.getName()+" ("+ar+")",iar);
        JButton wnb = new JButton(allitems.item7.getName()+" ("+wn+")",iwn);
        JButton knb = new JButton(allitems.item8.getName()+" ("+kn+")",ikn);
        
        if(on<=0){
            onb.setEnabled(false);
        }
        if(mt<=0){
            mtb.setEnabled(false);
        }
        if(pt<=0){
            ptb.setEnabled(false);
        }
        if(dg<=0){
            dgb.setEnabled(false);
        }
        if(sw<=0){
            swb.setEnabled(false);
        }
        if(ar<=0){
            arb.setEnabled(false);
        }
        if(wn<=0){
            wnb.setEnabled(false);
        }
        if(kn<=0){
            knb.setEnabled(false);
        }
        if(gd<=0){
            gdb.setEnabled(false);
        }
        if(ct<=0){
            ctb.setEnabled(false);
        }
        p2.add(sell);
        p2.add(dgb);
        p2.add(swb);
        p2.add(arb);
        p2.add(wnb);
        p2.add(knb);
        //=======p2
        
        
        p.add(p1, BorderLayout.WEST);
        p.add(p2, BorderLayout.EAST);
        p.add(p3, BorderLayout.CENTER);
        
        
        
        
        
        add(p);
        //====mainpanel
        
        //handle
        onb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                
                ds.setText("Have used the item: "+allitems.item1.getName()+"    Heal: +"+allitems.item1.getHeal()+"    Mana: +"+allitems.item1.getMana());
                ds.setIcon(ion);
                    php += allitems.item1.getHeal();
                    
                    pmana += allitems.item1.getMana();
                    
                    if(php >= nv.getMaxHP()){
                        php = nv.getMaxHP();
                    }
               
                    
                    if(pmana >= 100){
                        pmana = 100;
                    }

                int i = bag.findItem("Onigiri");
               
                bag.removeItem(i); 
                on = bag.countItem("Onigiri");
                
                if(on <=0)
                    onb.setEnabled(false);

                onb.setText(allitems.item1.getName()+" ("+on+")");
                hp.setText("HP: "+php+" / "+nv.getMaxHP());
                mana.setText("Mana: "+pmana+" / 100");
        
            }
        });
        
                mtb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have used the item: "+allitems.item2.getName()+"    Heal: +"+allitems.item2.getHeal()+"    Mana: +"+allitems.item2.getMana());
                ds.setIcon(imt);
                    php += allitems.item2.getHeal();
                    
                    pmana += allitems.item2.getMana();
                    
                    if(php >= nv.getMaxHP()){
                        php = nv.getMaxHP();
                    }
               
                    
                    if(pmana >= 100){
                        pmana = 100;
                    }

                int i = bag.findItem("Meat");
              
                bag.removeItem(i); 
                mt = bag.countItem("Meat");
                
                if(mt <=0)
                    mtb.setEnabled(false);

                mtb.setText(allitems.item2.getName()+" ("+mt+")");
                hp.setText("HP: "+php+" / "+nv.getMaxHP());
                mana.setText("Mana: "+pmana+" / 100");

           
            }
        });
                ptb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have used the item: "+allitems.item3.getName()+"    Heal: +"+allitems.item3.getHeal()+"    Mana: +"+allitems.item3.getMana());
                ds.setIcon(ipt);
                    php += allitems.item3.getHeal();
                    
                    pmana += allitems.item3.getMana();
                    
                    if(php >= nv.getMaxHP()){
                        php = nv.getMaxHP();
                    }
               
                    
                    if(pmana >= 100){
                        pmana = 100;
                    }

                int i = bag.findItem("Potions");
              
                bag.removeItem(i); 
                pt = bag.countItem("Potions");
                
                if(pt <=0)
                    ptb.setEnabled(false);

                ptb.setText(allitems.item3.getName()+" ("+pt+")");
                hp.setText("HP: "+php+" / "+nv.getMaxHP());
                mana.setText("Mana: "+pmana+" / 100");

           
            }
        });
                dgb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item4.getName()+"    Money: +"+allitems.item4.getPrice());
                ds.setIcon(idg);
                    pmoney += allitems.item4.getPrice();

                int i = bag.findItem("Dagger");
              
                bag.removeItem(i); 
                dg = bag.countItem("Dagger");
                
                if(dg <=0)
                    dgb.setEnabled(false);

                dgb.setText(allitems.item4.getName()+" ("+dg+")");
                mn.setText("Money: "+pmoney);

            }
        });
                swb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item5.getName()+"    Money: +"+allitems.item5.getPrice());
                ds.setIcon(isw);
                    pmoney += allitems.item5.getPrice();

                int i = bag.findItem("Sword");
              
                bag.removeItem(i); 
                sw = bag.countItem("Sword");
                
                if(sw <=0)
                    swb.setEnabled(false);

                swb.setText(allitems.item5.getName()+" ("+sw+")");
                mn.setText("Money: "+pmoney);
           
            }
        });

                arb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item6.getName()+"    Money: +"+allitems.item6.getPrice());
                ds.setIcon(iar);
                    pmoney += allitems.item6.getPrice();

                int i = bag.findItem("Arrow");
              
                bag.removeItem(i); 
                ar = bag.countItem("Arrow");
                
                if(ar <=0)
                    arb.setEnabled(false);

                arb.setText(allitems.item6.getName()+" ("+ar+")");
                mn.setText("Money: "+pmoney);
           
            }
        });                
         
                wnb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item7.getName()+"    Money: +"+allitems.item7.getPrice());
                ds.setIcon(iwn);
                    pmoney += allitems.item7.getPrice();

                int i = bag.findItem("Wand");
              
                bag.removeItem(i); 
                wn = bag.countItem("Wand");
                
                if(wn <=0)
                    wnb.setEnabled(false);

                wnb.setText(allitems.item7.getName()+" ("+wn+")");
                mn.setText("Money: "+pmoney);
           
            }
        }); 
                
                knb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item8.getName()+"    Money: +"+allitems.item8.getPrice());
                ds.setIcon(ikn);
                    pmoney += allitems.item8.getPrice();

                int i = bag.findItem("Knife");
              
                bag.removeItem(i); 
                kn = bag.countItem("Knife");
                
                if(kn <=0)
                    knb.setEnabled(false);

                knb.setText(allitems.item8.getName()+" ("+kn+")");
                mn.setText("Money: "+pmoney);
           
            }
        });                  

                gdb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have used the item: "+allitems.item9.getName()+"    Money: +"+allitems.item9.getCost());
                ds.setIcon(igd);
                    pmoney += allitems.item9.getCost();

                int i = bag.findItem("Gold");
              
                bag.removeItem(i); 
                gd = bag.countItem("Gold");
                
                if(gd <=0)
                    gdb.setEnabled(false);

                gdb.setText(allitems.item9.getName()+" ("+gd+")");
                mn.setText("Money: "+pmoney);
           
            }
        });  
                
                ctb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have used the item: "+allitems.item10.getName()+"    Money: +"+allitems.item10.getCost());
                ds.setIcon(ict);
                    pmoney += allitems.item10.getCost();

                int i = bag.findItem("Crystal");
              
                bag.removeItem(i); 
                ct = bag.countItem("Crystal");
                
                if(ct <=0)
                    ctb.setEnabled(false);

                ctb.setText(allitems.item10.getName()+" ("+ct+")");
                mn.setText("Money: "+pmoney);
           
            }
        }); 

                back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                setVisible(false);
                fb = new Novice(nv.getName(),nv.getBasicSkill(),nv.getWeapon(),nv.getDamage(),php,pexp,pmoney,pmana,parmor,plevel,countMon);
                new GUIBattleground(fb,bag);

           
            }
        });                 
        //===
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        setSize(563,605);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    } 
    
    
    
    
}
