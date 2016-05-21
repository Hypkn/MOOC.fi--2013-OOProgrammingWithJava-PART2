/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author dev
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> dict;

    public PersonalMultipleEntryDictionary() {
        this.dict = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (!dict.containsKey(word)) {
            dict.put(word, new HashSet<String>());
        }
        this.dict.get(word).add(entry);
       // Set<String> added = this.dict.get(word);
        // added.add(entry);

    }

    @Override
    public Set<String> translate(String word) {
        Set<String> translated = new HashSet<String>();

        if (!this.dict.containsKey(word)) {
            return null;
        }

        return this.dict.get(word);

    }

   // return translated ;


@Override
        public void remove(String word) {
      
      this.dict.remove(word);
    }
    
    
}
