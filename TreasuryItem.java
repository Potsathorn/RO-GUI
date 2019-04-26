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
import java.util.ArrayList;
import java.util.Random;

public class TreasuryItem {
    private ArrayList<Item> AllItems;
    public HealingItem item1 = new HealingItem("Onigiri",30,10);
    public HealingItem item2 = new HealingItem("Meat",40,12);
    public HealingItem item3 = new HealingItem("Potions",50,15);
    public WeaponItem item4 = new WeaponItem("Dagger",14,1,25);
    public WeaponItem item5 = new WeaponItem("Sword",17,2,30);
    public WeaponItem item6 = new WeaponItem("Arrow",10,3,27);
    public WeaponItem item7 = new WeaponItem("Wand",13,2,25);
    public WeaponItem item8 = new WeaponItem("Knife",15,3,29);
    public MoneyItem item9 = new MoneyItem("Gold",120);
    public MoneyItem item10 = new MoneyItem("Crystal",150);
    Random rand = new Random();
    
    public TreasuryItem(){
        this.AllItems = new ArrayList();
        AllItems.add(item1);
        AllItems.add(item2);
        AllItems.add(item3);
        AllItems.add(item4);
        AllItems.add(item5);
        AllItems.add(item6);
        AllItems.add(item7);
        AllItems.add(item8);
        AllItems.add(item9);
        AllItems.add(item10);
    }
    
    public Item ItemDrop(){
        int i = rand.nextInt(10);
        return AllItems.get(i); 
    }
    
    public Item getItem(int i){
        return AllItems.get(i); 
    }
    

    
    
}
