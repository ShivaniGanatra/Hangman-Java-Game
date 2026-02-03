package org.example;

import java.util.ArrayList;

public class UserInput {
    ArrayList<String> lettersGuessed = new ArrayList<String>();

    public void initialMessage(String initialWord) {
        System.out.println("Hi user your word is " + initialWord);
    }

    public void askToEnterALetter(String word) {
        System.out.println("Can you enter a letter ");
    }

}
