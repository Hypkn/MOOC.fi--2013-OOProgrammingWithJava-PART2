/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;

/**
 *
 * @author dev
 */
public class ContainerHistory {
    
    private ArrayList<Double>history;
    
    public ContainerHistory(){
        
    }
    
    public void add(double situation){
        history.add(situation);
        
    }
    
    public void reset(){
        history.clear();
    }
    
    public String toString(){
        return history.toString();
    }
    
}
