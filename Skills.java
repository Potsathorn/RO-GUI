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
public class Skills {
    private String SName;
    private int SDamage;
    private int SHeal;
    private int SUsingMana;
    
    public Skills(String sname,int sdamage,int sheal,int susingmana){
        this.SDamage = sdamage;
        this.SHeal = sheal;
        this.SName = sname;
        this.SUsingMana =  susingmana;
    }
    
    public String getName(){
        return SName;
    }
    
    public int getDamage(){
        return SDamage;
    }
    
    public int getHeal(){
        return SHeal;
    }
    
    public int getMana(){
        return SUsingMana;
    }
    
}
