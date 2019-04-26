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
public class WeaponItem extends Item{
    private int Damage;
    private int WLevel;
    private float Price;
    
    public WeaponItem(String name,int damage,int wlevel,float price){
        super(name);
        this.Damage = damage;
        this.WLevel = wlevel;
        this.Price = price;
        
    }
    
    public int getDamage(){
        return Damage;
    }
    
    public float getPrice(){
        return Price;
    }
    
       
}
