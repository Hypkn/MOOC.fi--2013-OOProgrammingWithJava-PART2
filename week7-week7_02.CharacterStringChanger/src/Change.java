/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class Change {
    
    private char fromCharacter;
    private char toCharacter;
    
    
    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    
    public String change(String characterString){
        
        String replacedA = "";
       
        for(int i = 0; i < characterString.length(); i++){
            char character = characterString.charAt(i);
            if(character == fromCharacter){
               //character = this.toCharacter;
                replacedA  += toCharacter;
            }else{
                replacedA += character;
            }
            
        }
        return replacedA;
    }
    


public String changeMethod(String characterString){
    
return characterString.replace(fromCharacter, toCharacter);
}
}
