package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Words hangmanWord = new Words();
        for (String s : hangmanWord.wordList) {
            System.out.println(s);
        }

        String randomWord = hangmanWord.selectARandomWord();

        System.out.println("random word = " + randomWord);

        ArrayList<String> charAsArrayList = hangmanWord.convertWordToStringcharArrayList(randomWord);
        System.out.println("wordAsArrayList ofStrings = " + charAsArrayList);

        String convertedWord = hangmanWord.convertWord(charAsArrayList);
        System.out.println("converted word = " + convertedWord);

    }
}
