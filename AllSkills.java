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
public class AllSkills {
    private Skills skill1;
    private Skills skill2;
    private Skills skill3;
    private Skills skill4;
    private Skills skill5;
    
    public AllSkills(){
        this.skill1 = new Skills("First Aid",40,0,80);
        this.skill2 = new Skills("Sword Mastery",70,0,90);
        this.skill3 = new Skills("Arrow Repel",30,20,50);
        this.skill4 = new Skills("Thunder Storm",60,30,95);
        this.skill5 = new Skills("Double Attack",50,10,70);         
    }
    
    public Skills getNoviceSkill(){
        return skill1;
    }
    
    public Skills getSwordmanSkill(){
        return skill2;
    }
    
    public Skills getArcherSkill(){
        return skill3;
    }
    
    public Skills getMagicianSkill(){
        return skill4;
    }
    
    public Skills getThiefSkill(){
        return skill5;
    }
    
    
}
