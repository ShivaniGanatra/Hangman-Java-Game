package org.example;

import java.util.Scanner;
import static org.example.Hangman.hangman;
import static org.example.UserInput.lettersGuessed;
import static org.example.Words.*;

public class Main {
    static void main() {
        UserInput user = new UserInput();
        Scanner scanner = new Scanner(System.in);

        Results results = new Results();
        String initialWord;
        String hashedWord;
        int lives = 5;
        String letter;

        initialWord = selectARandomWord();
        hashedWord = convertWordToHash(initialWord);

        user.initialMessage(hashedWord);
        while (lives > 0 && !(initialWord.toUpperCase().equals(initialWord))) {
            user.askToEnterALetter();
            letter = String.valueOf(scanner.next().charAt(0));
            if(Character.isLetter(letter.charAt(0))){
                if(user.validInput(initialWord,letter)){
                    user.addToArrayList(letter);
                    initialWord = changeLetterToCapital(initialWord,letter);
                    hashedWord = convertWordToHash(initialWord);
                    results.outputMessage(hashedWord,lettersGuessed,lives);

                } else if(lettersGuessed.contains(letter)) {
                    System.out.printf("You have entered %s before \n",letter);
                    lives -= 1;
                    results.outputMessage(hashedWord,lettersGuessed,lives);
                    System.out.println(hangman[lives]);

                } else {
                    user.addToArrayList(letter);
                    lives -= 1;
                    results.outputMessage(hashedWord,lettersGuessed,lives);
                    System.out.println(hangman[lives]);
                }
            }
        }  if (initialWord.toUpperCase().equals(initialWord)) { // if someones won
            results.winningMessage(initialWord);
        } else {
            results.losingMessage(initialWord.toUpperCase());
        }
    }
}
