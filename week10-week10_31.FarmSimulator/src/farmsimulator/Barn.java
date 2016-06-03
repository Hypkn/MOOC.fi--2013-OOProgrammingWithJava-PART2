/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author dev
 */
public class Barn {

    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
        this.robot = null;

    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {   //installs a milking robot and connects it to the barn bulk tank
        this.robot = milkingRobot;
        robot.setBulkTank(tank);
    }

    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException {  //milks the parameter cows with the help of the milking robot, the method throws an IllegalStateException if the milking robot hasn't been installed
        try {
           for(Cow cow : cows){
              robot.milk(cow);
           }
        } catch (Exception e) {
            throw new IllegalStateException();

        }
    }

    public void takeCareOf(Cow cow) throws IllegalStateException {  // milks the parameter cow with the help of the milking robot, the method throws an IllegalStateException if the milking robot hasn't been installed
        try {
           this.robot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException();

        }
    }
    
    public String toString(){
        return this.tank.toString();
    }
}
