package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Words hangmanWord = new Words();
        Results results = new Results();
        for (String s : hangmanWord.wordList) {
            System.out.println(s);
        }

        String randomWord = hangmanWord.selectARandomWord();

        System.out.println("random word = " + randomWord);

        ArrayList<String> charAsArrayList = hangmanWord.convertWordToStringsArrayList("randomword");
        System.out.println("wordAsArrayList ofStrings = " + charAsArrayList);

        ArrayList<String> alteredWord = results.changeLetterToCapital(charAsArrayList, "o");
        System.out.println(alteredWord);

        ArrayList<String> alteredWordToHash = hangmanWord.convertWordToHash(alteredWord);
        System.out.println("alteredWordToHash" + alteredWordToHash);

        //String capitalisedCorrectLetter = results.changeLetterToCapital(charAsArrayList, "o");
        //System.out.println("capitalisedCorrectLetter " +capitalisedCorrectLetter);


        //String convertedWord = hangmanWord.convertWordToHash(capitalisedCorrectLetter);
        //System.out.println("converted word = " + convertedWord);

        //String alteredString = results.changeLetterToCapital(charAsArrayList,"O");
        //System.out.println("altered string" + alteredString);



    }
}
