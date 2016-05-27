/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author dev
 */
public class Teacher extends Person {
    
    private int salary;
    
    
    public Teacher(String name, String address,  int salary){
        super(name, address);
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n "+ " salary " + this.salary + " euros/months";
    }
    
    
}
//Pekka Mikkola
  //Korsontie Street 1 03100 Vantaa
  //salary 1200 euros/month