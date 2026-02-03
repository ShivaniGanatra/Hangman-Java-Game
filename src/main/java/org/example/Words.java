package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Words {
    public String sentence="Monkey LLama Tiger Elephant Donkey, Gorilla Lion Rhinoceros";
    String [] words = sentence.split(" ");
    ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(words));


    public String selectARandomWord() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    };

    public ArrayList<String> convertWordToStringcharArrayList(String word) {
        char[] charsArray = word.toCharArray();
        ArrayList<String> letters = new ArrayList<String>();
        for (int i = 0; i < charsArray.length; i++) {
            letters.add(String.valueOf(charsArray[i]));
        }
        return letters;
    };

    public String convertWord(ArrayList<String> letters) {
        for (int i = 0; i < letters.size(); i++) {
            letters.set(i,"/_") ;
        }
        return String.join(" ", letters);
    };

}

