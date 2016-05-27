
/* import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 
public class Tournamentb {

    private List<Integer> judges = new ArrayList<Integer>();
    private List<String> Length = new ArrayList<String>();
    private Random rand = new Random();
    private Scanner reader = new Scanner(System.in);
    private int roundNum = 1;
    private Map<String, List<String>> skier = new TreeMap<String, List<String>>();
    private int points;

    public void start() {
        //Skier skiers = new Skier();
        getJumpers();
        jumpOrder();

    }

    private void getJumpers() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        String name = "";
        while (true) {

            name = askName();
            addSkier(name);

            if (name.isEmpty()) {
                System.out.println("The tournament begins!");
                System.out.println("");
                break;

            }
        }

    }

    public void addSkier(String name) {
        if (!skier.containsKey(name) && !name.isEmpty()) {
            skier.put(name, new ArrayList<String>());
        }
    }

    private String askName() {
        System.out.print("Participant name: ");
        String name = reader.nextLine();
        return name;
    }

    private void jumpOrder() {
        String jump = "";
        String first = skier.

        while (true) {

            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            jump = reader.nextLine();

            if (!jump.equalsIgnoreCase("jump")) {
                break;
            }
            System.out.println("");

            System.out.println("Round " + roundNum);
            roundNum++;

            System.out.println("Jumping order:");
            System.out.println("   1. " + "" +);

        }

    }
} */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WONSEOB
 */
public class Tournamentb {
    
    private Scanner reader = new Scanner(System.in);
    private List<Skier> skiers = new ArrayList<Skier>();
    private int round = 1;
    
    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        askNames();
        tournament();
    }
    
    private void askNames() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        String participant;
        while (true) {
            System.out.println("  Participant name: ");
            participant = reader.nextLine();
            if (participant.equals("")) {
                break;
            }
            skiers.add(new Skier(participant));
        }
    }
    
    private void tournament() {
        System.out.println("");
        System.out.println("The tournament begins!");
        String input;
        while (true) {
            System.out.println("\nWrite \"jump\" to jump; otherwise you quit: ");
            input = reader.nextLine();
            if (!(input.equals("jump"))) {
                break;
            }
            round();
        }
        sumup();
    }
    
    private void round() {
        System.out.println("Round "+this.round+"\n");
        System.out.println("Jumping order:");
        int order = 1;
        for (Skier s : skiers) {
            System.out.println("  "+order+". "+s.getName()+" ("+s.getPoint()+" points)");
            s.jump(this.round);
            order++;
        }
        System.out.println("");
        System.out.println("Results of round "+this.round);
        for (Skier s : skiers) {
            System.out.println("  "+s.getName());
            System.out.println("    length: "+s.getResult(this.round).getLength());
            System.out.println("    judge votes: "+s.getResult(this.round).getVotes());
        }
        this.round++;
        Collections.sort(this.skiers);
    }
    
    private void sumup() {
        Collections.reverse(this.skiers);
        System.out.println("Thanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int order = 1;
        for (Skier s : skiers) {
            System.out.println();
            System.out.println(order+"           "+s.getName()+" ("+s.getPoint()+" points)");
            System.out.println("            jump lengths: "+s.allJumps());
        }
    }
}