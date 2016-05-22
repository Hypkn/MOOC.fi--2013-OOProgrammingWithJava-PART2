/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;

import java.util.Set;

/**
 *
 * @author dev
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private Set<String> duplicates;
    private int numOfDupes;
   
    
    public PersonalDuplicateRemover(){
        this.duplicates = new HashSet<String>();
        
    }
    
    //stores a characterString if it's not a duplicate
    public void add(String characterString){ 
        if(!this.duplicates.contains(characterString)){
            this.duplicates.add(characterString);
           
        }else{
            numOfDupes++;
        }
        
        
        
    }
    
    //returns the number of detected duplicates
    public int getNumberOfDetectedDuplicates(){
       
       
        return numOfDupes;
    }
    
    
    //returns an object which implements the interface Set<String>. Object should have all unique characterStrings (no duplicates!).
    //If there are no unique characterStrings, method returns an empty set
    public Set<String> getUniqueCharacterStrings(){
        Set<String>uniques = new HashSet<String>();
        
        for(String words : this.duplicates){
            uniques.add(words);
        }
        //return unique;
        
        return uniques;
        
        //or return duplicates;
    }
    
    
    //removes stored characterStrings and resets the amount of detected duplicates
    public void empty(){
        
        this.duplicates.clear();
        numOfDupes = 0;
        
    }
    
    
}
