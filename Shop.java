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
public class Shop {
    private float ShopMoney;
    private ArmorShopItem ShopArmor;
    private ManaPotionShopItem ShopManaPotion;
    
    public Shop(){
        this.ShopMoney= 999999;
        this.ShopArmor = new ArmorShopItem("Armor",100);
        this.ShopManaPotion = new ManaPotionShopItem("Mana Potion",75);
    }
    
    public void Sell(String ShopItem){
        Wallet money = new Wallet();
        if(ShopItem.equals("Armor")){
            ShopMoney += ShopArmor.getPrice();  
            
        }
        else{
            ShopMoney += ShopManaPotion.getPrice(); 
           
        }
                   
    }
    
    public void Buy(float PriceItem){
        ShopMoney -= PriceItem; 
        
    }
    
    public float getMoney(){
        return this.ShopMoney; 
        
    }
    
}
