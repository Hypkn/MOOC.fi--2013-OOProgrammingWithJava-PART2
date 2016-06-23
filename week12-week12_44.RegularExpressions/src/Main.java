
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write test code here
       
       // allVowels("aeioaoauuaua");
        clockTime("17:23:05");
    }
    
    public static boolean isAWeekDay(String string){
        Scanner reader = new Scanner(System.in);
         
        System.out.print("Give a string: ");
       String day = reader.nextLine();
        
        
        if(day.matches("mon|tue|wed|thu|fri|sat|sun")){
            System.out.println("The form is fine");
        return true;
    }
        System.out.println("The form is wrong");
        return false;
    }
    
    public static boolean allVowels(String string){
        
         
        System.out.println("Give a string: " + string);
       
        if(string.matches("^[aeiyou]+$")){
       System.out.println("The form is fine");
        return true;
    }
       
      System.out.println("The form is wrong");
        return false;
    }
     public static boolean clockTime(String string){
        
         
        System.out.println("Give a string: " + string);
       String hours = ("[0-24]");
       String minutes = ("[0-60]");
       String seconds = ("[0-60]");
        if(string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")){
       System.out.println("The form is fine");  //17:23:05
        return true;
    }
       
      System.out.println("The form is wrong");
        return false;
    }
    }

    

