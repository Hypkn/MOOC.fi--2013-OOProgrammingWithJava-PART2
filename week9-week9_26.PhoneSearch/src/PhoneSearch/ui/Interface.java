/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearch.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author dev
 */
public class Interface {

    private Scanner reader;
   

    public Interface(Scanner reader) {
        this.reader = reader;
        

    }

    public void start() {

        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.print(" 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit\n\n");

        while (true) {

            System.out.print("command: ");
            String input = reader.nextLine();
            if (input.equalsIgnoreCase("x")) {
                break;
            }

            if (input.equals("1")) {
                addNumber();

            }

            if (input.equals("2")) {
                searchNumber();
            }

        }
    }
    
    System.out.print("whose number: ");

        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        this.phoneBook.put(name, new ArrayList<String>());

        this.phoneBook.get(name).add(number);
        System.out.println("");

 
    }

 System.out.print("whose number: ");
        String name = reader.nextLine();
        if (!phoneBook.containsKey(name)) {
            System.out.println("not found");
        } else {

            System.out.println(phoneBook.get(name));
        }

}
