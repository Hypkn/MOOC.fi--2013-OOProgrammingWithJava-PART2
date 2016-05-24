
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class Tournament {

    private Scanner reader;
    private List<Skier> participant = new ArrayList<Skier>();

    public Tournament(Scanner reader) {
        this.reader = reader;
    }

    public void start() {
        menu();
    }

    public void menu() {

        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        System.out.print(" Participant Name: ");
        String command = reader.nextLine();
        while (true) {
            addSkiers(command);
            if (command.isEmpty()) {
                System.out.println("The tournament begins!");
                break;
            }
            startJump();
        }
    }

    public void startJump() {
        Result results = new Result();

        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        String command = reader.nextLine();
        if (command.equalsIgnoreCase("jump")) {
            results.roundStart();

        }else{
            
        }
    }

    public void addSkiers(String name) {

        Skier skier = new Skier();

        this.participant.add(skier);
        System.out.println(participant);

    }
}


