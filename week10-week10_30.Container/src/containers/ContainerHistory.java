/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author dev
 */
public class ContainerHistory {

    private List<Double> history = new ArrayList<Double>();

    public ContainerHistory() {

    }

    public void add(double situation) {
        history.add(situation);

    }

    public void reset() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        double k = 0;
        if (history.isEmpty()) {
            return 0.0;
        }
        for (int i = 0; i < history.size(); i++) {
            double j = history.get(i);

            if (j > k) {
                k = j;

            }

        }
        return k;
    }

    public double minValue() {
        double k = history.get(0);
        if (history.isEmpty()) {
            return 0.0;
        }

        for (int i = 0; i < history.size(); i++) {
            double min = history.get(i);
            if (k > min) {
                k = min;
            }
        }
        return k;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < history.size(); i++) {
            sum += history.get(i);
        }
        return sum / history.size();
    }

    public double greatestFluctuation() {
        double fluc = maxValue() - minValue();
        double fluc1;
        
        
        double k = 0.0;
        if(history.size() > 2){
            return 0.0;
        }

        for (int i = 0; i < history.size(); i++) {
            

        }
        return abs(fluc);
    }
    
    public double variance() {
        double mean = average();
        
        
        return 0.0;
    }
}

/*or instance, the average of the numbers 3, 2, 7, and 2 is 3.5, and their sample variance 
is therefore ((3 - 3.5)² + (2 - 3.5)² + (7 - 3.5)² + (2 - 3.5)²)/(4 - 1) ˜ 5,666667.) */