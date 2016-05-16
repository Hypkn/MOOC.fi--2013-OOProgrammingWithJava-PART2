
/*import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;
    

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = new Scanner(System.in);
        this.dictionary = new Dictionary();
        
    }

   // public void start() {

      //  System.out.println("Statements:");
     //   System.out.println("add - adds a word pair to the dictionary");
     //  System.out.println("translate - asks a word and prints its translation");
     //   System.out.println("quit - quit the text user interface");
     //   System.out.println();

        /*while (true) {

            System.out.print("Statement: ");
            String command;
            
            command = reader.nextLine();

            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;

            }

            if (command.equals("add")) {
                this.add();
            }

            if (command.equals("translate")) {
                this.translate();
           }else  {
                System.out.println("Unknown statement");
                System.out.println();
           }

        }

 
    
    
    
    public void start() {
        System.out.println("Statement:\n" +
"  quit - quit the text user interface\n\n");
        askUser();
    }
    
    private void askUser() {
        String userInput;
        String[] commands = {"quit", "add", "translate"};
        while (true) {
            System.out.println("Statement: ");
            userInput = reader.nextLine();
            userInput = stringCleaner(userInput);
            if (!Arrays.asList(commands).contains(userInput)) {
                System.out.println("Unknown statement");
                continue;
            }
            if (userInput.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (userInput.equals("add")) {
                add();
            } else if (userInput.equals("translate")) {
                translate();
            }
        }
    }
    
    
        private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

        private void add() {
        System.out.print("In Finnish: ");
        String finnish = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(finnish, translation);
        System.out.println();

    }

      private void translate() {
        System.out.print("Give a word: ");
        String given = reader.nextLine();
        String translated = dictionary.translate(given);
        System.out.println("Translation: "  + translated);
        System.out.println();

    }

}
*/



import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dictionary;        
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        System.out.println("Statement:\n" +
"  quit - quit the text user interface\n\n");
        askUser();
    }
    
    private void askUser() {
        String userInput;
        String[] commands = {"quit", "add", "translate"};
        while (true) {
            System.out.println("Statement: ");
            userInput = reader.nextLine();
            userInput = stringCleaner(userInput);
            if (!Arrays.asList(commands).contains(userInput)) {
                System.out.println("Unknown statement");
                continue;
            }
            if (userInput.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (userInput.equals("add")) {
                add();
            } else if (userInput.equals("translate")) {
                translate();
            }
        }
    }
    
    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
    
    private void add() {
        System.out.println("In Finnish: ");
        String finnish = reader.nextLine();
        System.out.println("Translation: ");
        String trans = reader.nextLine();
        dictionary.add(finnish, trans);
    }
    
    private void translate() {
        System.out.println("Give a word: ");
        String finnish = reader.nextLine();
        String trans = dictionary.translate(finnish);
        System.out.println("Translation: " + trans);
    }
}
