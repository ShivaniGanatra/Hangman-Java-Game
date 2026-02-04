package org.example;

import java.util.ArrayList;

public class UserInput {
    public static ArrayList<String> lettersGuessed = new ArrayList<String>();

    public void initialMessage(String initialWord) {
        System.out.println("Hi user your word is " + initialWord);
    }

    public Boolean validInput(String word, String letter) {
        //and letter isnt in array list and letter is only a - z regex
        return Words.convertWordToStringsArrayList(word).contains(letter.toLowerCase());
    }

    public void addToArrayList(String letter) {
        lettersGuessed.add(letter);
    }

    public void askToEnterALetter() {
        System.out.println("Can you enter a letter? ");
    }

}
