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

    public ArrayList<String> convertArraylistToHashArraylist(ArrayList<String> letters) {
        //stop arraylist from mutating
        ArrayList<String> copyOfLetters = new ArrayList<>(letters);
        for (int i = 0; i < copyOfLetters.size(); i++) {
            if(copyOfLetters.get(i).matches("[a-z]+")) {
                copyOfLetters.set(i,"/_") ;
            }
        }
        return copyOfLetters;
    };

    public String convertArrayListToString(ArrayList<String> letters) {
        return letters.toString();
    }

    public ArrayList<String> changeLetterToCapital(ArrayList<String> wordAsArrayList, String letter) {
        for (int i = 0; i < wordAsArrayList.size(); i++) {
            if(wordAsArrayList.get(i).equals(letter)){
                wordAsArrayList.set(i, wordAsArrayList.get(i).toUpperCase());
            }
        }
        return wordAsArrayList;
    };


}

