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

        String initialWord;
        String hashedWord;

        String randomWord = hangmanWord.selectARandomWord();

        Words.convertWordToHash("hello");
        System.out.println( Words.convertWordToHash("hello"));
        System.out.println( Words.convertWordToHash("hHJllo"));

        System.out.println(Words.changeLetterToCapital("hello","l"));
//
//        System.out.println("random word = " + randomWord);
//
//        ArrayList<String> charAsArrayList = hangmanWord.convertWordToStringsArrayList("randomword");
//        System.out.println("wordAsArrayList ofStrings = " + charAsArrayList);

//        String inputLetter = "O".toLowerCase();
//        ArrayList<String> alteredWord = hangmanWord.changeLetterToCapital(charAsArrayList, inputLetter);
//        System.out.println("alteredWord" + alteredWord);
//        System.out.println("wordAsArrayList ofStrings = " + charAsArrayList);
//
//        ArrayList<String> alteredWordToHash = hangmanWord.convertArraylistToHashArraylist(alteredWord);
//        System.out.println("alteredWordToHash" + alteredWordToHash);
//        System.out.println("wordAsArrayList ofStrings = " + charAsArrayList);
//
//
//        System.out.println(charAsArrayList);
//        Boolean containsLetter = results.checkIfWordIncludesLetter(charAsArrayList,"a");
//        System.out.println(containsLetter);
//        System.out.println("wordAsArrayList ofStrings = " + charAsArrayList);
//        ArrayList<String> changeAgain = hangmanWord.convertArraylistToHashArraylist(charAsArrayList);
//        System.out.println(hangmanWord.convertArrayListToString(changeAgain));
//        System.out.println("wordAsArrayList ofStrings = " + charAsArrayList);
//        ArrayList<String> alteredWord2 = hangmanWord.changeLetterToCapital(charAsArrayList, "d");
//        System.out.println(alteredWord2);
//        System.out.println(hangmanWord.convertArraylistToHashArraylist(alteredWord2));
//        System.out.printf("hello \n %s ","shivani");

    }
}
