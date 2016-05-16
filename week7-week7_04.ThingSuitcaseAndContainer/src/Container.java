
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
public class Container {

    private int maximumWeight;
    private ArrayList<Suitcase> suit;

    public Container(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suit = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = 0;
        for (Suitcase stuff : suit) {
            weight += stuff.totalWeight();
        }
        
        weight +=suitcase.totalWeight();
        

        if (this.maximumWeight >= weight) {
            suit.add(suitcase);

        }
        
    }

    public String toString() {
        
        int totalSuitcases = 0;
        int totalWeight = 0;
        
        for(Suitcase stuff: suit){
            totalSuitcases++;
            totalWeight += stuff.totalWeight();
        }

        return totalSuitcases +" suitcases " + "(" + totalWeight +  " kg)";
    }

    public void printThings() {
        for (Suitcase items : suit) {
            items.printThings();
        }
    }
}
