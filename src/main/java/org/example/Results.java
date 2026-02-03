package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Results {
    public ArrayList<String> changeLetterToCapital(ArrayList<String> wordAsArrayList, String letter) {
        for (int i = 0; i < wordAsArrayList.size(); i++) {
            if(wordAsArrayList.get(i).equals(letter)){
                wordAsArrayList.set(i, wordAsArrayList.get(i).toUpperCase());
            }
        }
        return wordAsArrayList;
    };

    public void correctInput(String word) {
        System.out.println("Hi user you corrctly used the word ");
    }
}
