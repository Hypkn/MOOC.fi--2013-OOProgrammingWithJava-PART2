/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Analysis {

    private File f;

    private char characters;

    public Analysis(File file) {
        this.f = file;

    }

    public int lines() {
        int lineNum = 0;
        try {
            Scanner reader = new Scanner(this.f);

            String line;
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                lineNum++;

            }
            reader.close();
        } catch (Exception e) {
            System.out.println("We couldn't read the file. Error: " + e.getMessage());

        }
        return lineNum;
    }

    public int characters() {
        int charNum = 0;
        try {
            Scanner reader = new Scanner(this.f);
            reader.useDelimiter("");

            String character;
            while (reader.hasNext()) {
                character = reader.next();
                charNum++;

            }
            reader.close();
        } catch (Exception e) {
            System.out.println("We couldn't read the file. Error: " + e.getMessage());

        }
        return charNum;
    }

}
