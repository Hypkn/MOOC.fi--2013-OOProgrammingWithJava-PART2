/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author dev
 */
public class Farm implements Alive {
    
    
    private Barn barn;
    private String name;
    private List<Cow>cows = new ArrayList<Cow>();  
    //private Cow c;
    
    public Farm(String name, Barn barn){
        this.name = name;
        this.barn = barn;
    }
    
    public void liveHour(){
      for(Cow c: cows){
          c.liveHour();
      }
    }
    
    public String getOwner(){
        return this.name;
    }
    
    public void addCow(Cow cow){
      
        this.cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
    
    public void manageCows(){
        this.barn.takeCareOf(cows);
    }
    
    public String toString(){
        String animals = "";
        String line = "\n";
        for(Cow c: cows){
            animals += c + line;
        }
        if(cows.isEmpty()){
            return "Now cows.";
        }
        
        return "Farm owner: " + this.name + "\n" + "Barn bulk tank: " + this.barn.toString() + "\n" + "Animals: \n" + animals ;
    }
    
}
