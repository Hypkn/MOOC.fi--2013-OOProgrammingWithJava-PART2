/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author dev
 */
public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
        this.volume = 0;

    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;

    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if ((amount + this.volume) < this.capacity) {
            this.volume += amount;
        } else {
            this.volume = capacity;
        }

    }

    public double getFromTank(double amount) {    // takes the required amount from the tank, or as much as there is left
        if (amount > volume) {
            double takenAmount = volume;
            volume = 0;
            return takenAmount;
        } else {
            volume -= amount;
            return amount;
        }
    }

    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }

}
