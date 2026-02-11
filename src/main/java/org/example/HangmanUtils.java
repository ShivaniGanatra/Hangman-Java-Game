package org.example;


import java.util.ArrayList;

public class HangmanUtils {
    public void printOutputMessage(String hashedWord, ArrayList<String> lettersGuessed, int lives) {
        System.out.printf("""
            The current word is: %s\s
            the letters you have guessed include: %s\s
            You have %d lives remaining \n""",hashedWord,lettersGuessed,lives);
    } //put this in hangman utils

    public void printWinningMessage (String word) { //printWinningMessage
        System.out.printf("This is the correct word!!!! Woohoo !!! You correctly got the word %s",word);
    }

    public void printLosingMessage (String word) { //printGuessingMessage
        System.out.printf("This is the incorrect word. The word was %s! Better luck next time",word);
    }

    static String[] hangmanArray = {
        """
          _______
          |/     |
          |     (_)
          |     \\|/
          |      |
          |     / \\
          |
       ___|___
       """,
        """
          _______
          |/     |
          |     (_)
          |     \\|/
          |      |
          |     
          |
       ___|___
       """,
        """
          _______
          |/     |
          |     (_)
          |     \\|/
          |      
          |     
          |
       ___|___
       """,
        """
          _______
          |/     |
          |     (_)
          |    
          |     
          |     
          |
       ___|___
       """,
        """
          _______
          |/     |
          |     
          |    
          |     
          |     
          |
       ___|___
       """
    };
}
