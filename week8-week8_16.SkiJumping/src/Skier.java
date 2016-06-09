<<<<<<< HEAD

import java.util.Random;
=======
import java.util.HashMap;
import java.util.Map;
>>>>>>> 7b121a0e4b6362b3f8aa46ef92064256748ffa09

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
<<<<<<< HEAD
public class Skier {

    private String name;
    private String jumpLength;
    private Random rand;
=======
public class Skier implements Comparable<Skier> {
    private String name;
    private Map<Integer, Result> results;

    public Skier(String name) {
        this.name = name;
        this.results = new HashMap<Integer, Result>();
    }
>>>>>>> 7b121a0e4b6362b3f8aa46ef92064256748ffa09

    public String getName() {
        return name;
    }
<<<<<<< HEAD

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
=======
    
    public int getPoint() {
        int point = 0;
        for (Result R : results.values()) {
            point += R.getPoint();
        }
        return point;
    }
    
    public Result getResult(int round) {
        return this.results.get(round);
    }
    
    public void jump(int round) {
        results.put(round, new Result());
    }
    
    public String allJumps() {
        String str = "";
        for (Result r : results.values()) {
            str = str + r.getLength() + " m,";
        }
        str = str.substring(0, str.length()-1); // remove last ','
        return str;
    }

    @Override
    public int compareTo(Skier o) {
        return this.getPoint() - o.getPoint();
    }
    
    
}
>>>>>>> 7b121a0e4b6362b3f8aa46ef92064256748ffa09
