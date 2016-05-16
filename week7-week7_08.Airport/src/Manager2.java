
import java.util.HashMap;
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
public class Manager2 {

    private Scanner reader;
    private HashMap<String, Airplane2> flights;
    private Airplane2 plane;

    public Manager2(Scanner reader, Airplane2 plane) {
        this.reader = reader;
        this.flights = new HashMap<String, Airplane2>();
        this.plane = plane;

    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        askUser();

    }

    private void askUser() {
        String userInput;
        int[] commands = {1, 2};
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            userInput = reader.nextLine();
            userInput = stringCleaner(userInput);

            if (userInput.equals("x")) {
                break;
            }

            if (userInput.equals("1")) {
                addPlane();
            }

            if (userInput.equals("2")) {
                addFlight();
            }

        }

    }

    private void addPlane() {

        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();

        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        plane.addPlane(planeID, capacity);

    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();
        
        
        
        

    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

}
