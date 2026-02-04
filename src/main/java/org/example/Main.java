package org.example;

import java.util.ArrayList;
import java.util.Scanner;


import static org.example.Hangman.hangman;
import static org.example.UserInput.lettersGuessed;
import static org.example.Words.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
            letter = String.valueOf(scanner.next().charAt(0)); //if there's more than one letter just get first lettr

            if(Character.isLetter(letter.charAt(0))){ //check if letter turned to character is a letter

                if(user.validInput(initialWord,letter)){ //if letter is in word
                    user.addToArrayList(letter);
                    initialWord = changeLetterToCapital(initialWord,letter);
                    hashedWord = convertWordToHash(initialWord);
                    results.outputMessage(hashedWord,lettersGuessed,lives);

                } else if(lettersGuessed.contains(letter)) { //check is letter has been used before

                    System.out.printf("You have entered %s before \n",letter);
                    lives -= 1;
                    results.outputMessage(hashedWord,lettersGuessed,lives);
                    System.out.println(hangman[lives]);

                } else { // letter but its incorrect
                    user.addToArrayList(letter);
                    lives -= 1;
                    results.outputMessage(hashedWord,lettersGuessed,lives);
                    System.out.println(hangman[lives]);
                }
            }

        }  if (initialWord.toUpperCase().equals(initialWord)) { // if someones won
            System.out.println("You've won");
        } else {
            System.out.printf("You've lost the word was %s", initialWord.toLowerCase());
        }

    }
}
