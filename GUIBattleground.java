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
import java.util.concurrent.TimeUnit;

public class GUIBattleground extends JFrame{
    
    private BornaMonster allMon = new BornaMonster();
    private Monster mA = allMon.ReleaseMonster();
    private Monster mB = allMon.ReleaseMonster();
    private Monster mC = allMon.ReleaseMonster();
    
    private TreasuryItem allitem = new TreasuryItem();
    private Item iA = allitem.ItemDrop();
    private Item iB = allitem.ItemDrop();
    private Item iC = allitem.ItemDrop();
    
    private Wallet Balance = new Wallet();
    
    private AllSkills allskill = new AllSkills();
    private Skills skill;
    
    private Novice jnv;
    
    private JLabel pxnv;
    private JLabel pA;
    private JLabel pB;
    private JLabel pC;
    private JLabel itA;
    private JLabel itB;
    private JLabel itC;
    
    private int php;
    private int parmor;
    private int pexp;
    private int plevel;
    private int pmana;
    private float pmoney;
    private int countMon;
    private String pweapon;
    
    private boolean kA;
    private boolean kB;
    private boolean kC;
    
    private int mahp;
    private int mbhp;
    private int mchp;
    
    private int dca = 0;
    private int dcb = 0;
    private int dcc = 0;

    
   
    
    public GUIBattleground(Novice PlayerJob,Bag bigbag){
        super("Battleground");
        
        this.php = PlayerJob.getHP();
        this.parmor = PlayerJob.getArmor();
        this.pexp = PlayerJob.getEXP();
        this.plevel = PlayerJob.getLvel();
        this.pweapon = PlayerJob.getWeapon();
        this.pmana = PlayerJob.getMana();
        this.pmoney = PlayerJob.getMoney();
        this.countMon = PlayerJob.getKillMonster();
        
        this.mahp = mA.getHP();
        this.mbhp = mB.getHP();
        this.mchp = mC.getHP();
        
        
            
        
        
        
        
        
        //skill
        if(PlayerJob.getBasicSkill().equals("First Aid"))
            skill = allskill.getNoviceSkill();
        
        else if(PlayerJob.getBasicSkill().equals("Sword Mastery"))
            skill = allskill.getSwordmanSkill();
            
        else if(PlayerJob.getBasicSkill().equals("Arrow Repel"))
            skill = allskill.getArcherSkill();
        else if(PlayerJob.getBasicSkill().equals("Thunder Storm"))
            skill = allskill.getMagicianSkill();
        else
            skill = allskill.getThiefSkill();
                
        
        //====skill
        
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        //p.setBackground(Color.black);
        add(p);
        
        ImageIcon jb = new ImageIcon("iconJB.png");
        ImageIcon lv = new ImageIcon("iconLevel.png");
        ImageIcon exp = new ImageIcon("iconEXP.png");
        ImageIcon kll = new ImageIcon("iconKill.png");
        ImageIcon Mny = new ImageIcon("iconMny.png");
        ImageIcon bag = new ImageIcon("iconBag.png");
        ImageIcon shp = new ImageIcon("iconShop.png");
        ImageIcon chr = new ImageIcon("iconNext.png");
        ImageIcon chrnv = new ImageIcon("fnv.gif");
        ImageIcon chrsm = new ImageIcon("fsm.gif");
        ImageIcon chrac = new ImageIcon("fac.gif");
        ImageIcon chrmg = new ImageIcon("fmg.gif");
        ImageIcon chrtf = new ImageIcon("ftf.gif");
        ImageIcon msr = new ImageIcon("rssr.gif");
        ImageIcon mdg = new ImageIcon("rsdg.gif");
        ImageIcon mmd = new ImageIcon("rsmd.gif");
        ImageIcon mrt = new ImageIcon("rsrt.gif");
        ImageIcon meg = new ImageIcon("rseg.gif");
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
        ImageIcon sk = new ImageIcon("14.gif");
        ImageIcon coe = new ImageIcon("kf.gif");
        
        
        //NORTH
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,5));
      //  p1.setBackground(Color.darkGray);
        
        JLabel picjb = new JLabel("Job: "+PlayerJob.getName(),jb,JLabel.LEFT);
        picjb.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
        JLabel picexp = new JLabel("EXP: "+pexp,exp,JLabel.LEFT);
        picexp.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
        JLabel piclv = new JLabel("Level: "+plevel,lv,JLabel.LEFT);
        piclv.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
        JLabel pickll = new JLabel("Monster Die: "+countMon,kll,JLabel.LEFT);
        pickll.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
        JLabel picMny = new JLabel("Money: "+pmoney,Mny,JLabel.LEFT);
        picMny.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
        
        
        p1.add(picjb);
        p1.add(picexp);
        p1.add(piclv);
        p1.add(pickll);
        p1.add(picMny);
        
        
        p.add(p1,BorderLayout.NORTH);
         //NORTH
        
         
         //CENTER
        JPanel p3 = new JPanel();
        p3.setLayout(null);
       // p3.setBackground(Color.BLACK);
        
        JLabel efk = new JLabel("",sk,JLabel.CENTER);
        
         JLabel KF = new JLabel("",coe,JLabel.CENTER);
         
         
        
        //item
        
        //====item
        
        //Novice
        if(PlayerJob.getName().equals("Swordman")){
            pxnv = new JLabel("",chrsm,JLabel.CENTER);
            
        }
        
        else if(PlayerJob.getName().equals("Archer")){
            pxnv = new JLabel("",chrac,JLabel.CENTER);
            
        }
        
        else if(PlayerJob.getName().equals("Magician")){
            pxnv = new JLabel("",chrmg,JLabel.CENTER);
                    
        }
        
        else if(PlayerJob.getName().equals("Thief")){
            pxnv = new JLabel("",chrtf,JLabel.CENTER);
            
        }
        
        else{
            pxnv = new JLabel("",chrnv,JLabel.CENTER);
            
        }
        
        pxnv.setBounds(61, 150, 100, 100);
        efk.setBounds(450, 15, 520, 500);
        KF.setBounds(140, 190, 153, 73);
        JButton skb = new JButton("Skill: "+skill.getName());
        skb.setBounds(40, 260, 150, 25);
        skb.setEnabled(false);
        
        JLabel namehp = new JLabel("HP: "+php+"/"+PlayerJob.getMaxHP(),JLabel.LEFT);
        namehp.setBounds(75, 69, 100, 100);
        JLabel armor = new JLabel("Armor: "+parmor+"/100",JLabel.LEFT);
        armor.setBounds(75, 79, 100, 100);
        JLabel mana = new JLabel("Mana: "+pmana+"/100",JLabel.LEFT);
        mana.setBounds(75, 90, 100, 100);
        //Novice
        if(pweapon.equals("CoE"))
            KF.setVisible(true);
        else
            KF.setVisible(false);
            
            
        //Monster
        
        /////////PositionA
        JButton bA = new JButton("Attack");
        //Aitempic
        if(iA.getName().equals("Onigiri")){
            itA = new JLabel(iA.getName(),ion,JLabel.LEFT);
        }
        else if(iA.getName().equals("Meat")){
            itA = new JLabel(iA.getName(),imt,JLabel.LEFT);
        }
        else if(iA.getName().equals("Potions")){
            itA = new JLabel(iA.getName(),ipt,JLabel.LEFT);
        }
        else if(iA.getName().equals("Dagger")){
            itA = new JLabel(iA.getName(),idg,JLabel.LEFT);
        }
        else if(iA.getName().equals("Sword")){
            itA = new JLabel(iA.getName(),isw,JLabel.LEFT);
        }
        else if(iA.getName().equals("Arrow")){
            itA = new JLabel(iA.getName(),iar,JLabel.LEFT);
        }
        else if(iA.getName().equals("Wand")){
            itA = new JLabel(iA.getName(),iwn,JLabel.LEFT);
        }
        else if(iA.getName().equals("Knife")){
            itA = new JLabel(iA.getName(),ikn,JLabel.LEFT);
        }
        else if(iA.getName().equals("Gold")){
            itA = new JLabel(iA.getName(),igd,JLabel.LEFT);
        }
        else{
            itA = new JLabel(iA.getName(),ict,JLabel.LEFT);
        }
            
        
        //Aitempic
       
        if(mA.getName().equals("Syringe")){
            pA = new JLabel(mA.getName()+"/ HP: "+mahp,msr,JLabel.LEFT);
        }
        else if(mA.getName().equals("Dragon")){
            pA = new JLabel(mA.getName()+"/ HP: "+mahp,mdg,JLabel.LEFT);
        }
        
        else if(mA.getName().equals("Medusabug")){
            pA = new JLabel(mA.getName()+"/ HP: "+mahp,mmd,JLabel.LEFT);
        }
        
        else if(mA.getName().equals("Rattlesnake")){
            pA = new JLabel(mA.getName()+"/ HP: "+mahp,mrt,JLabel.LEFT);
        }
        
        else{
            pA = new JLabel(mA.getName()+"/ HP: "+mahp,meg,JLabel.LEFT);
        }
        JButton itAb = new JButton("Keep?");
        
        pA.setBounds(720, 25, 500, 160);
        itA.setBounds(745, 80, 127, 127);
        itA.setVisible(false);
        itAb.setVisible(false);
        
        bA.setBounds(720, 175, 100, 28);
        itAb.setBounds(720, 175, 100, 28);
        /////////PositionA
        
        /////////PositionB
        JButton bB = new JButton("Attack");
        
        //Bitempic
        if(iB.getName().equals("Onigiri")){
            itB = new JLabel(iB.getName(),ion,JLabel.LEFT);
        }
        else if(iB.getName().equals("Meat")){
            itB = new JLabel(iB.getName(),imt,JLabel.LEFT);
        }
        else if(iB.getName().equals("Potions")){
            itB = new JLabel(iB.getName(),ipt,JLabel.LEFT);
        }
        else if(iB.getName().equals("Dagger")){
            itB = new JLabel(iB.getName(),idg,JLabel.LEFT);
        }
        else if(iB.getName().equals("Sword")){
            itB = new JLabel(iB.getName(),isw,JLabel.LEFT);
        }
        else if(iB.getName().equals("Arrow")){
            itB = new JLabel(iB.getName(),iar,JLabel.LEFT);
        }
        else if(iB.getName().equals("Wand")){
            itB = new JLabel(iB.getName(),iwn,JLabel.LEFT);
        }
        else if(iB.getName().equals("Knife")){
            itB = new JLabel(iB.getName(),ikn,JLabel.LEFT);
        }
        else if(iB.getName().equals("Gold")){
            itB = new JLabel(iB.getName(),igd,JLabel.LEFT);
        }
        else{
            itB = new JLabel(iB.getName(),ict,JLabel.LEFT);
        }      

        //Bitempic
        
        if(mB.getName().equals("Syringe")){
            pB = new JLabel(mB.getName()+"/ HP: "+mbhp,msr,JLabel.LEFT);
        }
        else if(mB.getName().equals("Dragon")){
            pB = new JLabel(mB.getName()+"/ HP: "+mbhp,mdg,JLabel.LEFT);
        }
        
        else if(mB.getName().equals("Medusabug")){
            pB = new JLabel(mB.getName()+"/ HP: "+mbhp,mmd,JLabel.LEFT);
        }
        
        else if(mB.getName().equals("Rattlesnake")){
            pB = new JLabel(mB.getName()+"/ HP: "+mbhp,mrt,JLabel.LEFT);
        }
        
        else{
            pB = new JLabel(mB.getName()+"/ HP: "+mbhp,meg,JLabel.LEFT);
        }
        JButton itBb = new JButton("Keep?");
        pB.setBounds(720, 287, 500, 160);
        bB.setBounds(720, 437, 100, 28);
        itBb.setBounds(720, 437, 100, 28);
        itB.setBounds(745, 340, 127, 127);
        itB.setVisible(false);
        itBb.setVisible(false);
        /////////PositionB
        
        /////////PositionC
        JButton bC = new JButton("Attack");
        
                //Bitempic
        if(iC.getName().equals("Onigiri")){
            itC = new JLabel(iC.getName(),ion,JLabel.LEFT);
        }
        else if(iC.getName().equals("Meat")){
            itC = new JLabel(iC.getName(),imt,JLabel.LEFT);
        }
        else if(iC.getName().equals("Potions")){
            itC = new JLabel(iC.getName(),ipt,JLabel.LEFT);
        }
        else if(iC.getName().equals("Dagger")){
            itC = new JLabel(iC.getName(),idg,JLabel.LEFT);
        }
        else if(iC.getName().equals("Sword")){
            itC = new JLabel(iC.getName(),isw,JLabel.LEFT);
        }
        else if(iC.getName().equals("Arrow")){
            itC = new JLabel(iC.getName(),iar,JLabel.LEFT);
        }
        else if(iC.getName().equals("Wand")){
            itC = new JLabel(iC.getName(),iwn,JLabel.LEFT);
        }
        else if(iC.getName().equals("Knife")){
            itC = new JLabel(iC.getName(),ikn,JLabel.LEFT);
        }
        else if(iC.getName().equals("Gold")){
            itC = new JLabel(iC.getName(),igd,JLabel.LEFT);
        }
        else{
            itC = new JLabel(iC.getName(),ict,JLabel.LEFT);
        }      

        //Citempic
        
        
        if(mC.getName().equals("Syringe")){
            pC = new JLabel(mC.getName()+"/ HP: "+mchp,msr,JLabel.LEFT);
        }
        else if(mC.getName().equals("Dragon")){
            pC = new JLabel(mC.getName()+"/ HP: "+mchp,mdg,JLabel.LEFT);
        }
        
        else if(mC.getName().equals("Medusabug")){
            pC = new JLabel(mC.getName()+"/ HP: "+mchp,mmd,JLabel.LEFT);
        }
        
        else if(mC.getName().equals("Rattlesnake")){
            pC = new JLabel(mC.getName()+"/ HP: "+mchp,mrt,JLabel.LEFT);
        }
        
        else{
            pC = new JLabel(mC.getName()+"/ HP: "+mC.getHP(),meg,JLabel.LEFT);
        }
        JButton itCb = new JButton("Keep?");
        pC.setBounds(500, 170, 500, 160);
        bC.setBounds(500, 320, 100, 28);
        itCb.setBounds(500, 320, 100, 28);
        itC.setBounds(525, 220, 127, 127);
        itC.setVisible(false);
        itCb.setVisible(false);
        /////////PositionC
        

        
        
        
        
        //Monster
        
        p3.add(armor);
        p3.add(mana);
        p3.add(itAb);
        p3.add(itBb);
        p3.add(itCb);
        p3.add(itA);
        p3.add(itB);
        p3.add(itC);
        
        p3.add(bA);
        p3.add(bB);
        p3.add(bC);
        p3.add(efk);
        p3.add(pA);
        p3.add(pB);
        p3.add(pC);
        
        
        p3.add(pxnv);
        p3.add(namehp);
        p3.add(skb);
        p3.add(KF);
        
        

        p.add(p3,BorderLayout.CENTER); 
         //CENTER
         
         //SOUTH
        JPanel p2 = new JPanel();
        JPanel empty = new JPanel();
        p2.setLayout(new GridLayout(1,3));
        
        JButton toBag = new JButton("Bag",bag);
        JButton toShop = new JButton("Shop",shp);
        JButton toCharacter = new JButton("Next",chr);
        toCharacter.setEnabled(false);

        
        p2.add(toBag);
        p2.add(toShop);
        p2.add(toCharacter);
        

        
        
        p.add(p2,BorderLayout.SOUTH);
         
         //SOUTH
         
         //event && Handler
        bA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){

                if(mahp==0 && mbhp==0 && mchp==0)
                   toCharacter.setEnabled(true);
                
                efk.setVisible(false);
                p3.setBackground(null);
              
//                    php += skill.getHeal();
//                    pmana -= skill.getMana();
//                    pexp += 25;
//
//                    mahp -= skill.getDamage();
//                    mbhp -= skill.getDamage();
//                    mchp -= skill.getDamage();

                    mahp -= PlayerJob.getDamage();
                    pexp += 10;
                    pmana += 10;
                    
                    if(parmor>0){
                        parmor -= mA.getMonsterDamage();
                        pmana += PlayerJob.getMana();
                    }
                    else if(parmor<=0){
                        php -= mA.getMonsterDamage();
                        pmana += PlayerJob.getMana();
                    }
                    
                    //check
                    if(php<=0){
                        php = 0;
                    }
                    else if(php >= PlayerJob.getMaxHP())
                        php = PlayerJob.getMaxHP();
                    
                    if(parmor <= 0)
                        parmor = 0;
                    else if(parmor >=100){
                        parmor -= 100;
                      
                    }
                    
                    if(pexp <= 0)
                        pexp = 0;
                    else if(pexp >=100){
                        pexp -= 100;
                        plevel++;
                    }

                    if(pmana<=0)
                        pmana =0;
                    else if(pmana >=100){
                        pmana = 100;     
                    }
                    
                    if(pmana >= skill.getMana())
                        skb.setEnabled(true);

                    if(mahp <= 0){
                        
                         
                        if(dca==0){
                           countMon++;
                           dca++;
                        }
                        pA.setEnabled(false);
                        bA.setEnabled(false); 
                        itAb.setVisible(true);
                        itA.setVisible(true);
                        
                        mahp = 0;}
                    else if(mahp >= mA.getHP())
                        mahp = mA.getHP();
                    
//                    if(mbhp <= 0){
//                        pB.setEnabled(false);
//                        bB.setEnabled(false); 
//                        if(dcb==0){
//                           countMon++;
//                           dcb++;
//                        }
//                        mbhp = 0;}
//                    else if(mbhp >= mB.getHP())
//                        mbhp = mB.getHP();
//                    
//                    if(mchp <= 0){
//                        pC.setEnabled(false);
//                        bC.setEnabled(false); 
//                        if(dcc==0){
//                           countMon++;
//                           dcc++;
//                        }
//                        mchp = 0;}
//                    else if(mchp >= mC.getHP())
//                        mchp = mC.getHP();
                    //=====check
                        
                    
                    
                    

//                    System.out.println(php);
//                    System.out.println(pmana);
//                    System.out.println(pexp);
//                    System.out.println(mahp);
//                    System.out.println(mbhp);
//                    System.out.println(mchp);
//
//                    System.out.println("==========");
//                    
                    
                //update
                namehp.setText("HP: "+php+"/"+PlayerJob.getMaxHP());
                armor.setText("Armor: "+parmor+"/100");
                mana.setText("Mana: "+pmana+"/100");
                picexp.setText("EXP: "+pexp);
                piclv.setText("Level: "+plevel);
                pickll.setText("Monster Die: "+countMon);
                pA.setText(mA.getName()+"/ HP: "+mahp);
                pB.setText(mB.getName()+"/ HP: "+mbhp);
                pC.setText(mC.getName()+"/ HP: "+mchp);
                
                if(php<=0){
                    JOptionPane.showMessageDialog(null,"GAME OVER! "+PlayerJob.getName()+" Die R.I.P");
                    setVisible(false);
                    
                    new GUIStart();
                }
                
 
                //===update                
                                
            }
        });
        
        bB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatb){
                if(mahp==0 && mbhp==0 && mchp==0)
                    toCharacter.setEnabled(true);
                 efk.setVisible(false);
                p3.setBackground(null);
                    mbhp -= PlayerJob.getDamage();
                    pexp += 10;
                    pmana += 10;
                    
                    if(parmor>0){
                        parmor -= mB.getMonsterDamage();
                        pmana += PlayerJob.getMana();
                    }
                    else if(parmor<=0){
                        php -= mB.getMonsterDamage();
                        pmana += PlayerJob.getMana();
                    }
                    
                    //check
                    if(php<=0){
                        php = 0;
                    }
                    else if(php >= PlayerJob.getMaxHP())
                        php = PlayerJob.getMaxHP();
                    
                    if(parmor <= 0)
                        parmor = 0;
                    else if(parmor >=100){
                        parmor -= 100;
                      
                    }
                    
                    if(pexp <= 0)
                        pexp = 0;
                    else if(pexp >=100){
                        pexp -= 100;
                        plevel++;
                    }

                    if(pmana<=0)
                        pmana =0;
                    else if(pmana >=100){
                        pmana = 100;     
                    }
                    
                    if(pmana >= skill.getMana())
                        skb.setEnabled(true);

                    if(mbhp <= 0){
                        itBb.setVisible(true);
                        itB.setVisible(true);
                        
                        if(dcb==0){
                           countMon++;
                           dcb++;
                        }
                        pB.setEnabled(false);
                        bB.setEnabled(false); 
                        
                        
                        mbhp = 0;}
                    else if(mbhp >= mB.getHP())
                        mbhp = mB.getHP();
                    
//                    if(mbhp <= 0){
//                        pB.setEnabled(false);
//                        bB.setEnabled(false); 
//                        if(dcb==0){
//                           countMon++;
//                           dcb++;
//                        }
//                        mbhp = 0;}
//                    else if(mbhp >= mB.getHP())
//                        mbhp = mB.getHP();
//                    
//                    if(mchp <= 0){
//                        pC.setEnabled(false);
//                        bC.setEnabled(false); 
//                        if(dcc==0){
//                           countMon++;
//                           dcc++;
//                        }
//                        mchp = 0;}
//                    else if(mchp >= mC.getHP())
//                        mchp = mC.getHP();
                    //=====check
                        
                    
                    
                    

//                    System.out.println(php);
//                    System.out.println(pmana);
//                    System.out.println(pexp);
//                    System.out.println(mahp);
//                    System.out.println(mbhp);
//                    System.out.println(mchp);
//
//                    System.out.println("==========");
//                    
                    
                //update
                namehp.setText("HP: "+php+"/"+PlayerJob.getMaxHP());
                armor.setText("Armor: "+parmor+"/100");
                mana.setText("Mana: "+pmana+"/100");
                picexp.setText("EXP: "+pexp);
                piclv.setText("Level: "+plevel);
                pickll.setText("Monster Die: "+countMon);
                pA.setText(mA.getName()+"/ HP: "+mahp);
                pB.setText(mB.getName()+"/ HP: "+mbhp);
                pC.setText(mC.getName()+"/ HP: "+mchp);
                
                if(php<=0){
                    JOptionPane.showMessageDialog(null,"GAME OVER! "+PlayerJob.getName()+" Die R.I.P");
                    setVisible(false);
                    
                    new GUIStart();
                }
                
 
                //===update                          
                                
            }
        });
        
        bC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
            if(mahp==0 && mbhp==0 && mchp==0)
                toCharacter.setEnabled(true);
                 efk.setVisible(false);
                p3.setBackground(null);
                    mchp -= PlayerJob.getDamage();
                    pexp += 10;
                    pmana += 10;
                    
                    if(parmor>0){
                        parmor -= mC.getMonsterDamage();
                        pmana += PlayerJob.getMana();
                    }
                    else if(parmor<=0){
                        php -= mC.getMonsterDamage();
                        pmana += PlayerJob.getMana();
                    }
                    
                    //check
                    if(php<=0){
                        php = 0;
                    }
                    else if(php >= PlayerJob.getMaxHP())
                        php = PlayerJob.getMaxHP();
                    
                    if(parmor <= 0)
                        parmor = 0;
                    else if(parmor >=100){
                        parmor -= 100;
                      
                    }
                    
                    if(pexp <= 0)
                        pexp = 0;
                    else if(pexp >=100){
                        pexp -= 100;
                        plevel++;
                    }

                    if(pmana<=0)
                        pmana =0;
                    else if(pmana >=100){
                        pmana = 100;     
                    }
                    
                    if(pmana >= skill.getMana())
                        skb.setEnabled(true);

                    if(mchp <= 0){
                        itCb.setVisible(true);
                        itC.setVisible(true);
                        
                        if(dcc==0){
                           countMon++;
                           dcc++;
                        }
                        pC.setEnabled(false);
                        bC.setEnabled(false);
                        
                        
                        mchp = 0;}
                    else if(mchp >= mC.getHP())
                        mchp = mC.getHP();
                    
