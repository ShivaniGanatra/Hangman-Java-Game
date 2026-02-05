package org.example;

import java.util.ArrayList;
import java.util.Objects;

import static org.example.Words.convertStringArrayListToString;
public class Results {
    public void outputMessage(String hashedWord, ArrayList<String> lettersGuessed, int lives) {
        System.out.printf("""
            The current word is: %s\s
            the letters you have guessed include: %s\s
            You have %d lives remaining \n""",hashedWord,lettersGuessed,lives);
    }

    public void winningMessage (String word) {
        System.out.printf("This is the correct word!!!! Woohoo !!! You correctly got the word %s",word);
    }

    public void losingMessage (String word) {
        System.out.printf("This is the incorrect word. The word was %s! Better luck next time",word);
    }
}
