package org.example;

import java.util.ArrayList;

public class User {

    private int lives = 5;

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public String getInputLetter() {
        return inputLetter;
    }

    public void setInputLetter(String inputLetter) {
        this.inputLetter = inputLetter;
    }

    private String inputLetter;

    public static ArrayList<String> lettersGuessed = new ArrayList<>(); //doesn't need to be static

    public void initialMessage(String initialWord) {
        System.out.println("Hi user your word is " + initialWord);
    }

    public Boolean validInput(String word, String letter) {
        return WordUtils.convertWordToStringsArrayList(word).contains(letter.toLowerCase()) && !(lettersGuessed.contains(letter));
    }

    public void addToArrayList(String letter) {
        lettersGuessed.add(letter);
    }

    public void askToEnterALetter() {
        System.out.println("Can you enter a letter? ");
    }

}
