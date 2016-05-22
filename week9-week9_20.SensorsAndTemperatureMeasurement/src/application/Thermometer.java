/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author dev
 */
public class Thermometer implements Sensor {

    private boolean flag;
    private Random rand;

    public Thermometer() {
        this.flag = false;
        rand = new Random();

    }

    @Override
    public void on() {
        this.flag = true;

    }

    @Override
    public void off() {
        this.flag = false;
    }

    @Override
    public boolean isOn() {

        return this.flag;
    }

    @Override
    public int measure() {

        int x = rand.nextInt(30 + 1 + 30) - 30;

        return x;

    }

}
