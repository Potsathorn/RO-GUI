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
public class ArmorShopItem extends Item {
    private int Armor;
    private float Price;
    
    public ArmorShopItem(String Aname,int armor){
        super(Aname);
        this.Armor = armor;
        this.Price = 200;
    }
    
    public int getArmor(){
        return Armor;
    }
    
    public  float getPrice(){
        return Price;
    }
}
