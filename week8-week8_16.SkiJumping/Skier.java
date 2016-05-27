
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class Skier {

    private String name;
    private String jumpLength;
    private Random rand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
    }

    public String getJumpLength() {
        return jumpLength;
    }

    public void setJumpLength(String jumpLength) {
        this.jumpLength = jumpLength;
    }

}
