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
public class BaseCharacter {
    private String CharNameorJob;
    protected int CharHP;    
    protected int MaxCharHP;
    
    public BaseCharacter(String name){
        this.CharNameorJob = name;
        CharHP = 0;
        MaxCharHP = 0;
        
    }
    
    public String getName(){
        return CharNameorJob;
    }
    
    public int getHP(){
        return CharHP;
    }
    
    public boolean isDead(){
        if(CharHP <= 0 )
            return true;
        return false;
    }
    
}
