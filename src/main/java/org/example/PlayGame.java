package org.example;

import java.util.Scanner;
import static org.example.HangmanUtils.hangmanArray;
import static org.example.User.lettersGuessed;
import static org.example.WordUtils.*;

public class PlayGame {
    private String initialWord = String.valueOf(WordUtils.selectARandomWord());// put everything in seprate class
    private String hashedWord = convertWordToHash(initialWord);

    User user = new User();
    Scanner scanner = new Scanner(System.in);
    HangmanUtils hangmanUtils = new HangmanUtils();

    public void playHangman(){
        user.initialMessage(hashedWord);
        while (user.getLives() > 0 && !(initialWord.toUpperCase().equals(initialWord))) {
            user.askToEnterALetter();
            user.setInputLetter(String.valueOf(scanner.next().charAt(0))) ;
            if(Character.isLetter(user.getInputLetter().charAt(0))){
                if(user.validInput(initialWord,user.getInputLetter())){
                    user.addToArrayList(user.getInputLetter());
                    initialWord = changeLetterToCapital(initialWord,user.getInputLetter());
                    hashedWord = convertWordToHash(initialWord);
                    hangmanUtils.printOutputMessage(hashedWord,lettersGuessed, user.getLives());

                } else if(lettersGuessed.contains(user.getInputLetter())) {
                    System.out.printf("You have entered %s before \n",user.getInputLetter());
                    user.setLives(user.getLives() - 1); ;
                    hangmanUtils.printOutputMessage(hashedWord,lettersGuessed,user.getLives());
                    System.out.println(hangmanArray[user.getLives()]);

                } else {
                    user.addToArrayList(user.getInputLetter());
                    user.setLives(user.getLives() - 1);
                    hangmanUtils.printOutputMessage(hashedWord,lettersGuessed,user.getLives());
                    System.out.println(hangmanArray[user.getLives()]);
                }
            }
        }  if (initialWord.toUpperCase().equals(initialWord)) { // if someone's won
            hangmanUtils.printWinningMessage(initialWord);
        } else {
            hangmanUtils.printLosingMessage(initialWord.toUpperCase());
        }
    };

}
