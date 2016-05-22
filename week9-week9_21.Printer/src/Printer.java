
import java.io.File;
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
public class Printer {
    private Scanner reader;
    private File file;
    
    public Printer(String fileName) throws Exception{
        
        file = new File(fileName);
        
    }
    
    
    public void printLinesWhichContain(String word) throws Exception{
       this.reader = new Scanner(this.file);
       while(reader.hasNextLine()){
           String line = reader.nextLine();
           if(line.contains(word)){
               System.out.println(line);
           }
           
           
       }
       reader.close();
        
    }
}
