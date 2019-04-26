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
public class Monster extends BaseCharacter{
    private int MDamage;
    
    public Monster(String mname,int mhp,int mdamage){
        super(mname);
        this.CharHP = mhp;
        this.MDamage = mdamage;
        
    }
    
    public int getMonsterDamage(){
        return MDamage;
    }
    
}
