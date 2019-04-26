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
public class Novice extends BaseCharacter{
    private int NMana;
    private int NArmor;
    private int NEXP;
    private int NLevel;
    private int NDamage;
    private float NMoney;
    private int NKillMonster;
    private String NWeapon;
    private String NSkill;
    private Bag Nbag;
    
    private int NMaxMana;
    private int NMaxEXP;
    
    public Novice(String nname,String nbasicskill,String nweapon,int ndamage,int nhp,int nexp,float nmoney,int nmana,int narmor,int nlevel,int nkillmon){
        super(nname);
        this.CharHP = nhp;
        this.NMana = nmana;
        this.NArmor = narmor;
        this.NWeapon = nweapon;
        this.NEXP = nexp;
        this.NMoney = nmoney;
        this.NLevel = nlevel;
        this.NDamage = ndamage;
        this.NSkill = nbasicskill;
        this.NKillMonster = nkillmon;
        
        this.MaxCharHP = 100;
        this.NMaxMana = 0;
        this.NMaxEXP = 0;
        
        this.Nbag = new Bag();
        
    }
    public int getMaxHP(){
        if(NWeapon.equals("Dagger") )
            return 130;
        else if(NWeapon.equals("Sword"))
            return 145;
        else if(NWeapon.equals("Arrow"))
            return 140;
        else if(NWeapon.equals("Wand"))
            return 150;
        else
            return 135;
    }
    
    public int getMana(){
        return NMana;
    }
    
    public int getArmor(){
        return NArmor;
    }
    
    public int getEXP(){
        return NEXP;
    }
    
    public int getLvel(){
        return NLevel;
    }
    
    public int getDamage(){
        return NDamage;
    }
    
    public int getKillMonster(){
        return NKillMonster;
    }
    
    public float getMoney(){
        return NMoney;
    }
     
    public String getWeapon(){
        return NWeapon;
    }
    
    public String getBasicSkill(){
        return NSkill;
    }
    
    
    public void keepItem(Item item){
	Nbag.AddItem(item);
    }
    

    
    public boolean LevelUp(){
        if(NEXP == NMaxEXP){
            NLevel++;
            return true;
        }
        else
            return false;
        
    }
    
    public void gainExperience(int exp){
        NEXP+=exp;
        LevelUp();
   
    }
    

    
    
    
    
    
}
