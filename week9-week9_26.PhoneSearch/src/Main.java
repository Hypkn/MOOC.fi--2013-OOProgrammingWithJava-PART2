
import PhoneSearch.ui.Interface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.

        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        

        Interface menu = new Interface();
        menu.start();
    }
}

/*The exercise can be worth 1-5 points. To receive one point, you should implement the following functionality:

 1 adding a phone number to the relative person
 2 phone number search by person
 to receive two points we also require

 3 name search by phone number
 to receive three points also

 4 adding an address to the relative person
 5 personal information search (search for a person's address and phone number)
 if you want to receive four points, also implement

 6 removing a person's information
 and to receive all the points:

 7 filtered search by keyword (retrieving a list which must be sorted by name in alphabetic order), the keyword can appear in the name or address
 An example of how the program works:

 phone search
 available operations:
 1 add a number
 2 search for a number
 3 search for a person by phone number
 4 add an address
 5 search for personal information
 6 delete personal information
 7 filtered listing
 x quit */


