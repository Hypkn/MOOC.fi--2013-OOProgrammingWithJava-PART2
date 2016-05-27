/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dev
 */
public class Group implements Movable {

  private  List<Movable> groups = new ArrayList<Movable>();

    public void move(int dx, int dy) {
        for(Movable m : groups){
            m.move(dx, dy);
                        
        }

    }

    public void addToGroup(Movable movable) {
        groups.add(movable);

    }

    public String toString() {
        String returnString = "";
        
        for(Movable m: groups){
            returnString += m;
            returnString += "\n";
        }
        return returnString;
    }

}
