/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Dev
 */
public class Person {
    
    private String name;
    private Education title;
    private Education education;
    
    public Person(String name, Education title){
        this.name = name;
        this.title = title;
    }
    
    public Education getEducation(){
        return education;
    }
    
    @Override
    public String toString(){
        return name + ", " + title;
    }
    
}
