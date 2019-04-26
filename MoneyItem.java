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
public class MoneyItem extends Item {
    private float Cost;
    
    public MoneyItem(String name,float cost){
        super(name);
        this.Cost = cost;
    }
    
    public float getCost(){
        return Cost;
    }
    
}