//                    if(mbhp <= 0){
//                        pB.setEnabled(false);
//                        bB.setEnabled(false); 
//                        if(dcb==0){
//                           countMon++;
//                           dcb++;
//                        }
//                        mbhp = 0;}
//                    else if(mbhp >= mB.getHP())
//                        mbhp = mB.getHP();
//                    
//                    if(mchp <= 0){
//                        pC.setEnabled(false);
//                        bC.setEnabled(false); 
//                        if(dcc==0){
//                           countMon++;
//                           dcc++;
//                        }
//                        mchp = 0;}
//                    else if(mchp >= mC.getHP())
//                        mchp = mC.getHP();
                    //=====check
                        
                    
                    
                    

//                    System.out.println(php);
//                    System.out.println(pmana);
//                    System.out.println(pexp);
//                    System.out.println(mahp);
//                    System.out.println(mbhp);
//                    System.out.println(mchp);
//
//                    System.out.println("==========");
//                    
                    
                //update
                namehp.setText("HP: "+php+"/"+PlayerJob.getMaxHP());
                armor.setText("Armor: "+parmor+"/100");
                mana.setText("Mana: "+pmana+"/100");
                picexp.setText("EXP: "+pexp);
                piclv.setText("Level: "+plevel);
                pickll.setText("Monster Die: "+countMon);
                pA.setText(mA.getName()+"/ HP: "+mahp);
                pB.setText(mB.getName()+"/ HP: "+mbhp);
                pC.setText(mC.getName()+"/ HP: "+mchp);
                
                if(php<=0){
                    JOptionPane.showMessageDialog(null,"GAME OVER! "+PlayerJob.getName()+" Die R.I.P");
                    setVisible(false);
                    
                    new GUIStart();
                }
                
 
                //===update                          
                                
            }
        });
        
        toCharacter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                setVisible(false);
                jnv = new Novice(PlayerJob.getName(),PlayerJob.getBasicSkill(),PlayerJob.getWeapon(),PlayerJob.getDamage(),php,pexp,pmoney,pmana,parmor,plevel,countMon);
                new GUIBattleground(jnv,bigbag);
                                
            }
        });
        
        toBag.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                setVisible(false);
                jnv = new Novice(PlayerJob.getName(),PlayerJob.getBasicSkill(),PlayerJob.getWeapon(),PlayerJob.getDamage(),php,pexp,pmoney,pmana,parmor,plevel,countMon);
                new GUIBag(jnv,bigbag);
                                
            }
        });
        
        toShop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                setVisible(false);
                jnv = new Novice(PlayerJob.getName(),PlayerJob.getBasicSkill(),PlayerJob.getWeapon(),PlayerJob.getDamage(),php,pexp,pmoney,pmana,parmor,plevel,countMon);
                new GUIShop(jnv,bigbag);
                                
            }
        });        
        
        itAb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                 if(mahp==0 && mbhp==0 && mchp==0)
                   toCharacter.setEnabled(true);
                int n = JOptionPane.showConfirmDialog(null,"Keep "+iA.getName()+" ?","KEEP",JOptionPane.YES_NO_OPTION);
                
               if(n == JOptionPane.YES_OPTION){
                   bigbag.AddItem(iA);
                   itA.setVisible(false);
                   itAb.setVisible(false);
                   
                   
               }
               
                   
                                
            }
        });
        
        itBb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                 if(mahp==0 && mbhp==0 && mchp==0)
                   toCharacter.setEnabled(true);
                int m = JOptionPane.showConfirmDialog(null,"Keep "+iB.getName()+" ?","KEEP",JOptionPane.YES_NO_OPTION);
                
                if(m == JOptionPane.YES_OPTION){
                   bigbag.AddItem(iB);
                   itB.setVisible(false);
                   itBb.setVisible(false);
                   
               }
                
                
                                
            }
        });
        
        itCb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                 if(mahp==0 && mbhp==0 && mchp==0)
                   toCharacter.setEnabled(true);
                int o = JOptionPane.showConfirmDialog(null,"Keep "+iC.getName()+" ?","KEEP",JOptionPane.YES_NO_OPTION);
                if(o == JOptionPane.YES_OPTION){
                   bigbag.AddItem(iC);
                   itC.setVisible(false);
                   itCb.setVisible(false);
                   
               }
                
                                
            }
        });
        
        skb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                  skb.setEnabled(false);
                  JOptionPane.showMessageDialog(null,"Skill: "+skill.getName()+" (Heal: "+skill.getHeal()+" Damage: "+skill.getDamage()+")");
                  p3.setBackground(Color.black);
                  
                  if(mahp==0 && mbhp==0 && mchp==0)
                      toCharacter.setEnabled(true);
                  
        if(PlayerJob.getName().equals("Swordman")){
            efk.setIcon(new ImageIcon("swk.gif"));
            
        }
        
        else if(PlayerJob.getName().equals("Archer")){
            efk.setIcon(new ImageIcon("ack.gif"));
            
        }
        
        else if(PlayerJob.getName().equals("Magician")){
            efk.setIcon(new ImageIcon("11.gif"));
                    
        }
        
        else if(PlayerJob.getName().equals("Thief")){
            efk.setIcon(new ImageIcon("tfk.gif"));
            
        }
        
        else{
            efk.setIcon(new ImageIcon("nvk.gif"));
            
        }
        
        efk.setVisible(true);
               
                    php += skill.getHeal();
                    pmana -= skill.getMana();
                    pexp += 25;

                    mahp -= skill.getDamage();
                    mbhp -= skill.getDamage();
                    mchp -= skill.getDamage();
                    
                    //check
                    if(php<=0)
                        php = 0;
                    else if(php >= PlayerJob.getMaxHP())
                        php = PlayerJob.getMaxHP();
                    
                    if(parmor <= 0)
                        parmor = 0;
                    else if(parmor >=100){
                        parmor -= 100;
                      
                    }
                    
                    if(pexp <= 0)
                        pexp = 0;
                    else if(pexp >=100){
                        pexp -= 100;
                        plevel++;
                    }
                    
                    
                    
                    if(pmana<=0)
                        pmana =0;
                    else if(pmana >=100)
                        pmana = 100;
                    
                    if(mahp <= 0){
                        
                        pA.setEnabled(false);
                        bA.setEnabled(false); 
                        if(dca==0){
                           itAb.setVisible(true);
                           itA.setVisible(true);
                           countMon++;
                           dca++;
                        }
                         
                        mahp = 0;}
                    else if(mahp >= mA.getHP())
                        mahp = mA.getHP();
                    
                    if(mbhp <= 0){
                        
                        pB.setEnabled(false);
                        bB.setEnabled(false); 
                        if(dcb==0){
                           itBb.setVisible(true);
                           itB.setVisible(true);
                           countMon++;
                           dcb++;
                        }
                        mbhp = 0;}
                    else if(mbhp >= mB.getHP())
                        mbhp = mB.getHP();
                    
                    if(mchp <= 0){
                        
                        pC.setEnabled(false);
                        bC.setEnabled(false); 
                        if(dcc==0){
                           itCb.setVisible(true);
                           itC.setVisible(true);
                           countMon++;
                           dcc++;
                        }
                        mchp = 0;}
                    else if(mchp >= mC.getHP())
                        mchp = mC.getHP();
                    //=====check
                
                    
                //update
                namehp.setText("HP: "+php+"/"+PlayerJob.getMaxHP());
                armor.setText("Armor: "+parmor+"/100");
                mana.setText("Mana: "+pmana+"/100");
                picexp.setText("EXP: "+pexp);
                piclv.setText("Level: "+plevel);
                pickll.setText("Monster Die: "+countMon);
                pA.setText(mA.getName()+"/ HP: "+mahp);
                pB.setText(mB.getName()+"/ HP: "+mbhp);
                pC.setText(mC.getName()+"/ HP: "+mchp);
 
                //===update
 
                                
            }
        });
         
        
         
         //event && Handler
         
         
         
             
        
        
        
        
        
        
        
        
        
        
        
        
        setSize(1020,676);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        
        
        
        
        
    } 
    

    
    
    
  
    
}
