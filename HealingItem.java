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
public class HealingItem extends Item{
    private int Heal;
    private int Mana;
    
    
    public HealingItem(String name,int heal,int mana){
        super(name);
        this.Heal = heal;
        this.Mana = mana;
    }
    
    public int getHeal(){
        return Heal;
    }
    
    public int getMana(){
        return Mana;
    }
    
}
