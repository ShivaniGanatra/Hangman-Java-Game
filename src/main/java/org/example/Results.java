package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Results {

    //validate result
    //print message from result

    //    - The word with blanks / correct guesses re-displayed e.g E _ E _ \_ \_ \_ \_
    //    - The letters guessed so far e.g Letters guessed: E G
    //    - The amount of lives left e.g Lives: 8

    public void outputMessage(String hashedWord, ArrayList<String> lettersGuessed, int lives) {
        System.out.printf("""
                The current word id %s\s
                the letters you have guessed include %s\s
                You have %d lives remaining""",hashedWord,lettersGuessed.toString(),lives);
    }

    public Boolean checkIfWordIncludesLetter(ArrayList<String> wordAsArrayList, String letter) {
        return wordAsArrayList.contains(letter);
    }

    //if all letters are capitalised
    public void winningMessage (String word) {
        System.out.println("This is the correct word ");
    }

    //if there are no lives left
    public void losingMessage (String word) {
        System.out.println("This is the incorrect word ");
    }
}
