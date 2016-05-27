<<<<<<< HEAD

import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> 7b121a0e4b6362b3f8aa46ef92064256748ffa09
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
<<<<<<< HEAD
    
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
=======
    private int length;
    private int[] votes;
    private Random randomGenerator = new Random();
    
    public Result() {
        this.length = randomGenerator.nextInt(61) + 60;
        this.votes = new int[5];
        for (int i = 0; i < 5; i++) {
            votes[i] = randomGenerator.nextInt(11) + 10;
        }
    }

    public int getLength() {
        return this.length;
    }

    public String getVotes() {
        String returnStr = "[";
        for (int i = 0; i < 4; i++) {
            returnStr = returnStr + votes[i] + ", ";
        } 
        returnStr = returnStr + votes[4] + "]";
        return returnStr;
    }
    
    public int getPoint() {
        return this.length + this.takeValidVotes();
    }
    
    private int takeValidVotes() {
        int validVotesTotal = 0;
        for (int i = 0; i < this.votes.length; i++) {
            validVotesTotal += this.votes[i]; 
        }
        return validVotesTotal-maxValue(this.votes)-minValue(this.votes);
    }
    
    private static int maxValue(int[] votes) {
	int max = votes[0];
	for (int i = 0; i < votes.length; i++) {
		if (votes[i] > max) {
			max = votes[i];
		}
	}
	return max;
    }
    
    private static int minValue(int[] votes) {
	int min = votes[0];
	for (int i = 0; i < votes.length; i++) {
		if (votes[i] < min) {
			min = votes[i];
		}
	}
	return min;
    }
}
>>>>>>> 7b121a0e4b6362b3f8aa46ef92064256748ffa09
