
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class Box implements ToBeStored {

    private double maxWeight;

    private ArrayList<ToBeStored> stuff;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.stuff = new ArrayList<ToBeStored>();
    }

    public double weight() {
        double weight = 0;

        for (ToBeStored items : stuff) {
            if (items.weight() > this.maxWeight) {
                return 0;
            }
            weight += items.weight();

        }
        return weight;
    }

    public void add(ToBeStored thing) {
        double totalWeight = this.weight() + thing.weight();
        if (!(totalWeight > this.maxWeight)) {
            this.stuff.add(thing);

        }
    }

    public String toString() {

        return "Box: " + this.stuff.size() + " things, total weight " + weight() + " kg";

    }

}
