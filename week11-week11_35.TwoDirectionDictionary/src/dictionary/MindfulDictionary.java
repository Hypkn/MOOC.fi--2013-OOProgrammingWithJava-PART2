/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Dev
 */
public class MindfulDictionary {

    private String file;

    private Map<String, String> dictTrans = new HashMap<String, String>();
    private Map<String, String> dictWord = new HashMap<String, String>();

    public MindfulDictionary() {

    }

    public MindfulDictionary(String file) {
        this.file = file;

    }

    public void add(String word, String translation) {
        if (!dictTrans.containsKey(translation)) {
            dictTrans.put(translation, word);
        }

        if (!dictWord.containsKey(word)) {
            dictWord.put(word, translation);
        }
    }

    public String translate(String word) {

        if (dictTrans.containsKey(word)) {
            return dictTrans.get(word);
        } else if (dictWord.containsKey(word)) {
            return dictWord.get(word);
        }

        return null;

    }

    public void remove(String word) {
        String translation1 = dictTrans.get(word);
        String translation2 = dictWord.get(word);
        dictTrans.remove(word);
        dictTrans.remove(translation1);
        dictTrans.remove(translation2);
        dictWord.remove(word);
        dictWord.remove(translation1);
        dictWord.remove(translation2);

    }

    public boolean load() {

        try {
            File f = new File(this.file);
            Scanner fileReader = new Scanner(f);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            fileReader.close();
        } catch (Exception e) {
            return false;
        }

        return true;

    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);
            for (String word : dictTrans.keySet()) {
                writer.write(word);
                writer.write(":");
                writer.write(dictTrans.get(word));
                writer.write("\n");
            }
            writer.close();
        } catch (Exception e) {
            return false;
        }
    

return true;
    }
}
