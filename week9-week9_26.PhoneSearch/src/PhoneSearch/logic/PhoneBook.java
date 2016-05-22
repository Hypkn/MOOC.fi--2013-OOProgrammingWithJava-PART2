/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearch.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dev
 */
public class PhoneBook {
    
       private Map<String, String> persons = new HashMap<String, String>();
       private Map<String, List<String>> numbers = new HashMap<String, List<String>>();
       private Map<String, List<String>> address = new HashMap<String, List<String>>();
       private Map<String, List<String>> personsByAddress = new HashMap<String, List<String>>();
    
       public void addNumber(String name, String number) {
           if(!numbers.containsKey(name)){
               numbers.put(name , new ArrayList<String>());
               
           }
           numbers.get(name).add(number);
           persons.put(number,name );
           
           if(!address.containsKey(name)){
               address.put(name, new ArrayList<String>());
           }
       }
       
       public void searchNumber(String name){
           
       }
        

    }

    public void searchNumber() {

       

    
}
