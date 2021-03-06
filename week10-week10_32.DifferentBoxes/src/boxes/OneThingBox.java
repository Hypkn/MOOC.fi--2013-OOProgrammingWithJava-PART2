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
public class OneThingBox extends Box{
    
    private List<Thing> things;
    
    public OneThingBox(){
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
       if(things.isEmpty())
           things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(things.contains(thing)){
            return true;
        }
        
        return false;
    }
    
    
}
