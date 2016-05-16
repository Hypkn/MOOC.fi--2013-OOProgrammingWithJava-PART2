/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dev
 */
public class Box implements Thing {

    private int maxCap;
    private List<Thing> container;

    public Box(int maximumCapacity) {
        this.maxCap = maximumCapacity;
        this.container = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        int currentVolume = 0;
        for (Thing t : container) {
            currentVolume += t.getVolume();
        }
        if ((currentVolume + thing.getVolume()) > maxCap) {
            return false;
        } else {
            container.add(thing);
            return true;
        }
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;
        for (Thing items : container) {
            currentVolume += items.getVolume();
        }
        return currentVolume;
    }
}
