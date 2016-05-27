
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class RingingCentre {

    private HashMap<Bird, List<String>> observation = new HashMap<Bird, List<String>>();
    //private int timesObserved = 0;

    public void observations(Bird bird) {
        System.out.print(bird);
        System.out.print(" observations: ");
        if (observation.get(bird) == (null)) {
            System.out.println("0");

        } else {
            System.out.println(observation.get(bird).size());
            for (String s : observation.get(bird)) {
                System.out.println(s);
            }
        }

    }

    public void observe(Bird bird, String place) {

        if (!observation.keySet().contains(bird)) {
            observation.put(bird, new ArrayList<String>());
        }

        observation.get(bird).add(place);
    }

}
