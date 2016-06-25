/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Dev
 */
public class Employees {
    
    List<Person>employees = new ArrayList<Person>();
    
    public void add(Person person){
        employees.add(person);
    }
    
    public void add(List<Person>persons){
        
        for(Person people: persons){
            employees.add(people);
        }
        
        
    }
    
    public void print(){
        for(Person people : employees){
            System.out.println(people);
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            Person nextEmployee = iterator.next();
            if(nextEmployee.getEducation() == education){
            System.out.println(nextEmployee);
            
        }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            if (iterator.next().getEducation() == education)
            {
                iterator.remove();
            }
        }
    }
}
