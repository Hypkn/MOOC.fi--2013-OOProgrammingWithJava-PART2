
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class Result {
    
    private int roundNumber;
    private Random rand = new Random();
    private List<Skier>skier;
    private List<Integer>judges = new ArrayList<Integer>();
    
    public Result(){
        roundNumber = 1;
    }
    
    
    public void roundStart(){
        
        System.out.println("Round " + roundNumber);
        roundNumber++;
        
        System.out.println("Jumping order: ");
        
        System.out.println("judge votes: " + judges);
        
    }
    
    public void votes(){
        for(int i = 0; i < 5; i++){
            int randomVotes = rand.nextInt(20-10 +1);
            
            judges.add(randomVotes);
            
        }
        //return judges;
    }
    
}
