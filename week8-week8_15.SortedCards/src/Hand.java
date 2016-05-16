
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class Hand implements Comparable<Hand> {
    
    
    private ArrayList<Card> cards = new ArrayList<Card>();
    
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        for(Card items : cards){
            System.out.println(items);
        }
        
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    
    public int compareTo(Hand hand){
        int values1 = 0;
        int values2  = 0;
        for(Card items: this.cards){
          values1 += items.getValue();
            
        }
        for(Card items : hand.cards ){
            values2 += items.getValue();
        }
        return  values1 - values2;
    }
    
    
    public void sortAgainstSuit(){
      // SortAgainstSuit suitSorter = new SortAgainstSuit();
       
       
       //Collections.sort(cards, suitSorter);
       Collections.sort(cards, new SortAgainstSuitAndValue());
    }
    
}
