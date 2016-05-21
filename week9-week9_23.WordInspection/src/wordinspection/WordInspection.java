/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class WordInspection {

    private File f;
    private final String vowels = "aeiouyäö";

    public WordInspection(File file) throws Exception {
        this.f = file;

    }

    public int wordCount() {
        int wordCount = 0;
        try {
            Scanner reader = new Scanner(this.f, "UTF-8");
            ;
            while (reader.hasNextLine()) {
                reader.next();

                wordCount++;
            }

        } catch (Exception e) {
            System.out.println("We couldn't reade the file Error: " + e.getMessage());
        }
        return wordCount;
    }

    public List<String> wordsEndingInL() {
        // List<String> words = new ArrayList<String>();
        List<String> file = new ArrayList<String>();
        String line;
        try {
            Scanner reader = new Scanner(this.f, "UTF-8");

            while (reader.hasNext()) {
                line = reader.next();
                if (line.endsWith("l")) {
                    file.add(line);

                }
            }
            reader.close();

            //  for (String word : file) {
            //    int lastChar = word.length() - 1;
            //    //char last = word.charAt(lastChar);
            //    if (word.charAt(lastChar) == 'l') {
            //        words.add(word);
//
            //     }
            // }
        } catch (Exception e) {
            System.out.println("We couldn't reade the file Error: " + e.getMessage());
        }
        return file;
    }

    public List<String> wordsContainingZ() {
        // List<String> words = new ArrayList<String>();
        List<String> file = new ArrayList<String>();
        String line;
        try {
            Scanner reader = new Scanner(this.f, "UTF-8");

            while (reader.hasNext()) {
                line = reader.next();
                if (line.contains("z")) {
                    file.add(line);
                }

            }

            reader.close();

        } catch (Exception e) {
            System.out.println("We couldn't reade the file Error: " + e.getMessage());
        }

        return file;
    }

    public List<String> palindromes() {
        List<String> file = new ArrayList<String>();
        String line;

        try {
            Scanner reader = new Scanner(this.f, "UTF-8");

            while (reader.hasNext()) {
                line = reader.next();
                if (line.equals(new StringBuilder(line).reverse().toString())) {
                    file.add(line);
                }
            }
            reader.close();

        } catch (Exception e) {
            System.out.println("We couldn't reade the file Error: " + e.getMessage());
        }

        return file;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> file = new ArrayList<String>();
        String line;
        int found = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'ä', 'ö'};
        try {
            Scanner reader = new Scanner(this.f, "UTF-8");

            while (reader.hasNext()) {
                line = reader.next();

                if (line.contains("a") && line.contains("e") && line.contains("i") && line.contains("o") && line.contains("u") && line.contains("y") && line.contains("ä") && line.contains("ö")) //}
                {
                    file.add(line);
                }

            }
            reader.close();
        } catch (Exception e) {
            System.out.println("We couldn't reade the file Error: " + e.getMessage());
        }

        return file;
    }

    private boolean containsAllVowels(String word) {
        for (char vowel : this.vowels.toCharArray()) {
            if (!word.contains("" + vowel)) {
                return false;
            }
        }
        return true;
    }
}


