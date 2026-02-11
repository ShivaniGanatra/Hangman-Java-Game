package org.example;

import java.util.ArrayList;
import java.util.Random;

public class WordUtils { //change class name change to wordsUtil

    public static HangmanWords selectARandomWord() {
        return HangmanWords.values()[new Random().nextInt(HangmanWords.values().length)];
    }
        //int index = random.nextInt(words.length);
        //return words[index];


    public static ArrayList<String> convertWordToStringsArrayList(String word) {
        char[] charsArray = word.toCharArray();
        ArrayList<String> letters = new ArrayList<>();
        for (int i = 0; i < charsArray.length; i++) {
            letters.add(String.valueOf(charsArray[i]));
        }return letters;
    }

    public static String convertStringArrayListToString(ArrayList<String> letters) {
        return letters.toString().replace("[", "").replace("]", "").replace(", ", "");
    }

    public static String convertWordToHash(String letters) {
        //stop arraylist from mutating
        ArrayList<String> copyOfLetters = new ArrayList<>(convertWordToStringsArrayList(letters));
        for (int i = 0; i < copyOfLetters.size(); i++) {
            if(copyOfLetters.get(i).matches("[a-z]+")) {
                copyOfLetters.set(i,"_/ ") ;
            }
        }
        return convertStringArrayListToString(copyOfLetters);
    }

    public static String changeLetterToCapital(String word, String letter) {
        ArrayList<String> wordAsArrayList = new ArrayList<>(convertWordToStringsArrayList(word));
        letter = letter.toLowerCase();
        for (int i = 0; i < wordAsArrayList.size(); i++) {
            if(wordAsArrayList.get(i).equals(letter)){
                wordAsArrayList.set(i, wordAsArrayList.get(i).toUpperCase());
            }
        }
        return convertStringArrayListToString(wordAsArrayList);
    }
}

