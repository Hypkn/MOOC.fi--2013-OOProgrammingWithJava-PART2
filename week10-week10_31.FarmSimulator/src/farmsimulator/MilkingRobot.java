/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author dev
 */
public class MilkingRobot implements Milkable {
    private BulkTank tank;
    
    
    public MilkingRobot(){
        this.tank = null;
    }
    
    
    public double milk(){
        return 0.0;
    }
    
   public BulkTank getBulkTank(){
      
         return tank;
    }
    
    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }
    
   public void milk(Milkable milkable) throws IllegalStateException{
       try {
           tank.addToTank(milkable.milk());
       }catch(Exception e)    {
           throw new IllegalStateException();
       }
       
        
    }
    
    
    
}
