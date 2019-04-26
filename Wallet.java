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
public class Wallet {
    private float Money;
    
    public Wallet(){
        this.Money = 0;
    }
    
    public float getMoney(){
        return this.Money;
    }
    
    public void ReceiveMoney(float price){
        this.Money+=price;
    }
    
    public void PayMoney(float price){
        this.Money-=price;
    }
    
}
