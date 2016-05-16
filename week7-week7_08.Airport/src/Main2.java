
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Airplane2 plane = new Airplane2();
        
        Manager2 manager = new Manager2(reader, plane);
        
        manager.start();
    }
}
