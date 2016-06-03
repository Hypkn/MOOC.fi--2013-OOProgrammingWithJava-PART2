/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dev
 */
public class BlackHoleBox extends Box {
    
    private List<Thing>things = new ArrayList<Thing>();
    
    public BlackHoleBox(){
        
    }
    
    public void add(Thing thing){
        things.add(thing);
    }
    
    public boolean isInTheBox(Thing thing){
        return false;
    }
    
}
