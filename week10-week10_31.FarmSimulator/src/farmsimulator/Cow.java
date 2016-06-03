/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author dev
 */
public class Cow implements Milkable, Alive {

    private String name;
    private double capacity;
    private Random rand = new Random();
    private double volume;

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        int index = rand.nextInt(NAMES.length);
        this.name = NAMES[index];
        this.capacity = 15 + rand.nextInt(26);

    }

    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + rand.nextInt(26);
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {  //returns the udder capacity
        return this.capacity;

    }

    public double getAmount() { // returns the amount on milk available in the cow's udders
        return this.volume;

    }

    public String toString() {
        return this.name + " " + Math.ceil(this.volume) + "/" + this.capacity;
    }

    public double milk() {
        double producedMilk = this.volume;
        this.volume = 0.0;
        return producedMilk;

    }

    public void liveHour() {

        double rand = new Random().nextDouble();
        double milkHour = .7 + (rand * (2.0 - .7));
        if ((milkHour + this.volume) < this.capacity) {
            this.volume += milkHour;

        }
        if ((milkHour + this.volume) > this.capacity){
            this.volume = this.capacity;
        }
    }

}
