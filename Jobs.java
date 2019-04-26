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
public class Jobs {
    private String JName;
    private String JSkill;
    private String JWeapon;
    private int JHp;
    
    public Jobs(String jname,String jskill,String jweapon,int jhp){
        this.JName = jname;
        this.JSkill = jskill;
        this.JWeapon = jweapon;
        this.JHp = jhp;
    }
    
    public String getJName(){
        return JName;
    }
    
    public String getJSkill(){
        return JSkill;
    }
    
    public String getJWeapon(){
        return JWeapon;
    }
    
    public int getJHP(){
        return JHp;
    }
        
    
}
