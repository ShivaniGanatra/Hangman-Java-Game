package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Words {
    public String sentence="monkey llama tiger elephant donkey, gorilla lion rhinoceros";
    String[] words = sentence.split(" ");
    ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(words));


    public String selectARandomWord() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    };

    public ArrayList<String> convertWordToStringsArrayList(String word) {
        char[] charsArray = word.toCharArray();
        ArrayList<String> letters = new ArrayList<String>();
        for (int i = 0; i < charsArray.length; i++) {
            letters.add(String.valueOf(charsArray[i]));
        }
        return letters;
    };

    public ArrayList<String> convertWordToHash(ArrayList<String> letters) {
        for (int i = 0; i < letters.size(); i++) {
            if(letters.get(i).matches("[a-z0-9]+")) {
                letters.set(i,"/_") ;
            }
        }
        return letters;
    };

    public String convertArrayListToString(ArrayList<String> letters) {
        return letters.toString();
    }
}

