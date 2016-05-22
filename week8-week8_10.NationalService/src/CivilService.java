/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class CivilService implements NationalService{
    
    private int daysLeft;
    
    
    public CivilService() {
        this.daysLeft = 362;
    }
    
    public void work() {
        if (daysLeft > 0) {
            daysLeft--;

        }
    }
    
    
    public int getDaysLeft(){
        if(daysLeft >= 0){
        return this.daysLeft;
    }
        return 0;
    }
    
}
