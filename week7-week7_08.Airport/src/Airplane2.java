
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class Airplane2 {
   private String planeID;
   private int planeCapacity;
   private HashMap<String, Integer> planes;
    
    
    public Airplane2(){
        this.planes = new HashMap<String, Integer>();
        
    }
    
    public String getID(String id){
       return this.planeID;
    }
    
    public void setID(String id){
       this.planeID = id;
    }
    
    public int getCapacity(int capacity){
        return this.planeCapacity;
    }
    
   public void setCapacity(int capacity){
        this.planeCapacity = capacity;
    }
    
    public void addPlane(String id, int capacity){
        planes.put(id, capacity);
        
    }
    
    
    
    
    public String toString(){
        return this.planeID + " (" + this.planeCapacity + " ppl)";
    }
       
    
  
}
