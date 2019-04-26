/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playgame;

import java.util.ArrayList;

/**
 *
 * @author Potsathron
 */
public class Bag {
    private ArrayList<Item> items;
    private int MaxBag;
    
    public Bag(){
        items = new ArrayList<Item>();
        MaxBag = 20;
        
    }
    
    public boolean AddItem(Item item){
        if(items.size() <= MaxBag ){
            items.add(item);
            return true;
        }
        else
            return false;
            
    }
    
    public void ItemList(){
        for(Item item : items){
            System.out.println(item);
        }
            
    }
    
    public int findItem(String NameItem)
    {
    for (int i = 0; i < this.items.size(); i++)
    {
        Item item = items.get(i);
        if (item.getName().equals(NameItem))
        {
            return i;
        }
    } 
   
    return -1;
    }
    
    public void removeItem(int index){
        if(index >= 0 && index <= items.size()){
            items.remove(index);
        }
         
    }
    
    public int countItem(String nameitem){
        int count = 0;
    for (int i = 0; i < this.items.size(); i++)
    {
        Item item = items.get(i);
        if (item.getName().equals(nameitem))
        {
            count++;
        }
    } 
   
    return count;    
    }
    
    

}
