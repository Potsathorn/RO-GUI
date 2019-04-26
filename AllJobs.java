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
public class AllJobs {
    private Jobs job1;
    private Jobs job2;
    private Jobs job3;
    private Jobs job4;
    private Jobs job5;
    
    public AllJobs(){
        this.job1 = new Jobs("Novice","First Aid","Dagger",130);
        this.job2 = new Jobs("Swordman","Sword Mastery","Sword",145);
        this.job3 = new Jobs("Archer","Arrow Repel","Arrow",140);
        this.job4 = new Jobs("Magician","Thunder Storm","Wand",150);
        this.job5 = new Jobs("Thief","Double Attack","Knife",135);
    }
    
    public Jobs getNovice(){
        return job1;
    }
    
    public Jobs getSwordman(){
        return job2;
    }
    
    public Jobs getArcher(){
        return job3;
    }
    
    public Jobs getMagician(){
        return job4;
    }
    
    public Jobs getThief(){
        return job5;
    }
    

    
}
