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
public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> things = new ArrayList<Thing>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        int weight = 0;
        for (Thing t : things) {
            weight += t.getWeight();
        }
        if (weight < this.maxWeight ||  thing.getWeight() == 0) {
            things.add(thing);
        }

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (things.contains(thing)) {
            return true;
        }
        return false;
    }
}
