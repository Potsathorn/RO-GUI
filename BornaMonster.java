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

public class BornaMonster {
    private ArrayList<Monster> AllMonster;
    public Monster mon5 = new Monster("Syringe",60,7);
    public Monster mon2 = new Monster("Dragon",70,8);
    public Monster mon3 = new Monster("Medusabug",80,9);
    public Monster mon4 = new Monster("Rattlesnake",100,10);
    public Monster mon1 = new Monster("Eyeguy",120,11);
    Random rand = new Random(); 
    
    public BornaMonster(){
        this.AllMonster = new ArrayList();
        AllMonster.add(mon1);
        AllMonster.add(mon2);
        AllMonster.add(mon3);
        AllMonster.add(mon4);
        AllMonster.add(mon5);
        
    }
    
    public Monster ReleaseMonster(){
        int i = rand.nextInt(5);
        return AllMonster.get(i); 
    }
    
}
