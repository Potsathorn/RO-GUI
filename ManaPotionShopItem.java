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
public class ManaPotionShopItem extends Item {
    private int Mana;
    private float Price;
    
    public ManaPotionShopItem(String Mname,int mana){
        super(Mname);
        this.Mana = mana;
        this.Price = 180;
    }
    
    public int getMana(){
        return Mana;
    }
    
    public float getPrice(){
        return Price;
    }
    
}
