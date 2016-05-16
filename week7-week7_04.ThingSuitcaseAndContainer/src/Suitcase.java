
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
public class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {

        this.maxWeight = maxWeight;
        things = new ArrayList<Thing>();

    }

    public void addThing(Thing thing) {

        int weight = 0;
        for (Thing stuff : things) {
            weight += stuff.getWeight();
        }
        weight += thing.getWeight();

        if (this.maxWeight >= weight) {
            things.add(thing);

        }

    }

    public String toString() {

        int weight = 0;
        for (Thing stuff : things) {
            weight += stuff.getWeight();
        }

        int amount = things.size();
        if (amount == 0) {
            return "empty " + "(" + weight + " kg)";
        }
        
        if(amount == 1){
           return amount + " thing " + "(" + weight + " kg)"; 
        }

        return amount + " things " + "(" + weight + " kg)";
    }

    public void printThings() {
        for (Thing stuff : things) {
            System.out.println(stuff);
        }

    }

    public int totalWeight() {
        //int totalWeight = 0;
        int weight = 0;
        for (Thing stuff : things) {
            weight += stuff.getWeight();
        }
        return weight;
    }

    public  Thing heaviestThing() {
       Thing heaviest = null;
       
       
       if(!things.isEmpty()){
          heaviest = things.get(0);
        for(int i = 0; i < things.size(); i++){
          if(things.get(i).getWeight() >= heaviest.getWeight()){
              heaviest = things.get(i);
          }
         
           
            
        }
         
       
        
      
    }
         return heaviest;
    }
}

    

